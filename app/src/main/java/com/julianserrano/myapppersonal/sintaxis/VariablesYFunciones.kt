package com.julianserrano.proyectopersonal.sintaxis


fun main() {
    showMyName()
    showMyAge(20)
    add(25, 76)
    val mySubtrack = subtrack(10, 5)
    println(mySubtrack)
    val mySubtrack2 = subtrack2(100, 50)
    println(mySubtrack2)
}

fun showMyName() {
    println("Me llamo Julian")
}

fun showMyAge(currentAge: Int = 10) {
    println("Tengo $currentAge anios")
}

fun add(firstNumber: Int, secondNumber: Int) {
    println(firstNumber + secondNumber)
}

fun subtrack(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}

//Se puede sacar las llave y el return, poniendo un igual en caso de funciones de una linea
fun subtrack2(firstNumber: Int, secondNumber: Int): Int = firstNumber - secondNumber


fun variablesAlfanumericas() {
    //VARIABLES ALFANUMERICAS

    //Char
    val charExample1: Char = 'E'
    val charExample2: Char = '2'
    val charExample3: Char = '#'

    //String
    val stringExample: String = "JuliDevs"

    var stringConcatenada: String = "Hola"
    stringConcatenada = "Hola me llamo $stringExample"
    println(stringConcatenada)

}

fun variablesBoolean() {
    //VARIABLES BOOLEANAS

    val booleanExample: Boolean = true
    val booleanExample2: Boolean = false


}

fun variablesNumericas() {

    //VARIABLES NUMERICAS

    //Int -2.147.483.647 a 2.147.483.647
    val age: Int = 18
    var age2: Int = 20


    //Long -9.223.372.036.854.775.807 a 9.223.372.036.854.775.807
    val example: Long = 30

    //Float
    val floatExample: Float = 30.5f

    //Double
    val doubleExample: Double = 3241.3123123

    println("Sumar: ")
    println(age + age2)

    println("Restar: ")
    println(age - age2)

    println("Multiplicar: ")
    println(age * age2)

    println("Division: ")
    println(age / age2)

    println("Modulo: ")
    println(age % age2)

}