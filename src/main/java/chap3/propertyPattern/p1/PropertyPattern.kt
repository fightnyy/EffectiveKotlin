package chap3.propertyPattern.p1

// 위임 프로퍼티란, 프로퍼티 필드에 접근하는 접근자 로직을 다른 객체에 맡기는 방식을 말합니다.
// 즉, 게터와 세터 메서드를 가지는 다른 객체를 만들어서 그 객체에 프로퍼티의 필드 접근 로직을 위임하는 방식입니다.

class Person(val name: String, val _age: Int, val _salary: Int) {
    var age: Int = _age
        get() {
            println("age get! ${field}")
            return field
        }
        set(value) {
            println("age set! $value")
            field = value
        }

    var salary: Int = _salary
        get() {
            println("name get! ${field}")
            return field
        }
        set(value) {
            println("name set! ${value}")
            field = value
        }
}

fun main(args: Array<String>) {
    val p = Person("Monguse", 20, 2000)
    p.age = 21
    p.salary = 2100
    println("${p.name} - age: ${p.age}, salary: ${p.salary}")
}