package com.example.mykotlinlearning.advanced.scopefunctions

/**
 * Used when the object lambda contains both initialization and the computation of the return value.
 * Using run we can perform null safety calls as well as other computations.
 */

class Company2() {
    lateinit var name : String
    lateinit var objective: String
    lateinit var  founder: String
}

fun main(){
    println("Company Name: ")
    var company : Company2? = null
    //body only executes if company if non-null
    company?.run {
        println(name)
    }
    print("Company Name : ")
    company = Company2().apply {
        this.founder = "Founder Name"
        name = "Company Name"
        objective = "A company that wants to be successful"
    }
    //body executes as 'company' is non-null
    company?.run {
        println(name)
    }
}