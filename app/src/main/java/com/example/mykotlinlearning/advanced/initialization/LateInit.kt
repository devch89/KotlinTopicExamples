package com.example.mykotlinlearning.advanced.initialization


/**
 *In order to create a "lateInit" variable, we just need to add the keyword "lateInit" as an
 * access modifier of that variable. Following are a set of conditions that need to be followed
 * in order to use "lateInit" in Kotlin.
 * Use "lateInit" with a mutable variable. That means, we need to use "var" keyword with "lateInit".
 * "lateInit" is allowed only with non-NULLable data types.
 * "lateInit" does not work with primitive data types.
 * "lateInit" can be used when the variable property does not have any getter and setter methods.
 */


class Walkthrough {

    lateinit var name : String

    fun checkLateInit(){
        // checking whether the value is assigned or not
        if(this::name.isInitialized)
            println("Your value is not assigned");

        else{
            // initializing name
            name = "late init name being initialized"
            println(this.name)
            // this will return true
        }
    }
}

fun main() {
    var obj=Walkthrough();
    obj.checkLateInit();
}