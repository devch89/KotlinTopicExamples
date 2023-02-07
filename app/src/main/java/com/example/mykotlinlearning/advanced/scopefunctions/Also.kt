package com.example.mykotlinlearning.advanced.scopefunctions

fun main(){
    val list = mutableListOf<String>("A","B","C")

    // later if we want to perform multiple operations on this list

    list.also {
        it.add("D")
        it.remove("C")
    }
    println(list)
}