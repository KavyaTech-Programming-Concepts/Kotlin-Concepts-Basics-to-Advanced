package sarmesh.generics


/*
Kotlin Generics

1. Introduction to Generics in Kotlin

- Definition: Generics allow classes, interfaces, and functions to be parameterized by types. They help ensure type safety, as well as enable code reusability and flexibility.
- Generics Syntax in Kotlin: To declare a generic type, you use angle brackets (`<T>`), where `T` represents a placeholder type.
*/


///////////////
// 2. Generic Classes
///////////////

/*
2.1 Definition
- Generic Class: A class that can work with any data type, specified at runtime.
- Syntax: Define a generic class by adding `<T>` after the class name, where `T` is the generic type parameter.
*/

/// Code Examples

class Box<T>(var content: T) {
    fun getContent(): T {
        return content
    }

    fun setContent(value: T) {
        content = value
    }
}

fun boxExample() {
    val intBox = Box(42)               // Box containing an Integer
    val stringBox = Box("Hello World")  // Box containing a String

    println("Int Box contains: ${intBox.getContent()}")
    println("String Box contains: ${stringBox.getContent()}")
}

/*
2.3 Explanation
- In `Box<T>`, `T` is a placeholder for any type.
- This allows you to create a `Box` of any type, such as `Box<Int>` or `Box<String>`, making the class flexible and reusable.

2.4 Use Cases
- Generic classes are useful for building containers that store various types of data, such as lists, stacks, or custom wrappers.
*/


///////////////
// 3. Generic Functions
///////////////

/*
3.1 Definition
- Generic Function: A function that can operate on a variety of types.
- Syntax: Define a generic function by placing `<T>` before the function name.
*/

/// Code Examples

fun <T> displayContent(content: T) {
    println("Content: $content")
}

fun genericFunctionExample() {
    displayContent(123)         // Passing an Int
    displayContent("Generics")   // Passing a String
    displayContent(3.14)         // Passing a Double
}

/*
3.3 Explanation
- The `displayContent` function can accept any type of argument because it is generic.
- This allows you to reuse the function with different types, avoiding code duplication.

3.4 Use Cases
- Generic functions are ideal for operations that don’t depend on a specific type, such as printing or logging values, or performing equality checks.
*/


///////////////
// 4. Generic Constraints
///////////////

/*
4.1 Definition
- Type Constraints: Restrict a generic type to certain types or interfaces.
- Syntax: Use `where T : Type` to constrain a generic type `T` to a specific type or set of types.
*/

/// Code Examples

fun <T : Number> addNumbers(a: T, b: T): Double {
    return a.toDouble() + b.toDouble()
}

fun constraintExample() {
    println("Sum of Integers: ${addNumbers(5, 10)}")
    println("Sum of Doubles: ${addNumbers(3.5, 2.7)}")
    // addNumbers("Hello", "World") // This would cause a compile error as `String` is not a `Number`.
}

/*
4.3 Explanation
- In `addNumbers`, `T` is constrained to types that are subclasses of `Number`.
- This ensures type safety by preventing types that don’t meet the constraint from being used.

4.4 Use Cases
- Constraints are helpful when your function or class requires certain functionality, such as arithmetic operations, provided by a specific superclass or interface.
*/


///////////////
// 5. Practical Use Cases Summary
///////////////

/*
| Feature             | Characteristics                             | Example Use Case                           |
|---------------------|---------------------------------------------|--------------------------------------------|
| Generic Class       | Works with any data type                    | Container classes like Box, Pair, Triple   |
| Generic Function    | Operates on various types                   | Utility functions like display or compare  |
| Type Constraints    | Restricts types to certain types/interfaces | Arithmetic operations on Numbers           |
*/


///////////////
// 6. Conclusion
///////////////

/*
- Generics in Kotlin increase code reusability and type safety.
- Using generic classes, functions, and constraints allows flexible, type-safe operations in Kotlin.
*/

fun main() {
    println("Generic Class Example:")
    boxExample()
    println("\nGeneric Function Example:")
    genericFunctionExample()
    println("\nGeneric Constraints Example:")
    constraintExample()
}
