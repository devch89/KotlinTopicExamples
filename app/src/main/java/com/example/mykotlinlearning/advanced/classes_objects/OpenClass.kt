package com.example.mykotlinlearning.advanced.classes_objects

open class Vehicle {
    open fun carName(){
        println("Car Name")
    }
}

class Car : Vehicle(){

    override fun carName() {
        println("Ferrari")
    }

}

fun main(){
    println(Car().carName())
}