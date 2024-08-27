package com.kotlin.kotlinboot.atomicKotlin.dataTypes

fun main() {
    val r1 = IntRange(0, 10)
    val r2 = IntRange(10, 20)

    val sum = r1.sum()

    println(r1)
    println("-")
    println(r2)
    println("-")
    println(sum)

}