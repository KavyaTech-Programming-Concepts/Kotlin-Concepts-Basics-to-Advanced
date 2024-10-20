package sarmesh.control_flow
/*
Input Resources:
 - Kotlin Control Flow Documentation (KotlinLang) link: https://kotlinlang.org/docs/control-flow.html
 - Kotlin Documentation

My topic is Control Flow in Kotlin


Output Resources:
- [Your Slides]
- [Your Articles]
- [Your Videos]

About this Program:
- Understanding control flow statements in Kotlin
- Different control structures: `if`, `when`, `for`, `while`, and `do-while`
- Using expressions vs statements
- Looping constructs and their variations
- Proof of working code with control structures in action

KOTLIN is [COMPILED], [OBJECT-ORIENTED], [HIGH LEVEL] Also [STRONGLY TYPED] and [STATICALLY TYPED]
*/
/*
 * Kotlin Control Flow Overview
 => Control flow statements in Kotlin direct the flow of execution in a program.
    Kotlin provides several control flow constructs such as `if`, `when`, `for`, `while`, and `do-while`.
    These help in making decisions and executing code repeatedly.
 */

fun main() {
    // 1. The `if` Expression
    /*
     * The `if` statement in Kotlin works similarly to other languages, but it can also be used as an expression.
     * Syntax:
     * if (condition) {
     *    // block of code
     * } else {
     *    // block of code
     * }
     * Additionally, `if` can return values as an expression:
     * val result = if (condition) value1 else value2
     */
    val a = 10
    val b = 20

    // If statement example
    if (a > b) {
        println("$a is greater than $b")
    } else {
        println("$a is less than or equal to $b")
    }

    // If as an expression
    val max = if (a > b) a else b
    println("The maximum value is: $max")

    // 2. The `when` Expression
    /*
     * The `when` expression in Kotlin is used for conditional branching.
     * It is a more powerful and flexible version of the switch statement found in other languages.
     * Syntax:
     * when (variable) {
     *    value1 -> // code block
     *    value2 -> // code block
     *    else -> // default case
     * }
     */
    val x = 3

    when (x) {
        1 -> println("x is 1")
        2 -> println("x is 2")
        3, 4 -> println("x is 3 or 4")
        else -> println("x is neither 1, 2, 3 nor 4")
    }

    // When as an expression with return value
    val result = when (x) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        else -> "Unknown"
    }
    println("The result of `when` expression is: $result")

    // 3. The `for` Loop
    /*
     * The `for` loop in Kotlin is used to iterate through a range, array, or collection.
     * Syntax:
     * for (item in collection) {
     *    // block of code
     * }
     */
    val numbers = arrayOf(1, 2, 3, 4, 5)

    // For loop example
    for (number in numbers) {
        println("Current number: $number")
    }

    // For loop with range
    for (i in 1..5) {
        println("i in range 1 to 5: $i")
    }

    // For loop with step
    for (i in 1..10 step 2) {
        println("i in range 1 to 10 with step 2: $i")
    }

    // 4. The `while` Loop
    /*
     * The `while` loop executes as long as a condition is true.
     * Syntax:
     * while (condition) {
     *    // block of code
     * }
     */
    var counter = 5

    while (counter > 0) {
        println("Counter is: $counter")
        counter--
    }

    // 5. The `do-while` Loop
    /*
     * The `do-while` loop is similar to `while`, but the code block is executed at least once before checking the condition.
     * Syntax:
     * do {
     *    // block of code
     * } while (condition)
     */
    var doCounter = 3

    do {
        println("Do-while counter is: $doCounter")
        doCounter--
    } while (doCounter > 0)

    // 6. Breaking and Continuing in Loops
    /*
     * `break` is used to exit a loop early, and `continue` is used to skip the current iteration.
     * These can be applied inside both `for` and `while` loops.
     */
    for (i in 1..5) {
        if (i == 3) break  // Exits the loop when i equals 3
        println("i before break: $i")
    }

    for (i in 1..5) {
        if (i == 3) continue  // Skips the iteration when i equals 3
        println("i with continue: $i")
    }
}

/*
Conclusion:
 - Kotlin provides various control flow constructs to manage program execution based on conditions and loops.
 - Proper understanding of `if`, `when`, `for`, `while`, `do-while` ensures writing efficient Kotlin programs.
*/

