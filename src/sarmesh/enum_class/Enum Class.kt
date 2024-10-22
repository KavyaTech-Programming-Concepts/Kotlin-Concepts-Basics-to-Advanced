package sarmesh.enum_classes

/*
Input Resources:
 - Kotlin Enum Classes Documentation: https://kotlinlang.org/docs/enum-classes.html

My topic is Enum Classes in Kotlin

Output Resources:
- [Your Slides]
- [Your Articles]
- [Your Videos]

About this Program:
- Understanding how to create and use enum classes in Kotlin.
- Defining properties and methods in enum constants.
- Using enums in Kotlin switch-case (`when`) expressions.

KOTLIN is [COMPILED], [OBJECT-ORIENTED], [HIGH LEVEL], [STRONGLY TYPED] and [STATICALLY TYPED]

*/

/*
 * What is an Enum Class?
 => An enum class is a special kind of class that is used to represent a group of constants.
    Each enum constant is an instance of the enum class and can also have its own properties and methods.
 */

enum class Direction {
    NORTH, SOUTH, EAST, WEST
}

fun main() {
    // Accessing enum constants
    val direction = Direction.NORTH
    println("Selected direction: $direction")

    // Using enum in a when expression
    when (direction) {
        Direction.NORTH -> println("You are heading North!")
        Direction.SOUTH -> println("You are heading South!")
        Direction.EAST -> println("You are heading East!")
        Direction.WEST -> println("You are heading West!")
    }

    // Working with enums that have properties and methods
    val color = Color.RED
    println("Color: ${color.name}, RGB: ${color.rgb()}")
}

/*
 * Enum Constants with Properties and Methods
 => Enum constants can have properties and methods.
    To define properties, you can add a constructor to the enum class.
 */

enum class Color(val hex: String) {
    RED("#FF0000") {
        override fun rgb() = "RGB(255, 0, 0)"
    },
    GREEN("#00FF00") {
        override fun rgb() = "RGB(0, 255, 0)"
    },
    BLUE("#0000FF") {
        override fun rgb() = "RGB(0, 0, 255)"
    };

    // Abstract method in the enum class
    abstract fun rgb(): String
}

/*
 * Explanation:
 => The `Color` enum class has a constructor that takes a hex code as a parameter.
 => Each enum constant overrides the `rgb()` method to return its RGB value.
 */

/*
Conclusion:
 - Enum classes in Kotlin are used to represent a fixed set of constants.
 - They can have properties, methods, and even constructors.
 - Enums can be used in `when` expressions to manage cases where only specific values are allowed.
 */
