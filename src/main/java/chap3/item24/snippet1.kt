package chap3.item24

class Cup<T> // 타입 파라미터 T는 variance 한정자(out 또는 in) 가 없으므로, 기본적으로 invariant(불공변성) 입니다.


fun main() {
//    val anys: Cup<Any> = Cup<Int>
//    val nothings: Cup<Nothing> = Cup<Int>
}
