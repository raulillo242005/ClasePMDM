// clase - varible - funciones
// String nombre = "Valor"
// var nombre: String = "Valor"
// var val
// var nombre: String? = null;
var nombre: String? = null
var edad: Int = 18;
val DNI: String = "123A"


fun main(arg: Array<String>): Unit {
    /*println("Introduce cual es tu nombre")
    nombre = readLine()
    println("Introduce cual es tu edad")
    edad = readLine()!!.toInt()
    //edad = readLine() as Int
    //println(nombre!!.length)
    println("Hola mi nombre es ${nombre} tengo ${edad} años")
    println("La suma del numero 4 y el numero 2 es ${4 + 2}")*/
    //estructurasIf()
    //estructurasWhen()
    //estructuraFor()
    //ejercicioAleatorio()
    funcionArrays()
}

fun funcionArrays() {
    // String[] nombre = {"asd","asda"} --> length 2
    // String[] nombre = new String[2] --> length 2 null,null
    // int[] nombre = new int[2] --> length 2 0,0
    var arrayNumeros: Array<Any>? = null
    // [null,null,null.null,null]
    var arrayCosas: Array<Int?> = arrayOfNulls<Int>(5);
    println(arrayCosas[0]!! > 5)

}

fun ejercicioAleatorio() {
    var edad: Int = 0;
    println("Dime que edad tienes")
    edad = readLine()!!.toInt();
    if (edad >= 18) {
        var max = -1;
        var min = 101;
        var sumatorio = 0;
        for (i in 1..10) {
            var aleatorio = (1..100).random()
            sumatorio += aleatorio;
            if (aleatorio > max)
                max = aleatorio
            if (aleatorio < min)
                min = aleatorio
        }

        println("La suma de todos es ${sumatorio}")
        println("El minimo de todos es ${min}")
        println("El maximo de todos es ${max}")
        println("El numero medio de todos es ${sumatorio / 10}")

    } else {
        println("No eres mayor de edad")
    }

}

fun estructurasWhen() {
    // switch
    // case 1->
    // rango 1 y 5
    // no rango 1 y 5
    // salida de un método
    // switch vestido de if
    var numero: Int = 14

    when (numero) {
        1 -> {
            println("El caso es el valor 1")
        }
        in 2..10 -> {
            println("El numero está en rango 2..10")
        }
        !in 1..10 -> {
            println("El numero está en un rango no definido")
        }
        /*else ->{

        }*/
    }
}

fun estructurasIf() {
// ejecuciones
    // no hay if ternario
    // la salida de un if la puedo guardar en una variable
    // if (c) {} else if (c){} else {}
    println("Indica por teclado un número");
    var numero: Int = readLine()!!.toInt();
    if (numero > 18) {
        println("Eres mayor de edad")
    } else {
        println("Eres menor de edad")
    }

    println("Indica tu nombre");
    var nombre: String? = readLine();
    // null >=5
    if (nombre!!.length >= 5) {
        println("Tu nombre es demasiado largo");
    }

    var valorNumerico: Int = if (nombre!!.length > 5 && numero > 10) 10 else 0
    println(valorNumerico)


}

fun estructuraFor() {
    // inicio final incremento
    // rango step
    for (i in 1..4 step 2) {
        println(i)
    }
    // inicio final incremento

    // rango decremental step
    for (i in 10 downTo 4) {
        println(i)
    }

    // (int)(Math.random()*21)
    (1..200).random();

}