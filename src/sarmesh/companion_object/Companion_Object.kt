package sarmesh.companion_object

/*
Input Resources:
 - Companion Objects in Kotlin: https://medium.com/@riztech.dev/understanding-companion-objects-in-kotlin-a93f1a5880a7#:~:text=Companion%20objects%20in%20Kotlin%20provide,implementing%20interfaces%20and%20extending%20functionalities.
 - Kotlin Documentation

My topic is Companion Object in Kotlin

Output Resources:
- [Your Slides]
- [Your Articles]
- [Your Videos]

About this Program:
- Understanding what a Companion Object is in Kotlin
- When and why to use Companion Objects
- Demonstrating how Companion Objects help in calling methods and properties without needing an instance of the class
- Proof of working code with Companion Object examples

KOTLIN is [COMPILED], [OBJECT-ORIENTED], [HIGH LEVEL] Also [STRONGLY TYPED] and [STATICALLY TYPED]

*/

/*
 * What is a Companion Object?
 => In Kotlin, a companion object is a special object that is tied to a class but not tied to its instances.
    It is used to hold static members or utility functions related to the class, allowing you to call these functions without creating an instance of the class.
    Companion objects can also implement interfaces and extend functionalities.
    - The `companion object` can be declared inside a class.
    - It can be accessed using the class name, like `ClassName.CompanionObjectName`.
    - If the object is named `companion`, it can be accessed directly with the class name.
 */

fun main() {
    // 1. Accessing Companion Object Members without an Instance
    /*
     * Companion object allows access to properties and functions without creating an instance of the class.
     */
    println("Accessing directly from the Companion object: ${MyClass.companionMethod()}")

    // 2. Working with Companion Object Properties
    println("Accessing companion object property: ${MyClass.companionProperty}")

    // 3. Demonstrating utility function behavior
    println("Utility function result: ${MyClass.utilityFunction(5, 10)}")
}

// Example Class with a Single Companion Object
class MyClass {

    // Companion object declaration (Only one allowed per class)
    companion object {
        // Companion object property
        val companionProperty = "Hello from Companion Object!"

        // Companion object method
        fun companionMethod(): String {
            return "This is a method in the Companion Object"
        }

        // Utility function in the companion object
        fun utilityFunction(x: Int, y: Int): Int {
            return x + y
        }
    }
}

/*
 * When to Use Companion Objects:
 => Use Companion objects for:
    - Defining static methods and properties, where you want them to be shared across all instances.
    - Utility or factory methods that can be called without creating an object.
    - Implementing interfaces that are not tied to a specific object.
    - When you need to associate a behavior with a class but not with its instances.
 */

/*
Conclusion:
 - Companion objects in Kotlin provide a way to declare static members and methods that belong to the class itself, rather than to instances of the class.
 - They allow access to properties and methods directly using the class name without creating an instance.
 - Companion objects can be used for utilities, factories, or implementing interfaces.
 - They act as a replacement for static members found in other languages like Java.
 */
