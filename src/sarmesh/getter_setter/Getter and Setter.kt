package sarmesh.getter_setter


/*
Input Resources:
 - GeeksforGeeks Kotlin Setters and Getters Documentation: https://www.geeksforgeeks.org/kotlin-setters-and-getters/

My topic is Kotlin Setters and Getters

Output Resources:
- [Your Slides]
- [Your Articles]
- [Your Videos]

About this Program:
- Understanding what setters and getters are in Kotlin
- How to define and use them
- The role of encapsulation in Kotlin
- Proof of working code demonstrating setters and getters in action

KOTLIN is [COMPILED], [OBJECT-ORIENTED], [HIGH LEVEL] Also [STRONGLY TYPED] and [STATICALLY TYPED]

*/

/*
 * What are Setters and Getters?
 => Setters and getters are special methods used to access and modify the properties of a class.
    Getters retrieve property values, while setters modify them.
    In Kotlin, properties can have custom getters and setters.
 */

fun main() {
    // 1. Defining a Class with Properties
    /*
     * In Kotlin, you can define properties in a class using the `var` (mutable) or `val` (immutable) keywords.
     */
    class Person {
        var name: String = "Default Name"
            get() = field // Custom getter
            set(value) { // Custom setter
                field = value
            }

        var age: Int = 0
            get() = field // Custom getter
            set(value) {
                if (value >= 0) { // Example of validation in setter
                    field = value
                } else {
                    println("Age cannot be negative.")
                }
            }
    }

    // 2. Using Setters and Getters
    /*
     * You can access properties directly, and Kotlin automatically calls the corresponding getter or setter.
     */
    val person = Person()

    // Using setter to set the name
    person.name = "John Doe" // Calls the custom setter
    println("Person's Name: ${person.name}") // Calls the custom getter

    // Using setter to set the age
    person.age = 30 // Valid age
    println("Person's Age: ${person.age}") // Calls the custom getter

    person.age = -5 // Invalid age, demonstrates setter validation

    // 3. Automatic Getters and Setters
    /*
     * If no custom logic is needed, you can define properties without custom getters and setters.
     * Kotlin will automatically generate them.
     */
    class Employee(val empName: String, var empSalary: Double)

    val employee = Employee("Alice", 50000.0)
    println("Employee Name: ${employee.empName}")
    println("Employee Salary: ${employee.empSalary}")

    // Modifying the salary using the setter
    employee.empSalary = 60000.0
    println("Updated Employee Salary: ${employee.empSalary}")
}

/*
Conclusion:
 - Setters and getters are essential for encapsulating properties in Kotlin.
 - Custom setters can include validation or additional logic when setting property values.
 - Automatic getters and setters simplify property access when no additional logic is needed.
 - Using setters and getters enhances code readability and maintainability.
*/
