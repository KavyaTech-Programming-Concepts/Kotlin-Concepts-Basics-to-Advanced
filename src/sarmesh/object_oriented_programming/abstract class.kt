package sarmesh.object_oriented_programming


/*
Input Resources:
 - Kotlin Abstract Classes Documentation: https://www.javatpoint.com/kotlin-abstract-class

My topic is Abstract Classes in Kotlin

Output Resources:
- [Your Slides]
- [Your Articles]
- [Your Videos]

About this Program:
- Understanding abstract classes in Kotlin.
- How to create and use abstract classes and methods.
- Example of implementing an abstract class with abstract and concrete methods.

KOTLIN is [COMPILED], [OBJECT-ORIENTED], [HIGH LEVEL], [STRONGLY TYPED], and [STATICALLY TYPED]

*/

/*
 * What is an Abstract Class?
 => An abstract class is a class that cannot be instantiated and is meant to serve as a blueprint for other classes.
 => It can contain abstract methods and properties (without implementation) as well as concrete methods and properties (with implementation).
 => Abstract classes are useful for creating a common structure for related subclasses while allowing those subclasses to define specific details.
 */

/*
 * Abstract Class in Kotlin:
 => Declared using the `abstract` keyword.
 => Abstract methods and properties do not have a body, and subclasses are required to implement them.
 => Non-abstract (concrete) methods in an abstract class can provide default behavior.
 */

abstract class Vehicle {
    // Abstract property (no implementation)
    abstract val name: String

    // Abstract method (no implementation)
    abstract fun start()

    // Concrete method (with implementation)
    fun stop() {
        println("$name has stopped.")
    }
}

// Subclass implementing the abstract methods and properties
class Car : Vehicle() {
    // Implementing the abstract property
    override val name: String = "Car"

    // Implementing the abstract method
    override fun start() {
        println("$name is starting.")
    }
}

class Bike : Vehicle() {
    // Implementing the abstract property
    override val name: String = "Bike"

    // Implementing the abstract method
    override fun start() {
        println("$name is starting.")
    }
}

fun main() {
    // Create instances of subclasses
    val myCar = Car()
    val myBike = Bike()

    // Using implemented methods
    myCar.start()  // Car is starting.
    myCar.stop()   // Car has stopped.

    myBike.start() // Bike is starting.
    myBike.stop()  // Bike has stopped.
}

/*
 * Explanation:
 => The `Vehicle` abstract class has an abstract property `name` and an abstract method `start()`.
 => The `Car` and `Bike` classes are subclasses of `Vehicle` and provide implementations for the abstract members.
 => The `stop()` method is concrete in `Vehicle`, so both subclasses inherit it directly.
 */

/*
Conclusion:
 - Abstract classes provide a template for related classes.
 - Subclasses must implement all abstract members but inherit concrete members as-is.
 - Abstract classes are useful for creating a common structure with shared behavior.
 */
