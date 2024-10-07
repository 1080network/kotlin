#!/bin/bash

rm -rf micacommon/src/main/proto/*
mkdir -p micacommon/src/main/proto
cp -r proto/micashared micacommon/src/main/proto/.

SDKS='discount partner serviceprovider'
for sdk in $SDKS ; do
  rm -rf $sdk/src/main/proto/*
  mkdir -p $sdk/src/main/proto/mica
  #cp -r proto/validate  $sdk/src/main/proto/.
  cp -r proto/mica/$sdk $sdk/src/main/proto/mica/.
  if [[ $sdk == 'serviceprovider' ]] ; then
    mkdir -p serviceprovider/src/main/proto/mica/discount/discount
    cp -r proto/mica/discount/discount/* serviceprovider/src/main/proto/mica/discount/discount/.
  fi
done

./gradlew clean
