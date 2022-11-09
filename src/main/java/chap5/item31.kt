package chap5

fun <T> Collection<T>.powerset(): Set<Set<T>> = powerset(this, setOf(setOf()))


private tailrec fun <T> powerset(
    left: Collection<T>,
    acc: Set<Set<T>>
): Set<Set<T>> = when {
    left.isEmpty() -> acc
    else -> {
        val head = left.first()
        val tail = left.drop(1)
        powerset(tail, acc + acc.map { it + head })
    }
}
