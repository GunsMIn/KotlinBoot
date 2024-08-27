package com.kotlin.kotlinboot.atomicKotlin.dataTypes

fun isDigit(ch: Char) = ch in '0'..'9'

fun notDigit(ch: Char) = ch !in '0'..'9'

fun main(){
    println(isDigit('a'))
    println(isDigit('1'))
    println(notDigit('z'))
}