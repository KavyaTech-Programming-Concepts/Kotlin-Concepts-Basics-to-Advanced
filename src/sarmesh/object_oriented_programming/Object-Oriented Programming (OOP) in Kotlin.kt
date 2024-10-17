package sarmesh.oop

/*
 * Kotlin and Object-Oriented Programming (OOP)
 => Kotlin is fully object-oriented and provides full support for OOP principles such as:
    - Classes and Objects
    - Inheritance
    - Polymorphism
    - Encapsulation
    - Abstraction
 */

// 1. Classes and Objects

/*
 * A class is a blueprint for creating objects (instances). It defines properties and functions that
 * an object will have. Objects are instances of a class and can store data and perform actions.
 * In Kotlin, you define a class using the `class` keyword.
 */

// Example: Creating a class for a car
class Car(val make: String, val model: String, var speed: Int) {
    // Function to accelerate the car
    fun accelerate() {
        speed += 10
        println("Accelerating! Current speed: $speed")
    }

    // Function to apply brakes
    fun brake() {
        speed -= 10
        println("Braking! Current speed: $speed")
    }
}

// Proof of Class and Object: Creating an object of `Car`
// Explanation:
// The `Car` class has two immutable properties `make` and `model`, and one mutable property `speed`.
// The class also contains two functions, `accelerate()` and `brake()` to modify the car's speed.

/*val car = Car("Toyota", "Corolla", 50)
println("Car Make: ${car.make}, Model: ${car.model}, Speed: ${car.speed}")
car.accelerate()
car.brake()

 */

// 2. Inheritance

/*
 * Inheritance allows a class to acquire properties and methods of another class.
 * The base class (or parent class) is declared with the `open` keyword to allow inheritance,
 * while the subclass (child class) uses a colon `:` to inherit from the parent class.
 */

// Example: Creating a parent class `Vehicle` and a child class `Motorcycle`
open class Vehicle(val type: String, val brand: String) {
    // Function to start the vehicle
    open fun start() {
        println("$brand $type is starting...")
    }
}

// Child class inheriting from Vehicle
class Motorcycle(brand: String) : Vehicle("Motorcycle", brand) {
    // Overriding the start function
    override fun start() {
        println("$brand Motorcycle is starting...")
    }
}

// Proof of Inheritance: Motorcycle class inherits from Vehicle
// Explanation:
// The `Motorcycle` class inherits the properties and methods of the `Vehicle` class. It overrides
// the `start()` function to provide a custom implementation specific to motorcycles.

/*
val motorcycle = Motorcycle("Honda")
motorcycle.start()  // Calls overridden start function
 */



// 3. Polymorphism

/*
 * Polymorphism allows objects to be treated as instances of their parent class, but the actual behavior
 * depends on the runtime type of the object. This is achieved through method overriding.
 */

// Example: Demonstrating polymorphism

/*
val vehicle: Vehicle = Motorcycle("Yamaha")
vehicle.start()  // Proof of Polymorphism: Calls Motorcycle's start method due to runtime type

 */

// Explanation:
// Although `vehicle` is declared as a `Vehicle`, it holds a reference to a `Motorcycle` object.
// At runtime, the overridden `start()` method of `Motorcycle` is called, demonstrating polymorphism.


// 4. Encapsulation

/*
 * Encapsulation is the practice of hiding the internal details of a class from the outside world
 * and exposing only the necessary components. It is achieved using visibility modifiers such as `private`, `protected`, and `public`.
 */

// Example: Creating a class with encapsulation
class Account(private var balance: Double) {
    // Method to deposit money
    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited: $amount, New Balance: $balance")
        }
    }

    // Method to withdraw money
    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Withdrew: $amount, New Balance: $balance")
        } else {
            println("Insufficient funds!")
        }
    }

    // Method to get the balance (read-only access)
    fun getBalance(): Double {
        return balance
    }
}

// Proof of Encapsulation: Access to `balance` is restricted and can only be modified through methods
// Explanation:
// The `balance` property is private, meaning it cannot be accessed directly from outside the class.
// The class provides methods like `deposit()` and `withdraw()` to safely modify the balance, enforcing encapsulation.

/*val account = Account(1000.0)
account.deposit(200.0)
account.withdraw(150.0)
// account.balance  // Error: Cannot access private property directly
println("Balance: ${account.getBalance()}")

 */


// 5. Abstraction

/*
 * Abstraction is the process of hiding complex implementation details and showing only the essential features.
 * In Kotlin, this is achieved using abstract classes or interfaces.
 */

// Example: Creating an abstract class and concrete implementation
abstract class Shape {
    abstract fun area(): Double  // Abstract method
    abstract fun perimeter(): Double  // Abstract method
}

// Concrete implementation of abstract class
class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}

// Proof of Abstraction: Shape is abstract, and Circle provides the concrete implementation
// Explanation:
// The `Shape` class provides abstract definitions for `area()` and `perimeter()`. The `Circle` class
// implements these methods with concrete logic. Abstraction allows the separation of interface from implementation.

/*
val circle = Circle(5.0)
println("Circle Area: ${circle.area()}")
println("Circle Perimeter: ${circle.perimeter()}")
*/

fun main() {
    // 1. Proof of Classes and Objects
    val car = Car("Toyota", "Corolla", 50)
    println("Car Make: ${car.make}, Model: ${car.model}, Speed: ${car.speed}")
    car.accelerate()
    car.brake()

    // 2. Proof of Inheritance
    val motorcycle = Motorcycle("Honda")
    motorcycle.start()

    // 3. Proof of Polymorphism
    val vehicle: Vehicle = Motorcycle("Yamaha")
    vehicle.start()

    // 4. Proof of Encapsulation
    val account = Account(1000.0)
    account.deposit(200.0)
    account.withdraw(150.0)
    println("Balance: ${account.getBalance()}")

    // 5. Proof of Abstraction
    val circle = Circle(5.0)
    println("Circle Area: ${circle.area()}")
    println("Circle Perimeter: ${circle.perimeter()}")
}
