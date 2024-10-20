package sarmesh.array


/*
Input Resources:
 - Kotlin Arrays Documentation: https://kotlinlang.org/docs/arrays.html

My topic is Kotlin Arrays

Output Resources:
- [Your Slides]
- [Your Articles]
- [Your Videos]

About this Program:
- Understanding what an array is in Kotlin
- Declaring and initializing arrays
- Accessing array elements
- Array operations (size, iteration)
- Multidimensional arrays
- Proof of working code demonstrating each concept

KOTLIN is [COMPILED], [OBJECT-ORIENTED], [HIGH LEVEL] Also [STRONGLY TYPED] and [STATICALLY TYPED]

*/

/*
 * What is an Array?
 => An array is a collection of elements of the same type, stored in a contiguous memory location.
    Arrays are fixed-size and can be accessed via their index.
 */

fun main() {
    // 1. Declaring and Initializing Arrays
    /*
     * Arrays can be declared and initialized using the `arrayOf` function.
     * Syntax:
     * val arrayName = arrayOf(element1, element2, ...)
     */
    val numbers = arrayOf(1, 2, 3, 4, 5)
    println("Array elements: ${numbers.joinToString()}")

    // 2. Accessing Array Elements
    /*
     * Array elements can be accessed using their index.
     * Note: Array indices start from 0.
     */
    println("First element: ${numbers[0]}")
    println("Second element: ${numbers[1]}")

    // 3. Array Operations
    /*
     * Arrays have properties and methods that allow us to perform various operations.
     * - size: returns the number of elements in the array
     * - forEach: iterates over each element in the array
     */
    println("Array size: ${numbers.size}")

    println("Array elements using forEach:")
    numbers.forEach { number ->
        println(number)
    }

    // 4. Modifying Array Elements
    /*
     * Elements in an array can be modified using their index.
     */
    numbers[0] = 10 // Modifying the first element
    println("Modified array: ${numbers.joinToString()}")

    // 5. Multidimensional Arrays
    /*
     * Kotlin supports multidimensional arrays, which are arrays of arrays.
     * Syntax:
     * val multiArray = arrayOf(arrayOf(...), arrayOf(...))
     */
    val multiArray = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )

    println("Multidimensional array:")
    for (row in multiArray) {
        println(row.joinToString())
    }
}

/*
Conclusion:
 - Arrays are a fundamental data structure in Kotlin that allow the storage of multiple values of the same type.
 - They provide methods and properties to perform various operations such as accessing, modifying, and iterating over elements.
 - Multidimensional arrays offer a way to represent complex data structures in a tabular format.
*/
