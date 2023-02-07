package com.example.mykotlinlearning.advanced.scopefunctions

/**
 * As the name implies – “Apply these to the object”.
 * It can be used to operate on members of the receiver object mostly to initialize members.
 */
class Company() {
    lateinit var name : String
    lateinit var objective: String
    lateinit var founder: String
}

fun main(){
    Company().apply {
        // don't need to use object name to refer member
        this.founder = "Founder Name"
        this.name = "Company Name"
        this.objective = "A company that wants to be successful"
    }
}
