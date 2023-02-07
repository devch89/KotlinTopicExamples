package com.example.mykotlinlearning

/**
 * Higher Order Functions/ Lambda Functions -> using function as a parameter or retunr type
 */

fun main() {

    val callFun = {
        println("Hey, I am from Lambda fun")
    }// Lambda


    println(callFun()) // Higher order function

    val addFun = { a: Int, b: Int ->
        a + b
    }
    println(addFun(2, 3))


}