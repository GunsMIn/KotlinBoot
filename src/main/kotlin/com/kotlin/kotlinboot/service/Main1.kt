package com.kotlin.kotlinboot.service

fun main(){

    //수정가능여부 확인
    var number1 = 10L
    number1 = 5L
    val number2 = 10L

    val number3: Long
    number3 = 7L
    println(number3)

    var number4: Long? = 1000L
    number4 = null

}

/**
 * 이 함수의 반환 타입은 Boolean입니다.
 * 이 함수는 str이 null이 아니고 "A"로 시작하면 true, 시작하지 않으면 false를 반환합니다.
 * str이 null이면 예외가 발생합니다.
 * */
fun startWithA1(str: String?) : Boolean{
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔음")
}

/**
 * 이 함수의 반환 타입은 Boolean?입니다.
 * 이 함수는 str이 null이 아닌 경우 startsWith("A")의 결과(true 또는 false)를 반환하며,
 * str이 null인 경우 null을 반환합니다.
 * */
fun startWithA2(str: String?) : Boolean?{
    return str?.startsWith("A")
}


