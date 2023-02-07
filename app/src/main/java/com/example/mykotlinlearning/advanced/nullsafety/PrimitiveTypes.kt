package com.example.mykotlinlearning

fun main() {

    val intTestValue: Int = 23
    val doubleTestValue: Double = 23.23
    val floatTestValue: Float = 23.0f
    val stringTestValue: String = ":-) - 23.24 = 3.2.3"

    // Null Safety
    val intTestValueNull: Int? = null
    val doubleTestValueNull: Double? = null
    val floatTestValueNull: Float? = null
    val stringTestValueNull: String? = null


    var intTestValue1 = 23
    var doubleTestValue1 = 23.23
    var floatTestValue1 = 23.0f
    var stringTestValue1 = ":-) - 23.24 = 3.2.3"

    // magic here with default function
    intTestValue1 = (23.4).toInt()
    floatTestValue1 = intTestValue1.toFloat()
    doubleTestValue1 = floatTestValue1.toDouble()
    stringTestValue1 = doubleTestValue1.toString()

    // magic here with null safety
    // ?.   -> is safe call for the value
    // !!   -> is force call for the value (not recommended until sure of it)
    // ?:   -> is optional value reference / default value in case of null


    intTestValue1 = floatTestValueNull?.toInt() ?: 2 // if (notNull) actual value - else default value
    if(intTestValue1 != null){
        floatTestValue1 = intTestValueNull?.toFloat()!!
        doubleTestValue1 = floatTestValueNull?.toDouble()!!
        stringTestValue1 = doubleTestValueNull?.toString()!!
    }
}