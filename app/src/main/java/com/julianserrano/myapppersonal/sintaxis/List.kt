package com.julianserrano.proyectopersonal.sintaxis

fun main() {
}

fun mutableList() {
    var weekDays: MutableList<String> =
        mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(weekDays)

    weekDays.add(0, "JuliDay")
    println(weekDays)

    if (weekDays.isEmpty()) {
        //No voy a pintar nada porque no hay
    } else {
        weekDays.forEach { weekDay -> println(weekDay) }
    }

    if (weekDays.isNotEmpty()) {
        weekDays.forEach { weekDay -> println(weekDay) }
    }
    weekDays.last()


}

fun inmutableList() {
    val readOnly: List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())

    //Filtrar
    val example: List<String> = readOnly.filter { it.contains("a") }
    println(example)

    //Iterar
    readOnly.forEach { weekDay -> println(weekDay) }
}