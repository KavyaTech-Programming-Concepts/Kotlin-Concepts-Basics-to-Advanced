package sarmesh.` control_flow_and_functions`

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
 - If-else statements
 - When expression (Switch equivalent)
 - For and While loops
 - Kotlin Functions
 - Function with parameters and return types
 - Default and Named arguments
 - Inline functions

KOTLIN is [COMPILED], [OBJECT-ORIENTED], [HIGH LEVEL] Also [STRONGLY TYPED] and [STATICALLY TYPED]

/*
 * Control Flow and Functions in Kotlin

 => Kotlin supports various control flow structures like `if-else`, `when`, and loops.
    Functions in Kotlin are used to group reusable blocks of code and can accept parameters and return values.
 */

// 1. If-else statements

// Basic if-else example
val x = 10
if (x > 5) {
    println("x is greater than 5")
} else {
    println("x is less than or equal to 5")
}

// If-else as an expression (returns a value)
val result = if (x > 5) "Greater" else "Smaller"
println("Result of if-else: $result")

// output: x > 5 will evaluate to true, and "x is greater than 5" will be printed.

// 2. When expression (Switch Equivalent)

/*
 * `when` is similar to a switch-case statement in other languages.
 * It compares a value against multiple cases (branches).
 * Unlike switch, when can handle more complex cases like ranges or types.
 */
val day = 3
val dayName = when(day) {
    1 -> "Monday"
    2 -> "Tuesday"
    3 -> "Wednesday"
    4 -> "Thursday"
    5 -> "Friday"
    6 -> "Saturday"
    7 -> "Sunday"
    else -> "Invalid Day"
}
println("Day is: $dayName")

// output: day = 3, so "Day is: Wednesday" will be printed.

// 3. Loops

/*
 * Loops allow repetitive execution of code blocks. Kotlin provides `for` and `while` loops.
 */

// For loop explanation:
// The `for` loop in Kotlin iterates over a range, array, or collection.
// It knows in advance how many times it will iterate (fixed number of iterations).
for (i in 1..5) {
    println("For loop iteration: $i")
}
// output: This will print "For loop iteration: 1" through "For loop iteration: 5".

/*
 * While loop explanation:
 * The `while` loop repeats as long as a given condition is true.
 * It doesn't know the number of iterations in advance and checks the condition before each loop.
 */
var counter = 1
while (counter <= 5) {
    println("While loop iteration: $counter")
    counter++
}
// output: The loop will continue printing values from 1 to 5, incrementing the counter in each iteration.

// 4. Kotlin Functions

/*
 * Functions allow code reuse. Functions can accept parameters and return values.
 * Kotlin supports default parameters and named arguments.
 */

// Basic function with parameters and return type
fun add(a: Int, b: Int): Int {
    return a + b
}

val sum = add(10, 20)
println("Sum: $sum")

// output: Function add(10, 20) will return 30, and "Sum: 30" will be printed.

// 5. Default and Named arguments

/*
 * Default Arguments:
 * A function can have default values for its parameters. If an argument is not passed when the function is called,
 * the default value is used. This reduces the need for function overloading and allows more flexible function calls.
 */
fun greet(name: String = "Guest") {
    println("Hello, $name!")
}
greet()  // Default argument used
greet("Alice")  // Passed argument used

/*
 * Named Arguments:
 * Named arguments allow specifying which parameter you're assigning a value to,
 * making the code more readable, especially when a function has many parameters or default arguments.
 */
fun displayInfo(name: String, age: Int) {
    println("Name: $name, Age: $age")
}
displayInfo(age = 25, name = "Bob")  // Using named arguments

// output:
// greet() prints "Hello, Guest!" using the default argument, and greet("Alice") prints "Hello, Alice!".
// displayInfo(age = 25, name = "Bob") uses named arguments to make the code clearer and prints "Name: Bob, Age: 25".

// 6. Inline Functions

/*
 * Inline functions can be marked with the `inline` keyword to optimize performance by preventing function call overhead.
 */
inline fun inlineFunctionExample(a: Int, b: Int): Int {
    return a + b
}

val inlineSum = inlineFunctionExample(5, 10)
println("Inline Function Result: $inlineSum")

// output: The inline function will execute without function call overhead and print "Inline Function Result: 15".

*/

fun main() {
    // 1. If-else statements
    val x = 10
    if (x > 5) {
        println("x is greater than 5")
    } else {
        println("x is less than or equal to 5")
    }

    val result = if (x > 5) "Greater" else "Smaller"
    println("Result of if-else: $result")

    // 2. When expression (Switch equivalent)
    val day = 3
    val dayName = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid Day"
    }
    println("Day is: $dayName")

    // 3. Loops
    for (i in 1..5) {
        println("For loop iteration: $i")
    }

    var counter = 1
    while (counter <= 5) {
        println("While loop iteration: $counter")
        counter++
    }

    // 4. Functions
    val sum = add(10, 20)
    println("Sum: $sum")

    // 5. Default and Named arguments
    greet()  // Uses default value
    greet("Alice")

    displayInfo(age = 25, name = "Bob")  // Named arguments

    // 6. Inline Functions
    val inlineSum = inlineFunctionExample(5, 10)
    println("Inline Function Result: $inlineSum")
}

// Function definitions
fun add(a: Int, b: Int): Int {
    return a + b
}

fun greet(name: String = "Guest") {
    println("Hello, $name!")
}

fun displayInfo(name: String, age: Int) {
    println("Name: $name, Age: $age")
}

inline fun inlineFunctionExample(a: Int, b: Int): Int {
    return a + b
}
