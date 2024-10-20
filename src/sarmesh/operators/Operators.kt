package sarmesh.operators

/*
Input Resources:
 - Kotlin Operators Documentation (W3Schools)
 - Kotlin Language Documentation
 - Official Kotlin Website

My topic is Operators in Kotlin


Output Resources:
- [Your Slides]
- [Your Articles]
- [Your Videos]

About this Program:
- Understanding different operators in Kotlin
- Types of operators in Kotlin: Arithmetic, Assignment, Comparison, Logical, etc.
- Operator overloading in Kotlin
- Kotlin operator precedence
- Proof of correct operator usage with working examples

KOTLIN is [COMPILED], [OBJECT-ORIENTED], [HIGH LEVEL] Also [STRONGLY TYPED] and [STATICALLY TYPED]
*/
/*
 * Kotlin Operators Overview
 => Operators in Kotlin are special symbols used to carry out operations on variables and values.
    Kotlin supports various operators, including arithmetic, comparison, assignment, logical, and more.
 */

fun main() {
    // 1. Arithmetic Operators in Kotlin
    /*
     * Arithmetic operators are used to perform basic math operations like addition, subtraction, etc.
     * Supported operators: +, -, *, /, %
     */
    val a = 10
    val b = 5

    val sum = a + b       // Adds a and b, result = 15
    val diff = a - b      // Subtracts b from a, result = 5
    val product = a * b   // Multiplies a and b, result = 50
    val quotient = a / b  // Divides a by b, result = 2
    val remainder = a % b // Gives remainder of a divided by b, result = 0

    // Proof: Print the results of arithmetic operations
    println("Sum: $sum")
    println("Difference: $diff")
    println("Product: $product")
    println("Quotient: $quotient")
    println("Remainder: $remainder")

    // 2. Assignment Operators in Kotlin
    /*
     * Assignment operators are used to assign values to variables.
     * Standard assignment operator is '=', but there are compound assignment operators like +=, -=, *=, /=.
     */
    var num = 10          // Standard assignment
    num += 5              // Equivalent to num = num + 5, num becomes 15
    num -= 3              // Equivalent to num = num - 3, num becomes 12
    num *= 2              // Equivalent to num = num * 2, num becomes 24
    num /= 4              // Equivalent to num = num / 4, num becomes 6

    // Proof: Print the results of assignment operations
    println("Updated value of num: $num")

    // 3. Comparison Operators in Kotlin
    /*
     * Comparison operators are used to compare two values.
     * They return a Boolean result (true or false).
     * Operators: ==, !=, >, <, >=, <=
     */
    val x = 10
    val y = 20

    val isEqual = x == y      // Checks if x is equal to y, result: false
    val isNotEqual = x != y   // Checks if x is not equal to y, result: true
    val isGreater = x > y     // Checks if x is greater than y, result: false
    val isLess = x < y        // Checks if x is less than y, result: true
    val isGreaterOrEqual = x >= y  // Checks if x is greater than or equal to y, result: false
    val isLessOrEqual = x <= y     // Checks if x is less than or equal to y, result: true

    // Proof: Print comparison results
    println("x == y: $isEqual")
    println("x != y: $isNotEqual")
    println("x > y: $isGreater")
    println("x < y: $isLess")
    println("x >= y: $isGreaterOrEqual")
    println("x <= y: $isLessOrEqual")

    // 4. Logical Operators in Kotlin
    /*
     * Logical operators are used to combine multiple conditions.
     * They return true or false based on the logic.
     * Operators: && (AND), || (OR), ! (NOT)
     */
    val condition1 = (x < y)      // true
    val condition2 = (y > 15)     // true

    val logicalAnd = condition1 && condition2  // true && true => true
    val logicalOr = condition1 || condition2   // true || true => true
    val logicalNot = !condition1               // !true => false

    // Proof: Print logical operator results
    println("Logical AND: $logicalAnd")
    println("Logical OR: $logicalOr")
    println("Logical NOT: $logicalNot")


    // 5. Operator Precedence in Kotlin
    /*
     * Operator precedence determines the order in which operators are evaluated.
     * Multiplication and division have higher precedence than addition and subtraction.
     */
    val precedenceResult = 5 + 2 * 3  // First, 2*3=6, then 5+6=11
    println("Result with operator precedence: $precedenceResult")
}

/*
Conclusion:
 - Operators in Kotlin are crucial for performing operations on values.
 - Understanding each operator's usage and behavior helps in writing better and more efficient Kotlin code.
*/

