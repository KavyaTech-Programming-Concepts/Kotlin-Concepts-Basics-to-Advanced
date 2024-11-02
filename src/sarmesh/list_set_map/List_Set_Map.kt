package sarmesh.list_set_map

/*
Kotlin Collections: Lists, Sets, and Maps

1. Introduction to Kotlin Collections

- Definition: Collections are data structures that group multiple items in a single object. They make it easier to manage groups of related items.
- Types of Collections in Kotlin: Kotlin primarily provides three main collection types:
  - List: An ordered collection that allows duplicates.
  - Set: A collection of unique elements.
  - Map: A collection of key-value pairs.
*/

///////////////
// 2. Lists in Kotlin
///////////////

/*
2.1 Definition
- List: An ordered collection of elements that allows duplicates.
- Types of Lists:
  - Immutable List: Created with `listOf()`, does not allow modification.
  - Mutable List: Created with `mutableListOf()`, allows addition, removal, and modification of elements.
*/

/// Code Examples

fun listExample() {
    // Immutable List
    val fruits = listOf("Apple", "Banana", "Cherry")
    println(fruits)  // Output: [Apple, Banana, Cherry]

    // Mutable List
    val mutableFruits = mutableListOf("Apple", "Banana")
    mutableFruits.add("Cherry")
    println(mutableFruits)  // Output: [Apple, Banana, Cherry]
}

/*
2.3 Explanation
- Lists are indexed, meaning you can access elements by their position.
- Mutable lists allow operations like adding or removing items.

2.4 Use Cases
- Use a List when you need an ordered collection of elements, such as for a list of items displayed in a specific order.
*/


///////////////
// 3. Sets in Kotlin
///////////////

/*
3.1 Definition
- Set: A collection of unique elements. Sets do not allow duplicates.
- Types of Sets:
  - Immutable Set: Created with `setOf()`, does not allow modification.
  - Mutable Set: Created with `mutableSetOf()`, allows addition and removal of elements.
*/

/// Code Examples

fun setExample() {
    // Immutable Set
    val colors = setOf("Red", "Green", "Blue")
    println(colors)  // Output: [Red, Green, Blue]

    // Mutable Set
    val mutableColors = mutableSetOf("Red", "Green")
    mutableColors.add("Blue")   // Adds "Blue" as it’s unique
    mutableColors.add("Green")  // No change, "Green" is a duplicate
    println(mutableColors)      // Output: [Red, Green, Blue]
}

/*
3.3 Explanation
- Sets are ideal when you need unique items only, such as a list of unique tags or categories.

3.4 Use Cases
- Use a Set when you want a collection of unique elements, such as for tracking unique user IDs or items in a selection.
*/


///////////////
// 4. Maps in Kotlin
///////////////

/*
4.1 Definition
- Map: A collection of key-value pairs. Each key is unique, while values can be duplicated.
- Types of Maps:
  - Immutable Map: Created with `mapOf()`, does not allow modification.
  - Mutable Map: Created with `mutableMapOf()`, allows addition and removal of entries.
*/

/// Code Examples

fun mapExample() {
    // Immutable Map
    val countries = mapOf("US" to "United States", "IN" to "India")
    println(countries)  // Output: {US=United States, IN=India}

    // Mutable Map
    val mutableCountries = mutableMapOf("US" to "United States")
    mutableCountries["IN"] = "India"  // Adds a new entry
    println(mutableCountries)         // Output: {US=United States, IN=India}
}

/*
4.3 Explanation
- Maps are used when you need to associate unique keys with values, allowing for fast lookups by key.

4.4 Use Cases
- Use a Map for key-value relationships, such as storing user IDs with names, or product IDs with descriptions.
*/


///////////////
// 5. Practical Use Cases Summary
///////////////

/*
| Collection | Characteristics               | Example Use Case                         |
|------------|-------------------------------|------------------------------------------|
| List       | Ordered, allows duplicates    | Displaying items in a particular order   |
| Set        | Unique elements only          | Storing unique tags or IDs              |
| Map        | Key-value pairs, keys unique  | Associating usernames with user data     |
*/


///////////////
// 6. Conclusion
///////////////

/*
- Kotlin’s collection types (List, Set, Map) offer flexible ways to manage data.
- Choosing the right collection type helps make code cleaner and more efficient.
*/

fun main() {
    println("List Example:")
    listExample()
    println("\nSet Example:")
    setExample()
    println("\nMap Example:")
    mapExample()
}
