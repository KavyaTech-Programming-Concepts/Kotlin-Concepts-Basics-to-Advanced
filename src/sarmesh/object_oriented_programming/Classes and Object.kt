package sarmesh.object_oriented_programming


/*
Input Resources:
 - Kotlin Classes Documentation: https://kotlinlang.org/docs/classes.html#constructors
 - W3Schools Kotlin Classes Tutorial: https://www.w3schools.com/kotlin/kotlin_classes.php

My topic is Classes and Objects in Kotlin

Output Resources:
- [Your Slides]
- [Your Articles]
- [Your Videos]

About this Program:
- Understanding what classes and objects are in Kotlin
- Class properties and methods
- Constructors in Kotlin
- When to use primary and secondary constructors
- Proof of working code demonstrating each concept

KOTLIN is [COMPILED], [OBJECT-ORIENTED], [HIGH LEVEL] Also [STRONGLY TYPED] and [STATICALLY TYPED]

*/

/*
 * What is a Class?
 => A class is a blueprint for creating objects. It defines properties and methods that the objects created from the class will have.
    In Kotlin, classes are declared using the `class` keyword.
 */

fun main() {
    // 1. Declaring a Class
    /*
     * A class can have properties and methods.
     * Syntax:
     * class ClassName {
     *     var propertyName: Type
     *     fun methodName() { }
     * }
     */
    class Car(val make: String, val model: String) {
        var year: Int = 0

        fun displayInfo() {
            println("Car: $make $model, Year: $year")
        }
    }

    // 2. Creating an Object
    /*
     * An object is an instance of a class.
     * Syntax:
     * val objectName = ClassName(parameters)
     */
    val myCar = Car("Toyota", "Camry")
    myCar.year = 2022 // Setting the year property
    myCar.displayInfo() // Calling method to display information

    // 3. Constructors
    /*
     * A constructor is a special function that is called when an object is created.
     * Kotlin provides primary and secondary constructors.
     * Primary Constructor Syntax:
     * class ClassName(param1: Type, param2: Type) { }
     * Secondary Constructor Syntax:
     * constructor(param1: Type) { }
     */
    class Bike(val brand: String) {
        var model: String = "Default Model"

        // Secondary constructor
        constructor(brand: String, model: String) : this(brand) {
            this.model = model
        }

        fun displayInfo() {
            println("Bike: $brand $model")
        }
    }

    // Creating objects using the primary and secondary constructors
    val myBike1 = Bike("Yamaha")
    myBike1.displayInfo()

    val myBike2 = Bike("Honda", "CBR")
    myBike2.displayInfo()

    // 4. When to use Primary and Secondary Constructors
    /*
     * Use a primary constructor when:
     * - You need to initialize properties directly.
     * - You have simple initialization logic.
     *
     * Use a secondary constructor when:
     * - You need to provide additional ways to initialize a class.
     * - You have complex initialization logic that cannot be handled in a single line.
     * - You want to allow for default values or variations in the construction process.
     */

    // 5. Data Classes
    /*
     * Data classes are classes specifically designed to hold data.
     * They automatically provide `equals()`, `hashCode()`, and `toString()` methods.
     * Syntax:
     * data class DataClassName(val property1: Type, val property2: Type)
     */
    data class User(val name: String, val age: Int)

    val user = User("Alice", 25)
    println(user) // Automatically calls toString()

}

/*
Conclusion:
 - Classes in Kotlin are templates for creating objects, encapsulating properties and methods.
 - Constructors initialize object properties and can be primary or secondary.
 - Primary constructors are suitable for simple initializations, while secondary constructors handle more complex cases.
 - Data classes are useful for holding and managing data with built-in functionalities.
*/
