package com.smartdroidesign.lessons.DataTypes

import com.smartdroidesign.lessons.Java_classes.DummyClass

// primitve data types
fun main(args: Array<String>) {
    var myInt = 10
    println("Default data type is ${myInt is Int}")
    var myLong = 22L

    myInt = myLong.toInt()

    val myBite: Byte = 111
    var myShort: Short
    myShort = myBite.toShort()

    val anotherInt = 5

    var myDouble = 65.436
    println(myDouble is Double)

    val char: Char = 'b'
    val char2 = 'b'

    val myBoolean: Boolean = true
    val myBoolean2 = false

    val vacationTime = false
    val onVacation = DummyClass().isVacationTime(vacationTime)
    println(onVacation)

    val anything: Any


    val myFloat = 8383.4785756f  // this is now a float
    println("This is a float ${myFloat is Float}")
}