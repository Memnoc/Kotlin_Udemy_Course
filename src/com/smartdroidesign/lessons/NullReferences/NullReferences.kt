package com.smartdroidesign.lessons.NullReferences

fun main(args: Array<String>) {
    val str: String? = null

    // short-hand fail safe check for variables that it could be null
    str?.toUpperCase()

    // The safe operator ? is a short-end for the following

//    if (str == null) {
//        null
//    } else {
//        str.toUpperCase()
//    }

    // The Elvis operator ?: assign a default value to a null variable
    val str2: String = str ?: "this is the default value"
    println(str2)

    // The Elvis operator ?: is a short end for the following

//    if (str == null) {
//        str2 = "this is the default value"
//    }
//    else {
//        str2 = str
//    }

    // Chain of values with Safe and Elvis operator at the end
    //  val whatever = bankBranch?.address?.countryCode ?: "US" // This will check for all the values and if everything is null will print US

    // This is the Safe Cast operator as?
    // Basically, if you cannot perform the cast successfully the cast will evaluate to null (instead of crashing)
    val something: Any = arrayOf(1, 2, 3, 4)
    val str3 = something as? String
    println(str3)


    // Not Null Assertion: !! You are telling the compiler that you are sure this is not gonna be null
    // To be used ONLY if you are 100% sure this is not gonna be null
    val str4: String?  = "This is not null"
    val str5 = str!!.toUpperCase()

    // The Not Null Assertion is short-hand for the following code

//    if (str == null) {
//        throw exception
//    }
//    else {
//        str.toUpperCase()
//    }


    // The following code throws an exception at line 46 were we first make the assertion,
    // although the error is actually at line 58
    //  This to say that is not advisable to use the !! in a chain of values, as it doesn't point to the one
    // which is actually failing
    val str6: String? = null
    val str7 = str!!
    val str8 = str2.toUpperCase()



    // The Let function .let allows you to pass a nullable variable to a function that only accepts non-null values
    // It's a short-end for the following code:

//    if (str9 != null) {
//        printText(str9)
//    }
    val str9: String? = "This is not null"
    str9?.let { printText(it) }


// The == operator is a safe operator:
// even though we are passing a nullable variable to a not null one
// a null check is performed anyway under the covers
    val str10: String? = null;
    val anotherStr10 = "This is not nullable"
    println(str10 == anotherStr10)

}

fun printText (text: String) {
    println(text)
}