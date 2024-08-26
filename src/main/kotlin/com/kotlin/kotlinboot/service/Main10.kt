package com.kotlin.kotlinboot.service

import com.kotlin.kotlinboot.entity.Person

fun printAgeifPerson(any: Any?) {
    if (any is Person) {
        val person = any as Person
        println(person)
    }
}