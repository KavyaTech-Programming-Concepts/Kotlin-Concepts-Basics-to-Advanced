package sarmesh.object_oriented_programming

/*
Input Resources:
 - Kotlin Inheritance Documentation: https://kotlinlang.org/docs/inheritance.html

My topic is Inheritance in Kotlin

Output Resources:
- [Your Slides]
- [Your Articles]
- [Your Videos]

About this Program:
- Understanding the concept of inheritance in Kotlin.
- How to create a base (super) class and subclass.
- How to override methods and properties.

KOTLIN is [COMPILED], [OBJECT-ORIENTED], [HIGH LEVEL], [STRONGLY TYPED], and [STATICALLY TYPED]

*/

/*
 * What is Inheritance?
 => Inheritance is a feature in OOP that allows one class to inherit properties and methods from another class.
 => The class that inherits is known as the **subclass** or **child class**, and the class being inherited from is the **superclass** or **parent class**.
 => Inheritance helps to reuse code, avoid redundancy, and create a hierarchical class structure.
 */

/*
 * Inheritance in Kotlin:
 => Classes in Kotlin are final by default, meaning they cannot be inherited unless marked with `open`.
 => You must use the `open` keyword to make a class inheritable.
 => Similarly, the properties and methods you want to allow overriding in a subclass should also be marked with `open`.
 */

open class Animal(val name: String) {
    // Open method that can be overridden by subclasses
    open fun sound() {
        println("$name makes a sound")
    }
}

// Subclass of Animal
class Dog(name: String) : Animal(name) {
    // Overriding the sound() method in Dog class
    override fun sound() {
        println("$name barks")
    }
}

fun main() {
    // Creating an instance of the Dog class
    val myDog = Dog("Buddy")
    myDog.sound() // Buddy barks

    // Creating an instance of the Animal class
    val genericAnimal = Animal("Generic Animal")
    genericAnimal.sound() // Generic Animal makes a sound
}

/*
 * Explanation:
 => The `Animal` class is a base (super) class with an `open` method `sound()` that can be overridden.
 => The `Dog` class inherits from `Animal` and overrides the `sound()` method to provide its own implementation.
 */

/*
Conclusion:
 - Inheritance allows code reuse by letting a subclass inherit properties and methods from a superclass.
 - Kotlin uses the `open` keyword to allow inheritance.
 - Subclasses can override methods and properties using the `override` keyword to provide specific implementations.
 */
