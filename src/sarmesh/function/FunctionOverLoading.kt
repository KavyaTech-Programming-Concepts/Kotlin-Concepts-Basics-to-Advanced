package sarmesh.function



/*
Input Resources:
 - Kotlin Functions Documentation link: https://kotlinlang.org/docs/functions.html#named-arguments

My topic is Kotlin Functions

Output Resources:
- [Your Slides]
- [Your Articles]
- [Your Videos]

About this Program:
- Understanding functions in Kotlin
- Function declaration and calling
- Function parameters and return types
- Named arguments and default parameter values
- Proof of working code demonstrating functions

KOTLIN is [COMPILED], [OBJECT-ORIENTED], [HIGH LEVEL] Also [STRONGLY TYPED] and [STATICALLY TYPED]

*/

/*
 * What is a Function?
 => A function is a reusable block of code that performs a specific task.
    It can take parameters, execute logic, and return a value. Functions help in organizing code
    into smaller, manageable pieces.
 */

fun main() {
    // 1. Function Declaration and Calling
    /*
     * A function is declared using the `fun` keyword followed by the function name,
     * parameters (if any), and the return type.
     * Syntax:
     * fun functionName(parameter: Type): ReturnType {
     *     // function body
     * }
     */

    // Example of a simple function
    fun greet(name: String): String {
        return "Hello, $name!"
    }

    // Calling the function
    val greeting = greet("Kotlin Intern")
    println(greeting) // Output: Hello, Kotlin Intern!

    // 2. Function Parameters and Return Types
    /*
     * Functions can accept multiple parameters and return values of any type.
     * The parameters are defined within parentheses after the function name.
     */

    // Example of a function with multiple parameters
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    // Calling the function with parameters
    val sum = add(5, 10)
    println("Sum: $sum") // Output: Sum: 15

    // 3. Default Parameter Values
    /*
     * Kotlin allows you to provide default values for parameters.
     * If a caller does not provide an argument for a parameter,
     * the default value is used.
     */

    // Function with default parameter value
    fun multiply(a: Int, b: Int = 2): Int {
        return a * b
    }

    // Calling the function with and without the second parameter
    println("Multiply with default: ${multiply(5)}") // Output: Multiply with default: 10
    println("Multiply without default: ${multiply(5, 3)}") // Output: Multiply without default: 15

    // 4. Named Arguments
    /*
     * When calling a function, you can specify the names of parameters to improve readability.
     */

    // Function demonstrating named arguments
    fun personInfo(name: String, age: Int) {
        println("Name: $name, Age: $age")
    }

    // Calling the function with named arguments
    personInfo(age = 25, name = "John Doe") // Output: Name: John Doe, Age: 25

    // 5. Function with Variable Number of Arguments (Varargs)
    /*
     * Functions can accept a variable number of arguments using the `vararg` keyword.
     */

    // Function using varargs
    fun concatenate(vararg strings: String): String {
        return strings.joinToString(", ")
    }

    // Calling the function with multiple arguments
    val result = concatenate("Kotlin", "Java", "Python")
    println("Concatenated Strings: $result") // Output: Concatenated Strings: Kotlin, Java, Python
}

/*
Conclusion:
 - Functions in Kotlin allow you to encapsulate reusable code with specific tasks.
 - You can define parameters with default values, use named arguments for clarity, and accept a variable number of arguments.
 - This functionality makes Kotlin functions versatile and easy to work with.
 */
