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
   

