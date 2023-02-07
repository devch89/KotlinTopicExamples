package com.example.mykotlinlearning.advanced.classes_objects

import java.lang.reflect.Member

/**
 * Enum constants today aren’t just mere collections of constants – they can have properties,
 * implement interfaces, and much more.
 */
enum class Membership(val level: String) {
    Silver("gray"),
    Gold("yellow"),
    Platinum("black")
}
fun main() {
    val level = Membership.Platinum.level
    println(level)
}