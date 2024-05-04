package com.kotlin.kotlinboot.service

import java.lang.IllegalArgumentException

//void -> unit (생략됨)
fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다.")
    }
}

/**
 * Kotlin의 특징 중 하나인 "식(expression)"과 관련
 */
fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}


/**
 * 아래의 메서드는 코틀린에서 지원해주는 in 조건을 사용하여 만든 메서드이다
 *
 */
fun validateScore(score:Int) {
    if (score in 0..100) {
        throw IllegalArgumentException("범위는 0~100 까지 입니다.")
    }
}

/**
 * 코틀린에서 가장 감동받은 부분
 * 자바에서 switch 문이 when 으로 대체되었는데
 * 람다식을 아주 제대로 사용하고 간결해짐
 * */
fun getGradeWithSwtch(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        6 -> "D"
        else -> "F"
    }
}

/**또한 조건분에는 어떠한 expression이라도 들어갈 수 있다.*/
fun startsWith(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

/**
 * 또한 코틀린의 when 문에서는 () 안에 아무것도 안들어가게 작성할수도있다.
 * */
fun judgeNumber(number: Int) {
    when {
        number == 0 -> println("0입니다.")
        number % 2 == 0 -> println("짝수입니다.")
        else -> println("홀수입니다.")
    }
}