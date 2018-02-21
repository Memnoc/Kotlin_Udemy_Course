package com.smartdroidesign.lessons.arrays

import com.smartdroidesign.lessons.Java_classes.DummyClass
import java.math.BigDecimal

fun main(args: Array<String>) {


    val names = arrayOf("matteo", "john", "pinco", "panco") // arrayOf when you know the list of items

    val longs1 = arrayOf(1L, 2L, 3L) // you can specify the data typ in the elements
    val longs2 = arrayOf<Long>(1, 2, 3, 4, 5) // or you can do it as usual for an array

    val evenNumbers = Array(16) { i -> i * 2}

    for (number in evenNumbers) {
        //println(number)
    }

    val lotsOfNumbers = Array (100000) {i -> i + 1}

    for (number in lotsOfNumbers) {
        //println(number)
    }


    var someArray: Array<Int> = arrayOf(1,2,3,4) // If you do not know the elements of the Array you must specify a data type
    for (number in someArray) println(number)

    someArray = Array(6) { i -> i + 1 *10} // you can use a lambda anytime after the Array initialization
    for (number in someArray) println(number)

    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a') // you can mix data types in an array
    for (element in mixedArray) println(element)

    println(mixedArray is Array<Any>)

    val myIntArray = intArrayOf (3,7,6,5,8,9)
    DummyClass().printNumbers(myIntArray)

    var someOtherArray = IntArray(5)
    for (number in someOtherArray) println(number)
}