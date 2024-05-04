package com.kotlin.kotlinboot.service

import java.lang.IllegalArgumentException

fun main(){
    //user?.getId() 는 if (user != null) { user.getId() } else { null } 과 동일
    //https://0391kjy.tistory.com/51
    val str: String? = "ABC"
    //SAFE CALL -> NULL 이지 않을 경우에만 호출해줘
    println(str?.length)

    val str2: String? = null
    println(str2?.length)

    //ELVIS 연산자(?:) : 앞의 결과가 NULL 이면 뒤의 값 사용
    val str3: String? = null
    println(str2?.length ?: 0)

    println(startWith1("ABC"))
    println(startWith2("ABC"))
    println(startWith3("ABC"))
    println(startWith4("ABC"))
    println(startWith5("ABC"))
    println(startWith6("ABC"))
    println(startWith7("ABC"))


}

//safe call 과 elvis 연산자 사용하기 전 메서드
fun startWith1(str : String?) : Boolean {

    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다.")
    }
    return str.startsWith("A")
}

fun startWith2(str: String?): Boolean? {
    if (str == null) {
        return null
    }
    return str.startsWith("A")
}

fun startWith3(str: String?): Boolean {

    if (str == null) {
        return false
    }
    return str.startsWith("A")
}


//safe call 과 elvis 연산자 사용한 메서드
fun startWith4(str : String?) : Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startWith5(str: String?): Boolean? {
    //safe call 은 앞의 변수가 null 이면 그대로 null 이된다.
    return str?.startsWith('A')

}

fun startWith6(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}


// early return 도 가능
fun early(param : Int) : Int {
    var answer = 100
    //param이 null 이면 바로 리턴
   param ?: return 0
    return answer
}


// null이 아님을 단언 -> !!
fun startWith7(str: String?): Boolean {
    return str!!.startsWith("A")
}
