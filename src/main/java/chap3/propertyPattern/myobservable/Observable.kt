package chap3.propertyPattern.myobservable

import kotlin.properties.Delegates

// 프로퍼티에 값이 할당될 때 처리할 메서드를 등록할 수 있는 메서드입니다.
// observable 메서드는 람다 식을 파라미터로 전달받아 setValue() 메서드가 구현된 객체를 반환합니다.

class Person(val name: String, age: Int, salary: Int) {
    var age: Int by Delegates.observable(age) { property, oldValue, newValue ->
        println("${property.name} set! $oldValue -> $newValue")
    }

    var salary: Int by Delegates.observable(salary) { property, oldValue, newValue ->
        println("${property.name} set! $oldValue -> $newValue")
    }
}


fun main() {
    val p = Person("Monguse", 20, 2000)
    p.age = 21
    p.salary = 2100
}