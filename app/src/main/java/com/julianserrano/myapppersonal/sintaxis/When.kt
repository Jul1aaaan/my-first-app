package com.julianserrano.proyectopersonal.sintaxis

fun main() {

}

fun result(value: Any) {
    when (value) {
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if (value) print("Holiwi")
    }
}

fun getSemester(month: Int): String {
    return when (month) {
        in 1..6 -> ("Primer semestre")
        in 7..12 -> ("Segundo semestre")
        !in 1..12 -> ("Semestre no valido")
        else -> "Dadaq"
    }
}

fun getMonth(month: Int): String {
    when (month) {
        1 -> return ("Enero")
        2 -> return ("Febrero")
        3 -> return ("Marzo")
        4 -> return ("Abril")
        5 -> return ("Mayo")
        6 -> return ("Junio")
        7 -> return ("Julio")
        8 -> return ("Agosto")
        9 -> return ("Septiembre")
        10 -> return ("Octubre")
        11 -> return ("Noviembre")
        12 -> return ("Diciembre")
        else -> return ("No es un mes valido")
    }
}

fun getTrismester(month: Int): String {
    when (month) {
        1, 2, 3 -> return ("Primer trimestre")
        4, 5, 6 -> return ("Segundo trimestre")
        7, 8, 9 -> return ("Tercer trimestre")
        10, 11, 12 -> return ("Cuarto trimestre")
        else -> return ("Trimestre no valido")
    }
}