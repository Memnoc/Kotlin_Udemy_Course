package com.smartdroidesign.lessons.AccessModifiers

// Let's study the differences between Java and Kotlin
// when it comes ot access modifiers
//
//
// [Java] - 3 visibility_modifiers: public, private, protected
// [Kotlin] - 4 visibility_modifiers: public, private, protected, internal

// [Java] - The default visibility for classes is private by default
// [Kotlin] - The default visibility for classes is public by default

// [Java] - Cannot declare a Class private -> not visible to anything
// [Kotlin] - Can declare a Class private -> visible within the file

// [Java] - Can only have one public class per file -> name has to match the file name in which it leaves
// [Kotlin] - Can have as many public classes as you want -> no requirement for matching names

// [Kotlin] - Kotlin has the notion of Module: a module is a group of files that are compiled together
//            In IntelliJ the top-project is a module. You cannot have more than one module in an Intellij project
//            The fourth modifier "internal" it's essentially visible throughout the project level

fun main(args: Array<String>) {

    val emp = Employee()
    println(emp)

}

private class Employee {

}