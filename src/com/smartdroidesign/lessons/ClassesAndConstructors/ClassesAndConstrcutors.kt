package com.smartdroidesign.lessons.ClassesAndConstructors

fun main(args: Array<String>) {

    val emp = Employee("Matteo")
        println(emp.firstName)

    val emp2 = Employee("Joe")
    println(emp2.firstName)
    println(emp2.fullTime)

    val emp3 = Employee("Jane", false)
    println(emp3.firstName)
    println(emp3.fullTime)

    println(Demo().dummy)

}

// Kotlin has the notion of the primary constructor
// The one below is in fact a primary constructor
// You can recognise it by the fact that is declared outside the curly braces
// You can declare other constructors within the class and they are called secondary constructors
// The init block is not a constructor. The initializer block runs when an instance is created
// and it is used in conjunction with the primary constructor
// Primary constructor cannot contain code, therefore to do something with them (e.g initialize them)
// you need an initializer block
class Employee (val firstName: String, var fullTime: Boolean = true) {

   // var fullTime: Boolean = true

    // A - This below is the long way to do it
//    val firstName: String
//
//    init {
//        this.firstName = firstName
//    }

    // B - Short way to do it
    // Get rid of the init block

//    val firstName: String = firstName

    // C - Shortest way
    // Get rid of the whole line
    // Put val in the constructor, and you're done
    // Optionally, you can remove the constructor keyword too,
    // but only if the constructor is public
    // val can also be var
    // final line - class Employee (val firstName: String) -

    // Secondary constructor
    // Because the primary constructor is solely responsible for handling its parameters
    // you need to put firstName as a call for the primary constructor this(firstName)
    // you cannot use val or var in the secondary constructor because it has not
    // the power to declare properties, only the primary can

    // Now, you can make this more concise if you assign var fullTime: Boolean = true
    // to the primary constructor as a parameter!

//    constructor(firstName: String, fullTime: Boolean): this(firstName) {
//        this.fullTime = fullTime
//
//    }



}

// You do not necessarily need a constructor, and if you don't,
// you can skip the () part in the class declaration
// In the example, no primary constructor, just a secondary one

class Demo {
    val dummy: String

    constructor() {
        dummy = "Hello"
    }
}