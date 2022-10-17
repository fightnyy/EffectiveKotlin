class Person(val name: String)

var person: Person? = null

fun printName() {
    person?.let { print(it.name) }
}

fun main() {
    val persons = listOf(Person("a"), Person("b"), Person("a"), Person("b"), Person("a"), Person("b"))
    print(persons.filter { it.name == "a" }.joinToString { "Match" })
    println()
    println("---------")
    persons.filter { it.name == "a" }.joinToString { "Match" }.let(::print)

    var abc = "A" {"B"} and "C"

}

operator fun String.invoke(f: () -> String): String = this + f()

infix fun String.and(s: String) = this + s