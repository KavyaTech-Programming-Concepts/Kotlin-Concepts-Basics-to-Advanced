package sarmesh.object_oriented_programming


/*
Input Resources:
 - Kotlin Documentation on Interfaces: https://kotlinlang.org/docs/interfaces.html#implementing-interfaces

My topic is Interfaces in Kotlin

Output Resources:
- [Your Slides]
- [Your Articles]
- [Your Videos]

About this Program:
- Understanding interfaces in Kotlin
- How to define and implement interfaces
- Use of default method implementations in interfaces
- Proof of working code with interfaces in action

KOTLIN is [COMPILED], [OBJECT-ORIENTED], [HIGH LEVEL], [STRONGLY TYPED], and [STATICALLY TYPED]

*/

/*
 * What is an Interface?
 => An interface is a blueprint of a class that can contain abstract methods as well as implementations of methods.
 => It defines a contract that a class can choose to implement, supporting multiple inheritance by allowing a class to inherit multiple interfaces.
 => Interfaces are useful for defining expected functionality without enforcing a concrete implementation.
 */

interface Drivable {
    // Abstract method
    fun drive()

    // Default method implementation
    fun stop() {
        println("Vehicle stopping")
    }
}

/*
Explanation:
 => The `Drivable` interface includes one abstract method, `drive()`, and one default method, `stop()`.
 => Any class implementing `Drivable` must provide an implementation for `drive()` but can optionally use the default `stop()` method.
 */

class car : Drivable {
    override fun drive() {
        println("Car is driving")
    }
}

/*
Explanation:
 => The `Car` class implements the `Drivable` interface by providing its own version of the `drive()` method.
 => The `stop()` method, being a default implementation in the interface, can be used as-is without additional code.
 */

fun main() {
    val myCar = car()
    myCar.drive()
    myCar.stop()
}

/*
 * Advantages of Using Interfaces in Kotlin:
 => Interfaces allow multiple inheritance, enabling a class to implement more than one interface.
 => They help define behavior that can be shared across classes without requiring class inheritance.
 => Interfaces improve code modularity and reusability, as classes can implement interfaces with specific functionality.
 */

/*
Conclusion:
 - Interfaces in Kotlin provide a way to define a contract for classes, supporting both abstract and default methods.
 - Kotlin’s interface functionality allows classes to implement multiple behaviors flexibly.
 */
