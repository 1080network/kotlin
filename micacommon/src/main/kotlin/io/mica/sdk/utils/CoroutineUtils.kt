package io.mica.sdk.utils

import java.util.concurrent.CancellationException

//resultOf is the equivalent of running Result but it will understand cancellations properly
inline fun <R> resultOf(block: () -> R): Result<R> {
    return try {
        Result.success(block())
    } catch (e: CancellationException) {
        throw e
    } catch (e: Exception) {
        Result.failure(e)
    }
}

//resultOf is the equivalent of running Result but it will understand cancellations properly
inline fun <T, R> T.resultOf(block: T.() -> R): Result<R> {
    return try {
        Result.success(block())
    } catch (e: CancellationException) {
        throw e
    } catch (e: Exception) {
        Result.failure(e)
    }
}