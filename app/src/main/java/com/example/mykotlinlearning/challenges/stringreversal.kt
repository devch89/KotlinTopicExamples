package com.example.mykotlinlearning.challenges

/**
 * Reverse a string input -> aaba
 * output should be -> abaa
 */

fun main() {
    println("Please enter a string")
    val userInput = readLine()

    if (userInput != null) {
        var reverseString = userInput.reversed()
        println(reverseString)
    } else {
        println("Please enter a string")
    }
}