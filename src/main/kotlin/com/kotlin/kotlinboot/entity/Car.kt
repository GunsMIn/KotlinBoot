package com.kotlin.kotlinboot.entity

class Car(
        internal val name: String,
        private var owner: String,
        _price: Int
) {
    //getter는 별도의 접근 제한자가 지정되지 않았기 때문에 기본적으로 public
    //setter는 private으로 설정
    var _price = _price
        private set
}