package sarmesh.instance_reference


/*
Input Resources:
 - Kotlin Documentation on Classes: https://kotlinlang.org/docs/classes.html
 - GeeksforGeeks on Object-Oriented Programming Concepts in Kotlin

My topic is Instances and References in Kotlin

Output Resources:
- [Your Slides]
- [Your Articles]
- [Your Videos]

About this Program:
- Understanding instances and references in Kotlin
- Creating and using object instances
- Referencing instances and accessing properties and methods

KOTLIN is [COMPILED], [OBJECT-ORIENTED], [HIGH LEVEL] Also [STRONGLY TYPED] and [STATICALLY TYPED]

*/

/*
 * Instances and References
 => An instance is a specific realization of a class. When you create an object from a class, you create an instance of that class.
    References are pointers that hold the memory address of an instance, allowing access to the properties and methods of that instance.
    In Kotlin, managing instances and references effectively is crucial for object-oriented programming.
 */

fun main() {
    // 1. Creating a Class
    /*
     * A class defines the blueprint for creating objects (instances).
     */
    class Car(val make: String, val model: String, var year: Int) {
        fun displayInfo() {
            println("Car Make: $make, Model: $model, Year: $year")
        }
    }

    // 2. Creating Instances of a Class
    /*
     * An instance of a class is created by using the `new` keyword in Java; however, in Kotlin, it is simply done by calling the class constructor.
     */
    val car1 = Car("Toyota", "Corolla", 2020) // Creating an instance of Car
    val car2 = Car("Honda", "Civic", 2021) // Creating another instance of Car

    // 3. Accessing Properties and Methods via References
    /*
     * Using the reference variable, we can access the properties and methods of the instance.
     */
    car1.displayInfo() // Accessing method using the reference car1
    car2.displayInfo() // Accessing method using the reference car2

    // 4. Modifying Properties of an Instance
    /*
     * Since properties can be mutable, we can modify them directly through their references.
     */
    car1.year = 2022 // Modifying the year property of car1
    println("Updated Info for Car1:")
    car1.displayInfo() // Display updated information

    // 5. Reference Types
    /*
     * References in Kotlin can be of different types (e.g., nullable references, non-nullable references).
     */
    val nullableCar: Car? = null // Nullable reference, can hold null
    val nonNullableCar: Car = car2 // Non-nullable reference, must refer to a valid instance

    // 6. Demonstrating Null Safety with References
    /*
     * Attempting to access properties or methods of a null reference using safe calls.
     */
    nullableCar?.displayInfo() ?: println("nullableCar is null, cannot display info.")

    // 7. Comparing References
    /*
     * Comparing references checks whether two references point to the same instance.
     */
    val car3 = car1 // car3 references the same instance as car1
    println("car1 and car3 are the same instance: ${car1 === car3}") // True
    println("car1 and car2 are the same instance: ${car1 === car2}") // False
}

/*
Conclusion:
 - An instance is a specific realization of a class, while a reference points to the memory address of that instance.
 - Instances can be created by calling class constructors, and their properties and methods can be accessed via references.
 - Understanding the concepts of instances and references is fundamental in object-oriented programming.
 */
