fun main() {
    print("Ingrese una cantidad: ")
    val cantidad = readLine()!!.toInt()

    println("Los primeros $cantidad elementos de la serie son:")
    var a = 0
    var b = 1
    for (i in 1..cantidad) {
        print("$a ")
        val sum = a + b
        a = b
        b = sum
    }
}

