package com.smartdroidesign.lessons.challenges

fun main(args: Array<String>) {


    // 1. Declare two immutable String variables called hello1 and hello2. Assign "Hello"
    // to both variables
    val hello1: String = "Hello" // could also be without String declaration, see hello2
    val hello2 = "Hello"

    // 2. Using one line of code, test whether hello1 and hello2 are referentially equal.
    println(hello1 === hello2) // referential equality

    // 3. Do the same thing as above but for structural equality
    println(hello1 == hello2) // structural equality

    // 4. Declare a mutable variable of type Int and assign it the value of 2988.
    var myInt = 2988

    // 5. Declare an immutable variable of type Any
    var myVar: Any = "The Any type is the root of the Kotlin class hierarchy"
    if (myVar is String)
        println(myVar.toUpperCase())

    // 6. Using one line of code print out the following and make sure your code is nicely indented:
    //     1
    //    11
    //   111
    //  1111

    println(""" 1  1
                1  11
                1  111
                1  1111""".trimMargin("1"))
}