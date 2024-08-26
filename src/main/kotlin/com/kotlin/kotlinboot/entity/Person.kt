package com.kotlin.kotlinboot.entity

import java.lang.IllegalArgumentException
import java.util.*

fun main() {
    val person = Person("김건우", 100,"서울")
    println(person.name)
    person.age = 30
    println(person.age)
    println(person.isChild)

    val person2 = Person("kim","서울")
    println(person2.name)
}

class Person(
    val name: String,
    var age: Int,
    val address: String
) {


    // init 블록 -> 클래스가 초기화 되는 시점에 한번 호춯 되는 블록
    init {
        if (age < 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    //자바처럼 클래스안에서 메서드를 만들 수 있다 (validation 체크시)
    fun isAdult(): Boolean {
        return this.age >= 20
    }

    //코틀린에서는 또 커스텀 getter,setter 프로퍼티로도 만들 수 있다.
    //isChild 프로퍼티를 get 했을때
    val isChild: Boolean get() = this.age < 19


    // 생성자를 하나 이상 만들때는 블록안에서 constructor키워드로 만든다.
    // 부생성자 -> 최종적으로 주생성자를 호출해야한다.!!
    constructor(name: String, address: String) : this(name, 1, address)


//    커스텀 게터
//     field 예약어 사용해야함 (backing field) -> 자기 자신을 가르키는 필드
//    val name = name
//        get() = field.uppercase(Locale.getDefault())

//    커스텀 세터
//    var name: String = name
//        set(value) {
//            field = value.toUpperCase()
//        }
}