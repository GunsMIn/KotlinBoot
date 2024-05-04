package com.kotlin.kotlinboot.service


fun main() {
    // 코틀린에서는 명시적으로 형변화 해줘야한다.
    val num1 = 10
    val num2: Long = num1.toLong()

    //
    val number1: Int? = 3
    val number2: Long = number1?.toLong() ?: 0L

    //
    printAgeIfPersonUseSafecall(null)


    //
    val str = """
        RJALKJRSLDKJASKL;FJ
        SDFAKJFKL;SDJF;ASDKLJF
        SDFKLDSFJKLDFJKSDJF
        ADFSKLJDFASLKJFA
    """.trimIndent()

}

//스마트 캐스트
//'is'는 타입 검사 후 컴파일러가 자동으로 형변환 (캐스팅) -> 자동으로 검사한 타입으로 취급
fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        val person = obj // 스마트 캐스트 적용 부분 ( 이미 스마트캐스팅 때문에 Person 타입이 됨)
        println(person.age)
    }
}

fun printAgeIfPersonUseSafecall(obj : Any?) {

    //obj가 null이 아니면 Person 타입으로 형변환 하고 , null이면 null 반환
    val person = obj as? Person
    println(person?.age)
}

