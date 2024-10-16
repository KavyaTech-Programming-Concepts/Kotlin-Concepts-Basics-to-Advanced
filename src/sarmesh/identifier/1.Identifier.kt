package sarmesh.identifier


/*
Input Resources:
 -
 -
 -

Output Resources:
 - [Your Slides]
 - [Your Articles]
 - [Your Videos]

About this Program:
 - Understanding identifiers in Kotlin
 - Kotlin naming conventions
 - Valid vs Invalid identifiers
 - Reserved keywords and identifiers
 - Identifiers for variables, constants, and functions
 - Proof of correct and incorrect identifiers

KOTLIN is [COMPILED], [OBJECT-ORIENTED], [HIGH LEVEL] Also [STRONGLY TYPED] and [STATICALLY TYPED]

/*
 * Kotlin Identifiers and Naming Conventions
 => Identifiers in Kotlin are used to name variables, functions, classes, and other elements.
    Proper naming ensures code readability and maintains standard conventions.
    Kotlin allows alphanumeric characters, underscores, and sometimes backticks in identifiers.
 */

// 1. Rules for Kotlin Identifiers

// Identifiers can contain letters, digits, underscores, and dollar signs.
val myVariable: Int = 100   // Valid identifier
val _counter: Int = 10      // Valid: Starts with an underscore

// Identifiers cannot start with a digit or contain spaces or special characters
// val 1stValue: Int = 1      // Error: Cannot start with a digit
// val total amount: Int = 200  // Error: Spaces are not allowed

// Proof: Uncommenting the above lines will cause compilation errors, demonstrating invalid identifiers.

// 2. Kotlin Naming Conventions

/*
 * Variables and function names use lowerCamelCase
 * Class names use UpperCamelCase
 * Constants use ALL_CAPS
 */

// Variable with lowerCamelCase
val employeeId: Int = 101

// Class name with UpperCamelCase
class Employee(val name: String, val id: Int)

// Constant using ALL_CAPS
const val MAX_LIMIT: Int = 500

// 3. Reserved Keywords

/*
 * Kotlin has reserved keywords that cannot be used as identifiers.
 * For example: class, fun, val, var, if, else, etc.
 */

// Using reserved keywords as identifiers results in errors.
// val class: Int = 1     // Error: 'class' is a keyword

// Backticks can be used to name variables with reserved keywords (not recommended).
val `class`: Int = 1
println("Keyword used as Identifier: ${`class`}")

// Proof: Uncommenting the invalid identifiers will cause compilation errors, demonstrating the correct usage of identifiers.

// 4. Valid vs Invalid Identifiers

/*
 * Valid Identifiers: Follow rules, contain letters, digits, or underscores.
 * Invalid Identifiers: Break rules, use reserved words, start with digits.
 */

val student_name: String = "John Doe"   // Valid identifier
// val 123name: String = "Alice"         // Error: Cannot start with a number

// Proof: Uncomment the invalid identifier to trigger an error.

// 5. Identifiers for Functions

// Function names follow the same rules and conventions as variable identifiers.
fun calculateArea(radius: Double): Double {
    return 3.14 * radius * radius
}

*/

fun main() {
    // 1. Rules for Kotlin Identifiers

    val myVariable: Int = 100
    println("Valid identifier: myVariable = $myVariable")

    val _counter: Int = 10
    println("Valid identifier: _counter = $_counter")


    // Proof of error: Uncomment the line below and run it to see the error
    // val 1stValue: Int = 1  // Error: Cannot start with a digit

    // 2. Kotlin Naming Conventions
    val employeeId: Int = 101
    println("Employee ID: $employeeId")


    // 3.  Reserved keyword as identifier: class, object, fun, val,  var, etc
    // Proof of error: Uncomment the line below and run it to see the error
    // val class: Int = 1  // Error: Cannot use 'class' as identifier

    // 4. Identifiers for Functions
    val area = calculateArea(7.0)
    println("Area of circle: $area")
}

// Function name following lowerCamelCase convention
fun calculateArea(radius: Double): Double {
    return 3.14 * radius * radius
}

