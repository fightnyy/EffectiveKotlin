package chap3.item21

class Delegator(val fname: String) {
    var value: Int = 0
    fun getMethod(): Int {
        println("$fname get! $value")
        return value
    }

    fun setMethod(newValue: Int) {
        println("$fname set! $newValue")
        value = newValue
    }
}

class Person(val name: String) {
    val ageDelegator = Delegator("age")
    val salaryDelegator = Delegator("salary")

    var age: Int
        get() = ageDelegator.getMethod()
        set(value) = ageDelegator.setMethod(value)

    var salary: Int
        get() = salaryDelegator.getMethod()
        set(value: Int) = salaryDelegator.setMethod(value)
}