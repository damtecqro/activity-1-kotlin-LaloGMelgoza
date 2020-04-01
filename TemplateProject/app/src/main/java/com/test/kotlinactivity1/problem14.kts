/*
*  Eduardo Gonzalez Melgoza
*  A01701446
* */


tailrec fun <X> dupli(x: List<X>, output: List<X> = emptyList()): List<X> {
    return when {
        x.isEmpty() -> output
        else -> duplicate(x.drop(1), output + x.first() + x.first())
    }
}

fun main() {
    println(duplicate(listOf("a", "b", "c", "c", "d")))
    println(duplicate(listOf(4, 3, 2, 2, 1)))
}

