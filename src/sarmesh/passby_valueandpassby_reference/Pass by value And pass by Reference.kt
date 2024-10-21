package sarmesh.passby_valueandpassby_reference


/*
Input Resources:
 - Baeldung Article on Pass by Value and Pass by Reference in Kotlin: https://www.baeldung.com/kotlin/parameters-pass-value-reference
 - Kotlin Documentation

My topic is Pass by Value and Pass by Reference in Kotlin

Output Resources:
- [Your Slides]
- [Your Articles]
- [Your Videos]

About this Program:
- Understanding Pass by Value vs Pass by Reference in Kotlin
- Demonstrating how Kotlin handles function arguments with both value types and reference types
- Proof of working code that shows how Kotlin behaves for value and reference passing

KOTLIN is [COMPILED], [OBJECT-ORIENTED], [HIGH LEVEL] Also [STRONGLY TYPED] and [STATICALLY TYPED]

*/

/*
 * Pass by Value vs Pass by Reference
 => In Kotlin, all function arguments are passed by value, but the behavior depends on whether the argument is a primitive type or an object reference.
    - Pass by Value: For primitive data types, a copy of the value is passed to the function.
    - Pass by Reference: For objects, the reference to the object (memory address) is passed, meaning modifications made to the object's properties within the function will affect the original object.
 */

fun main() {
    // 1. Pass by Value Example (Primitive Types)
    /*
     * In Kotlin, primitive types like Int, Double, etc., are passed by value.
     * A copy of the value is passed to the function, and any modifications inside the function do not affect the original value.
     */
    var num = 10
    println("Original value of num: $num")
    modifyPrimitive(num)
    println("Value of num after function call: $num") // Unchanged

    // 2. Pass by Reference Example (Objects)
    /*
     * When an object is passed to a function, the reference to the object is passed, not a copy of the object.
     * Thus, any changes made to the object's properties within the function will affect the original object.
     */
    val car = Car("Toyota", "Corolla", 2020)
    println("\nOriginal car details: ${car.displayInfo()}")
    modifyObject(car)
    println("Car details after function call: ${car.displayInfo()}") // Changed

    // 3. Attempting to Reassign Object Reference in Function
    /*
     * Reassigning the object reference inside a function doesn't affect the original reference in the calling code.
     * The object reference outside the function remains unchanged.
     */
    val car2 = Car("Honda", "Civic", 2021)
    println("\nOriginal car2 details: ${car2.displayInfo()}")
    reassignReference(car2)
    println("Car2 details after function call: ${car2.displayInfo()}") // Unchanged, reference remains the same
}

// Function to modify a primitive type (Pass by Value)
fun modifyPrimitive(number: Int) {
    var modifiedNumber = number
    modifiedNumber += 10
    println("Inside function: modified number = $modifiedNumber") // Modifies the local copy
}

// Class definition for Car
class Car(var make: String, var model: String, var year: Int) {
    fun displayInfo(): String {
        return "Make: $make, Model: $model, Year: $year"
    }
}

// Function to modify an object's properties (Pass by Reference)
fun modifyObject(car: Car) {
    car.year = 2022 // Modifying the property of the object
    println("Inside function: updated car year to ${car.year}")
}

// Function attempting to reassign object reference (does not affect original reference)
fun reassignReference(car: Car) {
    val newCar = Car("Tesla", "Model 3", 2023) // New object reference inside the function
    println("Inside function: new car created with ${newCar.displayInfo()}")
    // This reassignment only affects the local reference inside the function
}

/*
Conclusion:
 - In Kotlin, all parameters are passed by value, but how this works depends on the type.
 - Primitive types are passed by value, and modifications within the function do not affect the original value.
 - Objects are passed by reference, meaning any changes to the object’s properties within the function will reflect in the original object.
 - Reassigning object references inside a function does not affect the original reference outside the function.
*/
