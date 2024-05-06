package com.kotlin.kotlinboot.service

import java.lang.NumberFormatException

fun parseIntOrThrow(number: String): Int? {

    return try {
        number.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}