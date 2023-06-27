package com.julianserrano.proyectopersonal.sintaxis

fun main() {

}


fun ifMultipleOr() {
    var pet: String = "Dog"
    var isHappy: Boolean = true

    if (pet == "Dog" || pet == "Cat" && isHappy) {
        println("Es un gato o un perro")
    }
}

fun ifMultipleAnd() {
    var age: Int = 18
    var parentPermission: Boolean = false
    var imHappy: Boolean = true

    if (age >= 18 && parentPermission && imHappy) {
        println("Puedes beber")
    }

}

fun ifInt() {
    var age: Int = 20

    if (age >= 18) {
        println("Beber cerveza")
    } else {
        println("Beber jugo")
    }
}

fun isBoolean() {
    var soyFeliz: Boolean = true

    //Sin nada == true
    //Con ! al principio == false

    if (!soyFeliz) {
        println("Estoy triste :(")

    }
}

fun ifAnidado() {
    val animal: String = "Dog"

    if (animal == "Dog") {
        println("Es un perrito!")
    } else if (animal == "Cat") {
        println("Es un gato")
    } else if (animal == "Bird") {
        println("Es un pajaro")
    } else {
        println("No es uno de los animales esperados")
    }
}

fun ifBasico() {
    val name: String = "Julian"

    if (name == "Julian") {
        println("Oye, la variable name es Julian")
    } else {
        println("Este no es Julian")
    }
}