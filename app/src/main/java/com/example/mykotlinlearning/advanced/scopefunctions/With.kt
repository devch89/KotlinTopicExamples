package com.example.mykotlinlearning.advanced.scopefunctions

/**
 * Recommended use of ‘with’ for calling functions on context objects without
 * providing the lambda result.
 */

class NewCompany() {
    lateinit var name: String
    lateinit var objective: String
    lateinit var founder: String
}

fun main(){
    val newCompany = NewCompany().apply {
        founder = "Founder Name"
        name = "Company Name"
        objective = "A company that wants to be successful"
    }

    with(newCompany){
        // same as this.name
        println("$name")
    }
}