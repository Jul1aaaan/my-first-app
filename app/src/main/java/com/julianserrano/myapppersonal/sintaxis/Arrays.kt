package com.julianserrano.proyectopersonal.sintaxis

fun main() {

    //Indice de 0-6
    //Tamanio de 7
    val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    println(weekDays.size)

    //Tamanios
    if (weekDays.size >= 8) {
        println(weekDays[8])
    } else {
        println("No hay mas valores en el array")
    }

    //Modicar valores
    weekDays[0] = "Lunardo"

    //Bucles para Arrays

    //Iterar pocisiones
    for (position in weekDays.indices) {
        println(weekDays[position])
    }

    //Iterar pocisiones y valores
    for ((position, value) in weekDays.withIndex()) {
        println("La pocision $position, contiene $value")
    }

    //Iterar valores
    for (weekDay in weekDays) {
        println("El valor es $weekDay")
    }
}