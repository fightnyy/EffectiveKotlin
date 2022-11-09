package chap3.propertyPattern.mymap

// Map, MutableMap 인터페이스에는 프로퍼티명을 이용한 getValue() 와 setValue() 가 구현되어 있어
// 위임 프로퍼티에 사용할 수 있습니다.
class Person(val map: MutableMap<String, Any?>) {
    val name: String by map
    val age: Int by map
    var salary: Int by map
}

fun main() {
    val p = Person(mutableMapOf("name" to "monguse", "age" to 20, "salary" to 2000))
    p.salary = 2100
    println("name: ${p.name}, age: ${p.age}, salary: ${p.salary}")

}