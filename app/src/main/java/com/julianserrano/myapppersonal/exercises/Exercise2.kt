package com.julianserrano.proyectopersonal.exercises

/*
Las entradas de cine suelen tener un precio diferente segun la edad de los espectadores

En el codigo inicial que se proporciona en el siguiente fragmento de codigo, escribe un programa que calcule los precios
de estas entradas basados en la edad

.Un precio de entrada infantil de USD 15 para persona de 12 anios o menos.

.Un precio de entrada estandar de USD 30 para personas entre 13 y 60 anios Los lunes, un precio estandar con
descuento de USD25 para el mismo grupo etario

.Un precio para adultos mayores de USD 20 para personas de 61 anios o mas(Asumimos que la edad maxima de un
es de 100 anios)

.Un valor de -1 para indicar que el precio no es valido cuando un usuario ingresa una edad fuera de las especificaciones
 */

fun main() {
    val child: Int = 5
    val adult: Int = 28
    val senior: Int = 87

    val isMonday: Boolean = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when (age) {
        in 1..12 -> 15
        in 13..60 -> if (isMonday) {
            25
        } else {
            30
        }

        in 61..100 -> 20
        else -> -1
    }
}