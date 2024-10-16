package sarmesh.variables_and_memory_allocation/*
Input Resources:
 -
 -
 -

Output Resources:
 - [Your Slides]
 - [Your Artciles]
 - [Your Videos]

About this Program:
 -declaring/creating variables
 -printing the variables
 -Type Inference
 -Kotlin Data Types
 -printing variable Address and dataType
 -concept of [Object Interring]

KOTLIN is [COMPILED], [OBJECT-ORIENTED], [HIGH LEVEL] Also [STRONGLY TYPED] and [STATICALLY TYPED]

/*
 * Kotlin Variables and Memory Allocation

 => In Kotlin, variables are used to store data that can change (or remain constant) during program execution.
    Proper use of variables and understanding of their types ensures efficient and predictable code.
    Kotlin provides two main keywords to declare variables: `var` and `val`.
 */

// 1. Mutable vs Immutable Variables

// Mutable variable (var): Can be reassigned after initialization
var age: Int = 25
age = 26  // Allowed: `age` is mutable

// Immutable variable (val): Cannot be reassigned after initialization
   val name: String = "Alice"
   name = "Bob"  // Error: `name` is immutable

// Best practice: Use `val` for constants or values that shouldn't change

// 2. Type Inference

// Kotlin can infer the type based on the assigned value
   var inferredAge = 30  // Type inferred as Int
   val city = "New York"  // Type inferred as String

// Explicit types are useful for clarity and when initializing later
   var temperature: Double
   temperature = 36.6

// 3. Kotlin Data Types

// Examples of basic data types in Kotlin
val intValue: Int = 100
val longValue: Long = 1000L
val floatValue: Float = 10.5f
val doubleValue: Double = 20.99
val charValue: Char = 'A'
val isKotlinFun: Boolean = true

// 4. Memory Allocation

/*
 * - Stack memory: Stores local variables and function calls (short-lived data).
 * - Heap memory: Stores objects and variables that persist beyond function calls.
 * - Kotlin uses automatic garbage collection to manage unused objects in heap memory.
 */

// Example of heap memory allocation
class Person(val firstName: String, val lastName: String)

val person = Person("John", "Doe")  // Object allocated on the heap

*/

fun main() {
    // 1. Mutable vs Immutable Variables

    // Mutable variable (var): Can be reassigned after initialization
    var age: Int = 25
    println("Initial Age: $age")
    age = 26  // Reassigning mutable variable
    println("Updated Age: $age")  // Proof: `age` value changed

    // Immutable variable (val): Cannot be reassigned after initialization
    val name: String = "Alice"
    println("Name: $name")
    // name = "Bob"  // Uncommenting this will cause a compilation error (Proof: Immutable)

    // 2. Type Inference

    // Type is inferred by Kotlin
    var inferredAge = 30  // Type inferred as Int
    println("Inferred Age: $inferredAge")

    val city = "New York"  // Type inferred as String
    println("City: $city")

    // Explicit type declaration
    var temperature: Double
    temperature = 36.6
    println("Temperature: $temperature")

    //3. printing variable Address and dataType

    val number: Int = 42
    println("Data Type: ${number::class.simpleName}") // print data type of number variables
    println("Address : ${System.identityHashCode(number)}") // print the address of number variables


    // 4. Kotlin Data Types

    // Examples of basic data types
    val intValue: Int = 100
    val longValue: Long = 1000L
    val floatValue: Float = 10.5f
    val doubleValue: Double = 20.99
    val charValue: Char = 'A'
    val isKotlinFun: Boolean = true

    println("Int Value: $intValue")
    println("Long Value: $longValue")
    println("Float Value: $floatValue")
    println("Double Value: $doubleValue")
    println("Char Value: $charValue")
    println("Is Kotlin Fun: $isKotlinFun")

    // 5. Memory Allocation
    // Stack Memory: Local variables like 'age', 'name', etc.
    // Heap Memory: Objects allocated using  constructors

    // Proof of Heap Allocation
    class Person(val firstName: String, val lastName: String)

    val person = Person("John", "Doe")  // Object allocated on heap
    println("Person: ${person.firstName} ${person.lastName}")

    // Note: Garbage collection happens automatically; no explicit proof can be shown here.
}
