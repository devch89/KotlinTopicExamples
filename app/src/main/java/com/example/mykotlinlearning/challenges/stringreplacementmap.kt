package com.example.mykotlinlearning.challenges

/**
 *Replace annotations in a string with the provided map.
 * Example ->
 * input one: "some random string @test challenge @okay"
 * Input two: @test is Laptop, @okay is Gone
 * Output: some random string Laptop challenge Gone
 */


fun main() {
    val map = mapOf("@test" to "Laptop", "@okay" to "Gone")
    val input = "Some random string @test challenge @okay"
    var changedInput = input

    for (string in map) {
        changedInput = changedInput.replace(string.key, string.value)
    }

    println(changedInput)


}