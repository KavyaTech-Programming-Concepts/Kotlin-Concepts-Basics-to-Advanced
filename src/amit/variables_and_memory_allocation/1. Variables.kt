package amit.variables_and_memory_allocation

/*
Input Resources:
 -
 -
 -

Output Resources:
 - [Your Slides]
 - [Your Artciles]
 - [Your Videos]

About this Program:
 -declaring/creating variables
 -printing the variables
 -performing some operations like sum, mul, etc.
 -checking the memory location of the variables using the id() function
 -checking the type of variables using the type() function
 -concept of [Object Interring]

KOTLIN is [COMPILED], [OBJECT-ORIENTED], [HIGH LEVEL] Also [STRONGLY TYPED] and [STATICALLY TYPED]

Weak Type vs Strong Type
Strong typing means that variables do have a type and that the type matters when performing operations on a variable.
Weak typing means that variables can be implicitly converted between types during operations, and the type of the variable may not strictly matter when performing operations.

Static Type vs Dynamic Type
Dynamic typing means that the type of the variable is determined only during runtime.
Stat

Python is both a [STRONGLY TYPED] and [DYNAMIC TYPED] language.

Strong typing means that variables do have a type and that the type matters when performing operations on a variable:
It means you cannot add 1 + '1' i.e., int + str.

Dynamic typing means that the type of the variable is determined only during runtime.

Relation of [DYNAMIC TYPED] and [INTERPRETED LANGUAGE]:

QUESTION: Are all interpreted languages dynamically typed?
Yes. All dynamic languages are interpreted languages (but an interpreted language could be non-dynamic).
The reason is simple: if it is dynamic, it needs an interpreter to perform the dynamism at the level of the binary compilation.

Interpreted languages use dynamic typing because there is no compilation step in which to do the static analysis.
Compiled languages do static analysis at compilation time, which means that any type errors are reported to the developer as they work.

*/



fun main(){

    // Dynamic Type Example
    var x = 10 // x is a Int
    println(x)

    x=100 // x is still a Int
    println(x)
//    x=10.1 // x cannot point/refer to a float value, since Kotlin is a dynamic type language

    // Strong Type
    val y = 10

}

