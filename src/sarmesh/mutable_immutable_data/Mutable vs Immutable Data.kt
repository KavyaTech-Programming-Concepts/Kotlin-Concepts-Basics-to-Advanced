package sarmesh.mutable_immutable_data


/*
Input Resources:
 - Kotlin Documentation on Mutable and Immutable Collections: https://kotlinlang.org/docs/collections.html

My topic is Mutable Data and Immutable Data in Kotlin

Output Resources:
- [Your Slides]
- [Your Articles]
- [Your Videos]

About this Program:
- Understanding mutable and immutable data
- The differences between mutable and immutable collections
- Examples demonstrating mutable and immutable collections in action

KOTLIN is [COMPILED], [OBJECT-ORIENTED], [HIGH LEVEL] Also [STRONGLY TYPED] and [STATICALLY TYPED]

*/

/*
 * Mutable vs Immutable Data
 => Mutable data allows modifications after creation, while immutable data cannot be changed once created.
    In Kotlin, mutable and immutable data types and collections are differentiated to ensure better data integrity and thread safety.
    Using immutable data can prevent unintentional changes and bugs in your program.
 */

fun main() {
    // 1. Immutable Data
    /*
     * Immutable variables can be declared using the `val` keyword.
     * Once a variable is assigned a value, it cannot be reassigned.
     * Example: Immutable List
     */
    val immutableList: List<Int> = listOf(1, 2, 3, 4)
    println("Immutable List: $immutableList")
    // immutableList[0] = 10 // Error: Cannot modify an immutable list

    // 2. Mutable Data
    /*
     * Mutable variables can be declared using the `var` keyword.
     * The data within a mutable collection can be changed after its creation.
     * Example: Mutable List
     */
    val mutableList: MutableList<Int> = mutableListOf(1, 2, 3, 4)
    println("Mutable List before modification: $mutableList")
    mutableList.add(5) // Adding a new element
    mutableList[0] = 10 // Modifying an existing element
    println("Mutable List after modification: $mutableList")

    // 3. Immutable Map
    /*
     * Immutable maps can also be created using `val`.
     */
    val immutableMap: Map<String, Int> = mapOf("Alice" to 1, "Bob" to 2)
    println("Immutable Map: $immutableMap")
    // immutableMap["Alice"] = 10 // Error: Cannot modify an immutable map

    // 4. Mutable Map
    /*
     * Mutable maps can be created using `mutableMapOf()`.
     */
    val mutableMap: MutableMap<String, Int> = mutableMapOf("Alice" to 1, "Bob" to 2)
    println("Mutable Map before modification: $mutableMap")
    mutableMap["Alice"] = 10 // Modifying the value for key "Alice"
    mutableMap["Charlie"] = 3 // Adding a new key-value pair
    println("Mutable Map after modification: $mutableMap")

    // 5. Use Case of Immutability
    /*
     * Using immutable data structures can prevent unintended changes and improve safety in concurrent programming.
     */
    fun processList(input: List<Int>): List<Int> {
        // Immutable data can be used safely without side effects
        return input.map { it * 2 } // Returns a new list with modified values
    }

    val numbers = listOf(1, 2, 3)
    val processedNumbers = processList(numbers)
    println("Original List: $numbers")
    println("Processed List: $processedNumbers") // Original remains unchanged
}

/*
Conclusion:
 - Mutable data can be changed after creation, while immutable data cannot.
 - Use `val` for immutable data and `var` for mutable data to manage the state effectively.
 - Favor immutability where possible to enhance safety and reduce potential bugs in your code.
 */
