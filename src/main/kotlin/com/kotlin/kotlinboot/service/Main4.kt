package com.kotlin.kotlinboot.service

fun main() {
    val money1 = JavaMoney(1000L)
    val money2 = money1
    val money3 = JavaMoney(1000L)

    println(money1==money2)
    println(money1===money2)
    println(money1==money3)
    println(money1===money3)
}