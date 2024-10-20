package sarmesh.functions

/*
Input Resources:
 - Kotlin Functions Documentation: https://kotlinlang.org/docs/functions.html#named-arguments
 - Kotlin Lambdas Documentation: https://kotlinlang.org/docs/lambdas.html
 - Kotlin Inline Functions Documentation: https://kotlinlang.org/docs/inline-functions.html

My topic is Kotlin Functions

Output Resources:
- [Your Slides]
- [Your Articles]
- [Your Videos]

About this Program:
- Understanding what a function is in Kotlin
- Function declaration and calling
- Function parameters and return types
- Named arguments and default parameters
- Higher-order functions and lambdas
- Inline functions and their benefits
- Proof of working code demonstrating each concept

KOTLIN is [COMPILED], [OBJECT-ORIENTED], [HIGH LEVEL] Also [STRONGLY TYPED] and [STATICALLY TYPED]

*/

/*
 * What is a Function?
 => A function is a reusable block of code that performs a specific task. Functions can take parameters and return values.
   They help in organizing code and avoiding redundancy.
 */

fun main() {
    // 1. Function Declaration and Calling
    /*
     * Functions are declared using the `fun` keyword, followed by the function name, parameters, and return type.
     * Syntax:
     * fun functionName(parameter1: Type, parameter2: Type): ReturnType {
     *     // function body
     * }
     */

    // Example: Simple function to add two numbers
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    val sum = add(5, 3) // Calling the function
    println("Sum: $sum")

    // 2. Function Parameters and Return Types
    /*
     * Functions can have multiple parameters and can return various types.
     * The return type is specified after the parameter list.
     */
    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    val product = multiply(4, 6)
    println("Product: $product")

    // 3. Named Arguments and Default Parameters
    /*
     * Kotlin allows named arguments, making it clear what each parameter represents when calling the function.
     * Default parameters can also be defined, providing default values if no argument is passed.
     */
    fun greet(name: String, greeting: String = "Hello") {
        println("$greeting, $name!")
    }

    greet("Alice") // Using default parameter
    greet("Bob", "Welcome") // Named argument

    // 4. Higher-order Functions and Lambdas
    /*
     * A higher-order function is a function that takes another function as a parameter or returns a function.
     * Lambdas are anonymous functions that can be treated as values.
     */
    fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }

    val result = operateOnNumbers(10, 5, ::add) // Passing a function reference
    println("Operation Result: $result")

    // Lambda expression
    val subtract = { x: Int, y: Int -> x - y }
    val subtractionResult = operateOnNumbers(10, 5, subtract)
    println("Subtraction Result: $subtractionResult")

    // 5. Inline Functions
    /*
     * Inline functions are functions that are expanded at the call site, which can improve performance by avoiding function call overhead.
     * Syntax:
     * inline fun functionName(...) { ... }
     */
    fun performAction(action: () -> Unit) {
        action() // Calling the lambda function

    }
    performAction { println("Action performed!") }
}

/*
Conclusion:
 - Functions are a core concept in Kotlin, allowing for reusable and organized code.
 - Named arguments and default parameters improve function flexibility and readability.
 - Higher-order functions and lambdas enable functional programming styles in Kotlin.
 - Inline functions can optimize performance by reducing function call overhead.
*/
