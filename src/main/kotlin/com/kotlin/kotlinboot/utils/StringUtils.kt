package com.kotlin.kotlinboot.utils

fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}