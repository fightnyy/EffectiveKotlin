package chap1

val a = 1



fun fizz() {
    val b = 2
    print(a + b)
}

val buzz = {
    val c = 3
    print(a + c)
}


fun main() {
    val users: List<User> = mutableListOf()
    var user: User // 변수 user 는 for 반복문 스코프 내부뿐 아니라 외부에서도 사용 가능합니다.

    for (i in users.indices) {
        user = users[i]
        print("User at $i is $user")
    }

    for ( i in users.indices) {
        val user = users[i] // 조금 더 좋은 예: user 스코프를 내부뿐 아니라 for 반복문 내부로
        print("User at $i is $user")
    }

    for ((i, user) in users.withIndex()) {
        print("User at $i is $user")
    }

}