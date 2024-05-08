package com.kotlin.kotlinboot.abstractclass

/**
 * 코틀린에서 추상 클래스
 * */
abstract class Animal(
        val species: String,
        open val legCount: Int){

    abstract fun move()
}
