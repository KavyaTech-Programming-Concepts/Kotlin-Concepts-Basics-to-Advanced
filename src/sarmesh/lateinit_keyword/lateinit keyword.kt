package sarmesh.lateinit_keyword

/*
Input Resources:
 - GeeksforGeeks: Lateinit Variable in Kotlin: https://www.geeksforgeeks.org/lateinit-variable-in-kotlin/

My topic is the `lateinit` Keyword in Kotlin

Output Resources:
- [Your Slides]
- [Your Articles]
- [Your Videos]

About this Program:
- Understanding the `lateinit` keyword in Kotlin
- When and why to use `lateinit`
- Examples demonstrating `lateinit` in action

KOTLIN is [COMPILED], [OBJECT-ORIENTED], [HIGH LEVEL] Also [STRONGLY TYPED] and [STATICALLY TYPED]

*/

/*
 * What is the `lateinit` Keyword?
 => The `lateinit` modifier in Kotlin is used with `var` properties that will be initialized later in the code.
    It allows you to declare a non-nullable variable without providing an initial value.
    This is particularly useful for dependency injection, unit testing, or when the initialization is dependent on the external environment.
    Note that `lateinit` cannot be used with primitive types or `val` properties.
 */

fun main() {
    // 1. Declaring a Lateinit Variable
    /*
     * You can declare a variable with the `lateinit` modifier to indicate that it will be initialized later.
     */
    lateinit var name: String

    // 2. Initializing the Lateinit Variable
    /*
     * Ensure that you initialize the `lateinit` variable before using it,
     * or else you will encounter an UninitializedPropertyAccessException.
     */
    name = "Kotlin Lateinit Example"

    // 3. Accessing the Lateinit Variable
    /*
     * You can use the `lateinit` variable like a regular variable after it has been initialized.
     */
    println("Lateinit Variable: $name")

    // 4. Checking Initialization
    /*
     * You can check whether a `lateinit` variable has been initialized using the `::` operator.
     */


    // 5. Example of Uninitialized Access
    /*
     * Uncommenting the next line will throw an UninitializedPropertyAccessException
     * since the variable is not initialized.
     */
    // println("Uninitialized Variable: $name") // Uncommenting this line will cause an exception

    // 6. Use Case: Dependency Injection
    /*
     * The `lateinit` keyword is commonly used in scenarios like dependency injection
     * where the dependencies are initialized later, for example, in Android.
     */
    class UserService {
        lateinit var userName: String

        fun initialize(name: String) {
            userName = name
        }

        fun displayUser() {
            // Checking if userName is initialized
            if (::userName.isInitialized) {
                println("User Name: $userName")
            } else {
                println("User Name not initialized yet.")
            }
        }
    }

    val userService = UserService()
    userService.displayUser() // Before initialization
    userService.initialize("Alice")
    userService.displayUser() // After initialization
}

/*
Conclusion:
 - The `lateinit` keyword allows the declaration of non-nullable variables that can be initialized later.
 - It is useful for scenarios where initialization is dependent on external factors, such as dependency injection.
 - Always ensure that a `lateinit` variable is initialized before accessing it to avoid exceptions.
 */
