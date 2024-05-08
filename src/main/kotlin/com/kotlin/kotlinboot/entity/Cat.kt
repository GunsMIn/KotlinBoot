package com.kotlin.kotlinboot.entity

import com.kotlin.kotlinboot.abstractclass.Animal

/**
 * 바로 상위 클래스의 생성자를 호출해주어야한다.
 * */
class Cat(species: String) : Animal(species,4) {
    override fun move() {
       println("고양이가 움직인다.")
    }

}