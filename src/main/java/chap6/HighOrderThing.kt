package chap6

import chap3.propertyPattern.Delegator

fun someMethod(a: Int, func: () -> Unit): Int {
    func()
    return 2 * a
}

data class Person(val name: String,val age: Int)

fun main() {
    val result = someMethod(2) { println("Just some dummy function") }
    println(result)

    val people = listOf(Person("Alice", age = 27), Person("BoB", 27), Person("John", 30))
    println(people.groupBy { it.age })

    println("#############")
    val strings = listOf("abc", "def")
    println("strings = ${strings}")
    println(strings.map { it.toList() }.flatten())

}

