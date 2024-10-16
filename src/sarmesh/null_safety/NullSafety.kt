package sarmesh.null_safety

/*
Input Resources:
 -
 -
 -

Output Resources:
 - [Your Slides]
 - [Your Articles]
 - [Your Videos]

About this Program:
 - Understanding null safety in Kotlin
 - Nullable and non-nullable types
 - Safe calls and Elvis operator
 - The !! operator and its risks
 - Nullable types in collections
 - Proof of safe and unsafe null handling

KOTLIN is [COMPILED], [OBJECT-ORIENTED], [HIGH LEVEL] Also [STRONGLY TYPED] and [STATICALLY TYPED]

/*
 * Kotlin Null Safety and Handling Null Pointers
 => Kotlin has built-in null safety to avoid NullPointerExceptions (NPEs).
    Kotlin differentiates between nullable and non-nullable types, ensuring safe access to variables and methods.
 */

// 1. Nullable vs Non-Nullable Types

/*
 * In Kotlin, types are non-nullable by default, meaning variables cannot be assigned null values unless explicitly marked as nullable.
 */

// Non-nullable type: Cannot hold null values
val nonNullableName: String = "John"
// nonNullableName = null  // Error: 'null' cannot be a value of a non-null type String

// Nullable type: Can hold null values (denoted with ?)
val nullableName: String? = null  // Allowed: Can store null
val nullableAge: Int? = null

// Proof: Uncommenting the invalid assignment to a non-nullable variable will cause a compilation error.


// 2. Safe Calls (?.) and the Elvis Operator (?:)

/*
 * Safe calls allow calling methods or accessing properties on nullable variables safely.
 * The Elvis operator provides a default value when the variable is null.
 */

// Safe call: Only executes if the variable is not null
val length: Int? = nullableName?.length
println("Length of nullableName: $length")  // Safe: Prints null since nullableName is null

// Elvis operator: Provides default value if null
val nameOrDefault = nullableName ?: "Unknown"
println("Name with Elvis operator: $nameOrDefault")

// Proof: If nullableName is null, the Elvis operator assigns "Unknown" as the default value.

// 3. The !! Operator (Not-null Assertion)

/*
 * The !! operator forces Kotlin to treat a nullable type as non-null.
 * If the value is null, it will throw a NullPointerException (NPE).
 */

// Using !! to forcefully unwrap a nullable variable
// val forcedLength = nullableName!!.length  // Error: This will throw NPE if nullableName is null

// Proof: Uncomment the above line to observe a NullPointerException when nullableName is null.

// 4. Nullable Types in Collections

/*
 * Collections in Kotlin can also store nullable types.
 * The same null safety mechanisms apply to list elements.
 */

// List of nullable types
val nullableList: List<String?> = listOf("Apple", null, "Banana")
println("Nullable List: $nullableList")

// Accessing nullable elements with safe calls
val firstItemLength: Int? = nullableList[0]?.length
val secondItemLength: Int? = nullableList[1]?.length

println("Length of first item: $firstItemLength")  // Safe: Prints the length of "Apple"
println("Length of second item (null): $secondItemLength")  // Safe: Prints null for null item

// Proof: Safe call prevents NullPointerException when accessing a nullable item in the list.

*/

fun main() {
    // 1. Nullable vs Non-Nullable Types
    val nonNullableName: String = "John"
    println("Non-Nullable Name: $nonNullableName")

    val nullableName: String? = null  // Nullable type
    println("Nullable Name: $nullableName")

    val nullableAge: Int? = null
    println("Nullable Age: $nullableAge")

    // 2. Safe Calls (?.) and the Elvis Operator (?:)
    val length: Int? = nullableName?.length
    println("Safe call (nullableName length): $length")  // Prints null

    val nameOrDefault = nullableName ?: "Unknown"
    println("Elvis operator result: $nameOrDefault")  // Prints "Unknown"

    // 3. The !! Operator (Not-null Assertion)
    // Uncomment to see the NullPointerException (NPE)
    // val forcedLength = nullableName!!.length  // This will throw NPE if nullableName is null

    // 4. Nullable Types in Collections
    val nullableList: List<String?> = listOf("Apple", null, "Banana")
    println("Nullable List: $nullableList")

    val firstItemLength: Int? = nullableList[0]?.length
    val secondItemLength: Int? = nullableList[1]?.length

    println("Length of first item: $firstItemLength")  // Length of "Apple"
    println("Length of second item (null): $secondItemLength")  // Prints null
}
