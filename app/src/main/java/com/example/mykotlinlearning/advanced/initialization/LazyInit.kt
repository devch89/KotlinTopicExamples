package com.example.mykotlinlearning.advanced.initialization

/**
 * azy in Kotlin is useful in a scenario when we want to create an object inside a class,
 * but that object creation is expensive and that might lead to a delay in the creation
 * of the object that is dependent on that expensive object.
 * When the lazy keyword is used the object will be created when it is called,
 * otherwise there will be no object created.
 * Lazy can be used only with non-NULLable variables.
 * Variable can only be val. "var" is not allowed.
 * Object will be initialized only once. Thereafter, you receive the value from the cache memory.
 * The object will not be initialized until it has been used in the application.
 */

class LazyDemo() {
    val myString: String by lazy {
        println("This is Lazy declaration");
        "lazyinit Online"
    }
}

fun main() {
    var obj = LazyDemo();
    println(obj.myString);
    println("Second call to the same object--" + obj.myString);
}