package com.smartdroidesign.lessons.arrays

fun main(args: Array<String>) {

    val nullableInts = arrayOfNulls<Int>(5)
    for (i in nullableInts) {
        println(i)
    }

    println(nullableInts[3].toString())

}