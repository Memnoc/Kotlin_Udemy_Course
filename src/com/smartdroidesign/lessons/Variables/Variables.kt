package com.smartdroidesign.lessons.Variables

fun main(args: Array<String>) {
    var name = "JonnyB" // mutable val name = "JonnyB" immutable cause of val
    var isAwesome = true

    println("Is " + name + " awesome? The answer is :" + isAwesome)

    var a = 3
    var b = 6
    println(a + b)

    // Mutability > this is like constants: val is immutable, var is mutable
    // best to use val whenever possible

    // Other types

    val doubleNum = 123.45 // double 64bit
    val floatNum = 123.45f // float type must be casted to f 32 bit

    val lngNum = 746274284827482748L // Needs to be cast to L 64 bits

    val aDouble = a.toDouble()

    // Type Inference: Kotlin knows automatically the data type of variables
    // You can still specify the type if you like

    val name2: String = "Data Type"


    var hero: String
    hero = "Batman"
    println(hero)
}