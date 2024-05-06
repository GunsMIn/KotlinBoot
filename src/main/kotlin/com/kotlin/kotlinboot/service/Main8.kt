package com.kotlin.kotlinboot.service

fun main() {

    repeat("hello world")
    println("---------------")
    repeat("hello world",4)
    println("---------------")
    repeat("hello world ", useNewLine = false) // named Argument 매개변수 이름으 통해 직접 지정
}

/**
 * 큰 숫자를 반환하는 메서드
 * 1.함수가 하나의 결과값이면 block 대신 = 사용가능
 * 2.한줄로 변경 가능
 * 3.어떠한 경우건 Int을 반환 하기 때문에 타입 생략 가능
 * 4.block 를 사용하는 경우에는 반환 타입이 Unit이 아니면 명시적으로 작성해줘야함
 */
fun max(a: Int, b: Int) = if (a > b) a else b

/**
 * 디폴트 파라미터 : 밖에서 파라미터를 넣어주지 않으면 기본값을 사용한다는 개념
 * 자바에서는 만약에 repeat 메서드에서 num값에는 3 useNewLine 값에는 true가 많이 사용되어 진다면
 * 메서드 오버로딩을 통해 코드의 반복을 줄일 수 있었다.
 * 하지만 코틀린데서는 디폴트 파라미터를 지원하여 그 점을 보완하였다.
 * */
fun repeat(str: String,
           num: Int = 3,
           useNewLine: Boolean = true) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

