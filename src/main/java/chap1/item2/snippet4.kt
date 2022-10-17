package chap1.item2

fun main() {
//    var numbers = (2..100).toList()
//    val primes = mutableListOf<Int>()
//    while (numbers.isNotEmpty()) {
//        val prime = numbers.first()
//        primes.add(prime)
//        numbers = numbers.filter { it % prime != 0 }
//    }
//    print(primes)
    val primes: Sequence<Int> = sequence {
        println("1")
        var numbers = generateSequence(2) { it + 1 } // 2 부터 1싹 더해 가면서 Sequence 를 생성한다.
//        while (true) { // take 와 yield 의 조합으로 while(true) 를 사용해도 무한 루프를 돌지 않는다.
//            val prime = numbers.first()
//            yield(prime)
        println("2")
        numbers = numbers.drop(1) // drop(1) 1개 씩 제거하는 것
        println("numbers = ${numbers.toList()}")
//        }
    }
    print(primes.take(10).toList()) // 소수를 10 개 가져온다
}


