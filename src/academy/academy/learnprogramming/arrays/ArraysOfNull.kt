package academy.academy.learnprogramming.arrays

fun main(args: Array<String>) {

    val nullableInts = arrayOfNulls<Int>(5)
    for (i in nullableInts) {
        println(i)
    }

    println(nullableInts[3].toString())
}