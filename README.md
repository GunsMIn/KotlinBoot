# 코틀린 뛰어들기

### Lec 01 . 코틀린에서 변수를 다루는 방법 
- 모든 변수는 var / val 를 붙여 주어야 한다.
  - var : 변경 가능하다 / val : 변경 불가능한다 (read-only)
- 타입을 명시적으로 작성하지 않아도 , 타입이 추론된다.
- Primitive type 과 Reference type 을 구분하지 않아도 된다.
- Null이 들어갈 수 있는 변수는 타입뒤에 ? 를 붙여주어햐 한다.
  - 아예 다른 타입으로 간주된다.
- 객체를 인스턴스화할때 new를 붙이지 않아야한다.    

### Lec 02 . 코틀린에서 null을 다루는 방법 
- 코틀린에서 null이 들어갈 수 있는 타입은 완전히 다르게 간주된다. -> nullable type
  - 한번 null 검사를 하면 non-null 임을 컴파일러가 알 수 있다.
- null이 아닌 경우에만 호출되는 Safe call(?.)이 있다. 
- null인 경우에만 호출되는 Elvis 연산자(?:)가 있다.
- null이 절대 아닐때 사용할 수 있는 널 아님 단언(!!)이 있다.
- Kotlin에서 Java 코드를 사용할 때 플랫폼 타입 사용에 유의해야한다
  - Java 코드를 읽으며 널 가능성 확인    

### Lec 03 . 코틀린에서 type을 다루는 방법 
- 코틀린의 변수는 초기값을 보고 타입을 추론하며 , 기본 타입들 간의 변환은 명시적으로 이루어진다
- 코틀린에서는 is, !is, as ,as? 를 이용해 타입을 확인하고 캐스팅한다.
- 코틀린의 Any는 Java의 Object 같은 최상위 타입이다.
- 코틀린의 Unit은 Java의 void와 동일하다.
- 문자열에서 문자를 가져올때 배열처럼 []를 이용한다. (java에서는 .charAt()을 사용함)

### Lec 04 . 코틀린에서 연산자를 다루는 방법 
- 단항연산자, 산술연산자, 산술대입연산자 Java와 똑같다
- 객체끼리의 연산자를 직접 정의할 수 있다.

### Lec 05 . 코틀린에서 조건문을 다루는 방법 
- if / if - else / if -else 모두 잡오 문법이 동일하다.
- 단 Kotlin에서는 Expression으로 취급된다. (때문에 코틀린에서는 삼항연산자가 없다.)
- 자바에서의 swith는 코틀린에서 when으로 대체되었다 (when 은 더 강력한 기능을 갖는다.)
  
### Lec 06 . 코틀린에서 반복문을 다루는 방법 
- for each 문에서 Java는 : Kotlin은 in을 사용한다.
- 전통적인 for 문에서 Kotlin은 등차수열과 in을 사용한다.
- while문은 놀랍도록 동일하다.
    
### Lec 07 . 코틀린에서 예외를 다루는 방법 
- try catch finally 구문은 문법적으로 완전히 동일한다.
  - kotlin 에서는 try-catch 가 expression이다.
 - kotlin에서 모든 예외는 Unchecked Exception이다.

### Lec 08 . 코틀린에서 함수를 다루는 방법 
- 함수의 문법은 자바와 다르자!
  - 접근지시어 fun 함수이름(파라미터) : 반환타입 {} 
- body가 하나의 값으로 간주되는 경우 block을 없앨 수도 있고  block이 없다면 반환 타입을 없앨 수도 있다.
- 함수를 호출할 때 특정 파라미터를 지정해줄 수 있다.

### Lec 09 . 코틀린에서 클래스를 다루는 방법 
-  코틀린에서는 필드를 만들면 getter와 setter가 자동으로 생긴다.
  - 때문에 이를 프로퍼티라고 부른다.
- 코틀렌에서는 주생성자가 필수이다.
- 코틀린에서는 consturctor 키워드를 사용해 부생성자를 추가로 만들 수 있다.
  - 단 , default parameer나 정적 팩토리 메소드를 추천한다.
- 실제 메모리에 존재하는 것과 무관하게 custom getter와 custom setter를 만들 수 있다.(프로퍼티인것처럼 custom getter를 사용할 수 있다.)
- custom getter와 custom setter에서 무한루프를 막기 위해 field라는 키ㅝ드를 사용한다.
  -이를 backing field 라고 부른다.

### Lec 10 . 코틀린에서 상속을 다루는 방법 
- 상속 또는 구현을 할때에 : 를 사용해야한다. 
- 상위 클래스 상속을 구현할 때 생성자를 반드시 호출해야 햔다.
- 추상 멤버가 아니면 기본적으로 오버라이드가 불가능한다.
  - open을 사용해주어야한다.

### Lec 11 . 코틀린에서 접근제어를 다루는 방법 
- public : 모든 곳에서 접근 가능
- protected : 선언된 클래스 또는 하위 클래스에서만 접근가능
- internal : 같은 모듈에서만 접근 가능
- private : 선언된 클래스 내에서만 접근 가능
- 코틀린에서의 패키지는 namespace 관리용이기 때문에 , protected는 의미가 달라졌다.
- 코틀린에서는 default가 사라지고 , 모듈간의 접근을 통제하는 internal이 새로 생겼다.
- 생성자에 접근제어자를 붙이 때는 constructor를 명시적으로 써주어야한다.

### Lec 12 . 코틀린에서 object 키워드를 다루는 방법 
- java의 static 변수와 함수를 만들려면 , kotlin에서는 companion object를 사용한다.
- companion object도 하나의 객체로 간주되기 때문에 이름을 붙일 수 잇고, 다른 타입을 상속 받을 수도 있다.
- kotlin에서 싱긅톤 클래스를 만들 때 object 키워드를 사용한다.
  
### Lec 13 . 코틀린에서 다양한 클래스를 다루는 방법 
- Kotlin의 Data class를 사용하면 equals, hashCode, toString을 자동으로 만들어준다.
- Kotlin의 Enum Class는 Java의 Enum Class와 동일하지만 when 과 함께 사용함으로써 큰 장점을 갖게 된다.
- Enum Class보다 유연하지만 , 하위 클래스를 제한하는 Sealed Class 역시 when과 함께 주로 사용된다.
