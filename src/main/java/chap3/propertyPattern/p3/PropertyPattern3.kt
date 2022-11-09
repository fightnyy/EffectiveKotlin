package chap3.propertyPattern

import kotlin.reflect.KProperty

class Delegator(var value: Int) {
    // thisRef : 위임을 사용하는 클래스와 같은 타입이거나 Any 타입이어야 합니다.

    operator fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        val person = thisRef as Person
        println(
            """
            name: ${person.name}
            age: ${person.age}
            salary: ${person.salary}
        """.trimIndent()
        )
        println("${property.name} get! $value")
        return value
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, newValue: Int) {
        println("${property.name} set! $newValue")
        value = newValue
    }
}

class Person(val name: String, age: Int, salary: Int) {
    var age: Int by Delegator(age)
    var salary: Int by Delegator(salary)
}

fun main() {
    val p = Person("monguse", 20, 2000)
    p.age = 21
    p.salary = 2100
    println(p.name)
    println(p.age)
    println("${p.name} - age: ${p.age}, salary: ${p.salary}")
}

