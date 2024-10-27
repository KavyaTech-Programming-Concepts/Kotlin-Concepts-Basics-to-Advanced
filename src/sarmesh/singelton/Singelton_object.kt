package sarmesh.singelton

/*
Input Resources:
 - Baeldung on Singleton in Kotlin: https://www.baeldung.com/kotlin/singleton-pattern
 - Kotlin Documentation

My topic is Singleton Pattern in Kotlin

Output Resources:
- [Your Slides]
- [Your Articles]
- [Your Videos]

About this Program:
- Understanding the Singleton pattern and its benefits
- Kotlin’s `object` declaration for Singleton implementation
- Proof of Singleton behavior in Kotlin
- Singleton use cases

KOTLIN is [COMPILED], [OBJECT-ORIENTED], [HIGH LEVEL], [STRONGLY TYPED], and [STATICALLY TYPED]

*/

/*
 * What is a Singleton?
 => A Singleton is a design pattern that restricts a class to a single instance, ensuring only one global instance exists.
 => This approach is commonly used for managing shared resources or settings across an application.
 => In Kotlin, `object` declaration provides a simple way to implement a singleton that is thread-safe and lazily initialized.
 */

object DatabaseConnection {
    init {
        println("Database Connection Initialized")
    }

    // Method to simulate a database query
    fun query(sql: String): String {
        return "Executing query: $sql"
    }
}

/*
Explanation:
 => The `DatabaseConnection` object is a singleton due to the `object` keyword.
 => The `init` block is executed only once, demonstrating single initialization.
 => All methods inside `DatabaseConnection` share the same instance.
 */

fun main() {
    // Accessing the Singleton instance and performing operations
    println(DatabaseConnection.query("SELECT * FROM users"))
    println(DatabaseConnection.query("SELECT * FROM products"))
}

/*
 * Advantages of Using Singleton Pattern in Kotlin:
 => Simplifies access to a single shared instance throughout the application.
 => Ensures only one instance is created, reducing memory usage.
 => Useful for centralized configurations, database connections, or network services.
 */

/*
Conclusion:
 - Kotlin’s `object` keyword simplifies the Singleton pattern, offering a thread-safe, lazily initialized instance.
 - The Singleton pattern is effective for managing shared, centralized resources.
 */
