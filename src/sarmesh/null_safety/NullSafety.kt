package sarmesh.null_safety


/*
Input Resources:
 - GeeksforGeeks Kotlin Null Safety Documentation link: https://www.geeksforgeeks.org/kotlin-null-safety/
 - Kotlin Documentation

My topic is Null and Null Safety in Kotlin

Output Resources:
- [Your Slides]
- [Your Articles]
- [Your Videos]

About this Program:
- Understanding what `null` means in programming
- Nullability in Kotlin
- Kotlin's null safety mechanism and features
- Nullable types and safe operators
- Proof of working code with null safety in action

KOTLIN is [COMPILED], [OBJECT-ORIENTED], [HIGH LEVEL] Also [STRONGLY TYPED] and [STATICALLY TYPED]

*/
/*
 * What is `null`?
 => `null` represents the absence of a value. It means that a variable has no value assigned to it, or the reference is pointing to no object.
    In many programming languages, `null` can cause issues if accessed or used improperly, often leading to `NullPointerException` (NPE).
    In Kotlin, the null safety system helps avoid such runtime errors by managing nullable variables carefully.
 */

fun main() {
    // 1. Nullable and Non-nullable Types
    /*
     * In Kotlin, a variable is non-nullable by default, meaning it cannot hold a null value.
     * To allow null values, we append `?` to the type.
     * Syntax:
     * var variable: Type? = null
     */
    var nonNullableString: String = "Kotlin"
    // nonNullableString = null // Error: Cannot assign null to non-nullable type

    var nullableString: String? = "Kotlin"
    nullableString = null  // Allowed since it's a nullable type

    println("Nullable string: $nullableString")

    // 2. Safe Call Operator (?.)
    /*
     * The safe call operator `?.` is used to access properties or methods of a nullable variable.
     * If the variable is null, it returns null without throwing a `NullPointerException`.
     * Syntax:
     * nullableVariable?.method()
     */
    val length: Int? = nullableString?.length
    println("Length of nullable string using safe call: $length")

    // 3. Elvis Operator (?:)
    /*
     * The Elvis operator `?:` is used to provide a default value when a nullable variable is null.
     * If the variable is not null, it returns the value; otherwise, it returns the default value.
     * Syntax:
     * val result = nullableVariable ?: defaultValue
     */
    val defaultLength = nullableString?.length ?: 0
    println("Length using Elvis operator: $defaultLength")

    // 4. Safe Cast Operator (as?)
    /*
     * The safe cast operator `as?` attempts to cast a variable to a specific type.
     * If the cast is not possible, it returns null instead of throwing an exception.
     */
    val obj: Any = "Kotlin"
    val str: String? = obj as? String
    println("Safe cast result: $str")

    // 5. Not-null Assertion Operator (!!)
    /*
     * The not-null assertion operator `!!` is used to convert a nullable type to a non-nullable type.
     * If the variable is null, it will throw a `KotlinNullPointerException`.
     * Syntax:
     * nullableVariable!!
     */
    try {
        // Ensure nullableString is not null before using !!
        nullableString = "Kotlin"
        val nonNullLength = nullableString!!.length // Now this will work since nullableString is not null
        println("Length using not-null assertion: $nonNullLength") // Will print the length of "Kotlin"
    } catch (e: NullPointerException) {
        println("Caught NullPointerException using !! operator")
    }

    // 6. Lateinit Modifier
    /*
     * The `lateinit` modifier is used for variables that are initialized later in the code, ensuring that the variable is non-null.
     * The variable must be initialized before it is used, or an exception will be thrown.
     * Syntax:
     * lateinit var variable: Type
     */
    lateinit var lateInitString: String

    try {
        println("LateInit variable: $lateInitString")  // This will throw an exception as it's not initialized yet
    } catch (e: UninitializedPropertyAccessException) {
        println("Caught UninitializedPropertyAccessException")
    }

    // 7. Safe Access with let{}
    /*
     * The `let{}` function is often used in combination with the safe call operator to execute code only if the variable is non-null.
     * Syntax:
     * nullableVariable?.let {
     *     // block of code
     * }
     */
    nullableString = "Hello, Kotlin!"

    nullableString?.let {
        println("Executing `let` block because nullableString is not null")
        println("Inside let: String length = ${it.length}")
    }
}

/*
Conclusion:
 - `null` represents the absence of a value, which can lead to runtime issues in many languages.
 - Kotlin's null safety system helps prevent `NullPointerException` errors by clearly distinguishing between nullable and non-nullable types.
 - Using operators like `?.`, `?:`, `!!`, and `as?` ensures proper handling of nullable variables.
*/

