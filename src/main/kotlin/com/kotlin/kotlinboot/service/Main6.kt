package com.kotlin.kotlinboot.service

fun main() {

    val listOf = listOf(1L, 2L, 3L)
    /**
     * 향상된 for 문
     * */
    for (number in listOf) {
        println(number)
    }


    //forn문
    for (i in 1..3) {
        println(i)
    }

    //forn문 (내려가는 경우)
    for (i in 3 downTo 1) {
        println(i)
    }

    //forn문 (2씩 올라가는 경우)
    for (i in 1..5 step 2) {
        println(i)
    }
}