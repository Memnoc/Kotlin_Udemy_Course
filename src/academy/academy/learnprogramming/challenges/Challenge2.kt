package academy.academy.learnprogramming.challenges

fun main(args: Array<String>) {

    // 1. Declare a non-nullable float variable two ways
    // and assign it the value -3847.384

    val float1 = -3847.384f
    val float2: Float = -3847.384f
    // a more silly way, so verbose it's almost Java
    val float3 = (-3847.384).toFloat()

    // 2. Now change both of this variable declarations into nullable variables

    val float4: Float? = -3847.384f
    val float5: Float? = -3847.384f.toFloat()

    // 3. Declare an  array of type non-nullable Short. Make it size 5,
    // and assign the values 1,2,3,4 and 5.

    val shortArray = shortArrayOf(1, 2, 3, 4, 5) // short way
    val shortArray2: Array<Short> = arrayOf(1, 2, 3, 4, 5) // long way

    // 4. Now declare an array of nullable Ints and initialize it with the values
    // 5, 10, 20, 30, 40, 45, 50, etc, all the way up to 200

    val intArray = Array<Int?>(40) { i -> (i + 1) * 5 }
    for (number in intArray) {
        println(number)
    }

    // 5. You have to call a Java method with the following signature from Kotlin:
    //public void method1 (char[] charArray). Declare an array that you could
    // pass to the method an initialize it with the values 'a', 'b', and 'c'

    val charArray = charArrayOf('a', 'b', 'c')

    // 6. Given the following line of code:
    val x: String? = "I AM UPPERCASE"
    // Using the line of code, declare another string variable.
    // and assign it x.toLowerCase() when x is not null,
    // and the string "I give up" when it's null

    val z = x?.toLowerCase() ?: "I give up"
    println(z)

    // 7. Use the let function to a) lowercase the string and then
    // b) replace "am" with "am not" in the result

    x?.let { println(it.toLowerCase().replace("am", "am not")) }

    // 8. You're really confident that the variable myNonNullVariable cannot contain null
    // Change the following code to assert then myNonNullVariable is not null
    // (and shoot yourself in the foot! LOL)

    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toDouble()
    println(myNonNullVariable)

}