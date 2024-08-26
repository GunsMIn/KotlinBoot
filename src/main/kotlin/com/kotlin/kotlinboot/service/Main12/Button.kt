package com.kotlin.kotlinboot.service.Main12

class Button : Clickable {
    //이 함수는 상위 클래스에서 선언된 메서드를 오버라이드한 것 이다.
    override fun click() =
        TODO("Not yet implemented")

    fun disable(){} // 이 함수는 파이널이다. 하위 클래스가 이메서드를 오버라이드 할 수 없다.

    open fun animate(){} //이 함수는 열려있다. 하위 클래스에서 이메서드를 오버라이드 할 수 있다.
}