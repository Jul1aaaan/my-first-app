package com.julianserrano.proyectopersonal.sintaxis

fun main() {
    var name: String? = "Julian"

    println(name?.get(3) ?: "Es nullo wey")
}