package com.kotlin.kotlinboot.service

import com.kotlin.kotlinboot.entity.Person
import kotlin.time.Duration.Companion.milliseconds

fun saveUserV1(person: Person){

    if (person.name.isEmpty()) {
        throw IllegalArgumentException("user name cannot be empty")
    }

    if (person.address.isEmpty()) {
        throw IllegalArgumentException("user address cannot be empty")
    }

}

fun saveUserV2(person: Person) {

    fun validateString(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("${fieldName} must not be empty")
        }
    }

    validateString(person.name, "name")
    validateString(person.address, "address")
}

