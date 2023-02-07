package com.example.mykotlinlearning.advanced.classes_objects

data class Movie(
    val title: String,
    val director: String,
    val releaseDate: Int,
    val movieScore: Int
)

fun main(){

    val movie = Movie("New Movie", "Ryan Coogler",
    2023, 4)

    println("Movie Title: ${movie.title}")
    println("Movie Director: ${movie.director}")
    println("Movie Release Date: ${movie.releaseDate}")
    println("Movie Rating: ${movie.movieScore}")
}