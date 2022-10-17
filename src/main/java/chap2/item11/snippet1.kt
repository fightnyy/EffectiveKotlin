package chap2.item11


class Person {
    val age: Int = 0
    val isAdult = age > 0
}

class View {
    fun showPerson(person: Person) {

    }

    fun showError() {

    }
}

fun main() {
    val person: Person = Person()
    val view: View = View()
    if (person != null && person.isAdult) {
        view.showPerson(person)
    } else {
        view.showError()
    }

    person?.takeIf { it.isAdult }
        ?.let(view::showPerson)
        ?: view.showError()
}