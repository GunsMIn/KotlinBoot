package com.kotlin.kotlinboot.entity

import com.kotlin.kotlinboot.abstractclass.Animal
import com.kotlin.kotlinboot.`interface`.Flyable
import com.kotlin.kotlinboot.`interface`.Swimable

class Penguin(species: String) : Animal(species,2),Swimable,Flyable {

    private val wingCount: Int =2
    override fun move() {
       println("펭귄이 움직임")
    }

    //Animal클래스의 legCount 프로퍼티에 open을 붙여야한다.
    override val legCount: Int
        get() = super.legCount + this.wingCount
    override val swimAblity: Int
        get() = 3

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }





}