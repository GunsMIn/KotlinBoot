package com.kotlin.kotlinboot.service

val number = 4
//코틀린에서는 암시적 타입 변격이 불가능하다.
//자바에서는 더큰 타입으로는 암시적 변경이 가능했음.
//코틀린에서는 타입변경읋 to변환타입() 을 사용하여 가능.
val number2: Long = number.toLong()