package sarmesh.singelton


/*
Input Resources:
 - Understanding Singleton Pattern in Kotlin: https://medium.com/@ZahraHeydari/singleton-pattern-in-kotlin-b09380c53b14
 - Kotlin Documentation
 - Dependency Injection Framework (for @Singleton annotation)

My topic is Singleton in Kotlin and the `@Singleton` Annotation

Output Resources:
- [Your Slides]
- [Your Articles]
- [Your Videos]

About this Program:
- Understanding the Singleton pattern in Kotlin.
- The use of the `object` keyword for Singleton implementation.
- Overview of the `@Singleton` annotation in DI frameworks like Dagger or Koin.

KOTLIN is [COMPILED], [OBJECT-ORIENTED], [HIGH LEVEL], [STRONGLY TYPED] and [STATICALLY TYPED]

*/

/*
 * What is a Singleton Pattern?
 => The Singleton pattern is used to ensure that a class has only one instance and provides global access to that instance.
    In Kotlin, this can be done by using the `object` keyword instead of `class`.
    A Singleton object is initialized when it is first accessed and it remains alive for the entire application lifecycle.
 */

/* Singleton Example using the `object` Keyword in Kotlin */
object MySingleton {
    // Properties and Methods of the Singleton
    var counter: Int = 0

    fun showMessage(): String {
        return "Singleton Message! Counter: $counter"
    }

    fun incrementCounter() {
        counter++
    }
}

fun main() {
    // Accessing Singleton properties and methods
    println(MySingleton.showMessage()) // Output: Singleton Message! Counter: 0

    // Increment the counter
    MySingleton.incrementCounter()
    println(MySingleton.showMessage()) // Output: Singleton Message! Counter: 1

    // Reusing the same instance
    MySingleton.incrementCounter()
    println(MySingleton.showMessage()) // Output: Singleton Message! Counter: 2
}

/*
 * Explanation:
 => The `object` keyword makes `MySingleton` a Singleton in Kotlin.
 => This ensures that there is only one instance of `MySingleton`, and it is initialized lazily when first accessed.
 => The state is shared across the application through the Singleton object.
 */

/* Singleton Example using @Singleton Annotation in Dependency Injection (e.g., Dagger2 or Koin) */
class MyService {
    fun performAction(): String {
        return "Service Action Performed"
    }
}

// Example in Dagger (Pseudo code)
/*
@Module
class AppModule {
    @Provides
    @Singleton
    fun provideMyService(): MyService {
        return MyService()
    }
}

@Component(modules = [AppModule::class])
interface AppComponent {
    fun getMyService(): MyService
}
*/

/*
 * Explanation of `@Singleton`:
 => The `@Singleton` annotation is used in Dependency Injection frameworks (like Dagger or Koin) to signify that a class should have only one instance across the entire application.
 => When the class is annotated with `@Singleton`, the DI framework ensures that the same instance is used wherever it is injected.
 => This pattern is essential in managing shared resources efficiently, such as database connections, configuration managers, or logging utilities.
 */

/*
Conclusion:
 - The Singleton pattern ensures that a class has only one instance, providing global access to it.
 - In Kotlin, the `object` keyword is a simple and effective way to implement a Singleton.
 - The `@Singleton` annotation, often used with DI frameworks like Dagger, ensures that a single instance of a class is used throughout the application lifecycle, making it a powerful tool for resource management.
 */
