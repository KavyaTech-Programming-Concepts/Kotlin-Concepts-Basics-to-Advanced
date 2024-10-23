package sarmesh.dataclass


/*
Input Resources:
 - Kotlin Data Classes Documentation: https://kotlinlang.org/docs/data-classes.html

My topic is Data Classes in Kotlin

Output Resources:
- [Your Slides]
- [Your Articles]
- [Your Videos]

About this Program:
- Understanding what data classes are and how they work in Kotlin.
- Learning the advantages of using data classes.
- Example of a data class and its automatically generated functions.

KOTLIN is [COMPILED], [OBJECT-ORIENTED], [HIGH LEVEL], [STRONGLY TYPED], and [STATICALLY TYPED]

*/

/*
 * What is a Data Class?
 => A data class in Kotlin is a class that is primarily used to hold data.
 => Kotlin provides automatic generation of commonly used methods, reducing boilerplate code.
 */

/*
 * Data Class in Kotlin:
 => Declared using the `data` keyword.
 => Must have at least one primary constructor parameter.
 => Automatically generates useful methods: `toString()`, `equals()`, `hashCode()`, and `copy()`.
 */

data class User(
    val name: String,
    val age: Int,
    val email: String
)

fun main() {
    // Creating an instance of the data class
    val user1 = User(name = "Alice", age = 25, email = "alice@example.com")

    // Using toString() - Automatically generated
    println(user1) // Output: User(name=Alice, age=25, email=alice@example.com)

    // Using equals() - Automatically generated
    val user2 = User(name = "Alice", age = 25, email = "alice@example.com")
    println(user1 == user2) // Output: true (because the properties are equal)

    // Using copy() - Automatically generated
    val user3 = user1.copy(age = 30)
    println(user3) // Output: User(name=Alice, age=30, email=alice@example.com)

    // Destructuring Declarations
    val (userName, userAge, userEmail) = user1
    println("Name: $userName, Age: $userAge, Email: $userEmail")
}

/*
 * Explanation:
 => The `User` data class has three properties: `name`, `age`, and `email`.
 => `toString()`, `equals()`, `hashCode()`, and `copy()` are automatically available for `User` instances.
 => The `copy()` method allows you to create a new object by copying an existing one and modifying certain properties.
 => Destructuring allows you to extract properties directly from the object using a tuple-like syntax.
 */

/*
Conclusion:
 - Data classes provide a concise way to define classes intended to store data.
 - Kotlin automatically generates useful methods, reducing the need for boilerplate code.
 - Data classes are powerful when working with immutable data structures or modeling simple objects.
 */
