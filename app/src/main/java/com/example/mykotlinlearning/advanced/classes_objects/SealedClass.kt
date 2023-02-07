package com.example.mykotlinlearning.advanced.classes_objects

/**
 * This type of class is used to represent a restricted class hierarchy.
 * Sealed allows the developers to maintain a data type of a predefined type.
 * To make a sealed class, we need to use the keyword “sealed” as a modifier of that class.
 * A sealed class can have its own subclass but all those subclasses need to be declared inside
 * the same Kotlin file along with the sealed class.
 */
sealed class Options {
    class OPA : Options()
    class OPB : Options()
}

fun main(){
    val obj : Options = Options.OPB()

    val output = when(obj){
        is Options.OPA -> "Option A has been chosen"
        is Options.OPB -> "Option B has been chosen"
    }

    println(output)
}