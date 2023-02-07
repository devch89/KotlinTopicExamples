package com.example.mykotlinlearning.advanced.scopefunctions


/**
 * let function is often used to provide null safety calls.
 * Use safe call operator(?.) with ‘let’ for null safety.
 * It executes the block only with the non-null value.
 */
fun main() {
    //nullable variable x with value as null
    var x: Int? = null

    x?.let {
        //statements will not execute as x is null
        println(it)
    }
// re-initializing value of x to 2
    x = 2
    x?.let {
        // statement will execute as x is not null
        println(x)
    }
}