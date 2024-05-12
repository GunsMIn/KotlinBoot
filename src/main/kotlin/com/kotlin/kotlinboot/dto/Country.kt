package com.kotlin.kotlinboot.dto


/**
 * 코틀인에서 enum 을 통한 분기 처리를 할 때
 * when을 사용하면 조금 더 읽기 쉬운코드로 짤 수 있다.
 * 컴파일러가 이넘에대한 모든 정보를 알고 있기 때문에
 * else 문을 안써도 된다.
 * */
fun handleCountry(country: Country): Country {
    return when (country) {
        Country.KOREA -> Country.KOREA
        Country.AMERICA -> Country.AMERICA
    }
}

enum class Country(private val code:String) {
    KOREA("KO"),
    AMERICA("US");
}