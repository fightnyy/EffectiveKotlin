package chap3.item21

import kotlin.jvm.Throws
import kotlin.reflect.KProperty

var token: String? by LoggingProperty(null)

var attempts: Int by LoggingProperty(0)

private class LoggingProperty<T>(var value: T) {

    operator fun getValue(
        thisRef: Any?,
        prop: KProperty<*>
    ): T {
        print("${prop.name} returned value $value")
        return value
    }

    operator fun setValue(
        thisRef: Any?,
        prop: KProperty<*>,
        newValue: T
    ) {
        val name = prop.name
        print("$name changed from $value to $newValue")
        value = newValue
    }
}


interface Animal

interface GoodTempered

fun <T> pet(animal: T) where T : Animal, T : GoodTempered {

}

class B : Animal, GoodTempered

fun main() {
    val b = B()
    pet(b)
}


interface HasField {
    val field: String?
}

data class ClassA constructor(val A: String = "fieldA") : HasField {
    override val field: String? = null

}

data class ClassB(val B: String? = null) : HasField {
    override val field: String? = null

}

//private fun <T> mapSomething(model: T): String where T : ClassA, T : ClassB {
//
//}