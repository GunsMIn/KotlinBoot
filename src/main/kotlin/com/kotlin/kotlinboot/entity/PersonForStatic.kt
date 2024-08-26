package com.kotlin.kotlinboot.entity

class PersonForStatic private constructor(
        private val name: String,
        private val age: Int,
) {

    /**
     * 자바에서는 static이 있지만
     * 코트린에서는 동행객체 companion object 를 사용한다.
     * 동행객체 : 클래스와 동행하는 유일한 오브젝트
     *
     * const 를 붙이면 컴파일시에 변수가 할당된다. 안붙이면 런ㅌ타임시 할ㄷㅇ
     */
    companion object {
        private const val MIN_AGE = 1
        fun newBaby(name: String): PersonForStatic {
            return PersonForStatic(name, MIN_AGE)
        }
    }

    override fun toString(): String {
        return "나는 ${name}이고 ${age}살이야"
    }

}



fun main() {
    println(PersonForStatic.Companion.newBaby("김건우"))

}