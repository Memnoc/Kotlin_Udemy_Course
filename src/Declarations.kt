package academy.learnprogrammig.declarations

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {

    val employeeOne = Employee("mary", 1)
    val employeeTwo = Employee("john", 2)
    val employeeThree = Employee("john", 2)
    println(employeeOne === employeeTwo) // referentially equal (they are the same instance)
    println(employeeTwo === employeeThree)
    println(employeeOne == employeeTwo) // equals in structure (have the same values)
    println(employeeTwo == employeeThree)
    val employeeFour = employeeTwo

    println(employeeFour != employeeTwo) // structurally not equal
    println(employeeFour !== employeeTwo) // referentially not equal
    println(employeeTwo != employeeThree)
    println(employeeTwo !== employeeThree)

    val something: Any = employeeFour
    if (something is Employee) {
        val newEmployee = something as Employee // casting is redundant - Smart Casting
        println(newEmployee.name)
    }



    var number: Int
    number = 10
    number = 11



    val nome = "Matteo"
    println(nome.length)

    val names = arrayListOf("John", "Jane", "Mary")
    println(names[1])



    val employee: EmployeeSet

    val employee1 = Employee ("Lynn Jones", 500)
    employee1.name = "Lynn Smith"

    println(employeeOne)

    val change = 4.22
    println("to show the value of change, we use $$change")

    val numerator = 10.99
    val denominator = 20.00
    println("The value od $numerator divided by $denominator is ${numerator/denominator}")

    println("the employee's id is ${employee1.id}") // referencing a property value outside the class is considered an expression
    // and has to be enclosed within curly braces




    val eomployee2: Employee
    val number2 = 100

    if (number < number2) {
        eomployee2 = Employee("jane smith", 400)

    } else {
        eomployee2 = Employee("Mike Watson", 150)
    }



}

class Employee(var name: String, val id: Int){

    override fun toString(): String {
        return "Employee(name=$name, id=$id)" // String template
    }
}