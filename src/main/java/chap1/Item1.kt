package chap1

import java.lang.Exception
import kotlin.jvm.Throws
import kotlin.properties.Delegates

class BankAccount {
    var balance = 0.0
        private set

    fun deposit(depositAmount: Double) {
        balance += depositAmount
    }

    @Throws(InsufficientFunds::class)
    fun withdraw(withdrawAmount: Double) {
        if (balance < withdrawAmount) {
            throw InsufficientFunds()
        }
        balance -= withdrawAmount
    }
}

class InsufficientFunds : Exception()

val account = BankAccount()
fun main() {
//    println(account.balance - 10)
//
//    val list1: MutableList<Int> = mutableListOf()
//    var list2: List<Int> = listOf()
//
//    list1.add(1)
//    list2 = list2 + 1
//
//    list1 += 1 // list1.plusAssign(1) 로 변경됩니다.
//    list2 += 1 // list2.plus(1) 로 변경됩니다.
//
//    list1.plusAssign(1) // 구체적인 리스트 구현 내부에 변경 가능 지점이 있습니다.
//    list2.plus(1) // 프로퍼티 자체가 변경 가능 지점; 멀티스레드 처리의 안정성이 더 좋다
//
//    val list = mutableListOf<Int>()
//    for (i in 1..1000) {
//        thread {
//            list += i
//        }
//    }
//    Thread.sleep(1000)
//    print(list.size)

    var names by Delegates.observable(listOf<String>())
        { _, old, new -> println("Names changed from ${old} to ${new}") }
    names += "Fabio"
    // names 가 [] 에서 [Fabio]로 변합니다.
    names += "Bill"
    // names 가 [Fabio] 에서 [Fabio, Bill] 로 변합니다.

    var dont = mutableListOf<Int>()
    dont += 1 // 모호성 발생안하고 plusAssign 으로 사용됩니다.; mutableListOf 방식으로 됩니다.

}

data class User(val name: String) {

}
class UserRepository {
    private val storedUsers: MutableMap<Int, String> =
        mutableMapOf()

    fun loadAll(): Map<Int, String> { // return 을 Map 으로 업캐스팅 하면 가변성을 제한 할 수 있다.
        return storedUsers
    }
}

class UserHolder {
    fun get(): User {
        return User("Nice").copy()
    }
}


