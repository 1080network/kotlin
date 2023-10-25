package io.mica.kotlin.examples

import java.io.ByteArrayInputStream
import java.util.Base64

fun loadPem(pemVariable: String) : ByteArrayInputStream {
    val pemString = System.getenv(pemVariable)
    return pemString?.let { s ->
        Base64.getDecoder().decode(s).let {
            ByteArrayInputStream(it)
        }
    }?:throw IllegalStateException("pem environment variable not found")
}