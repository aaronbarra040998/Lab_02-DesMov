fun main() {
    print("Ingrese un número entero positivo: ")
    val num = readLine()!!.toInt()

    var esPrimo = true

    if (num <= 1) {
        esPrimo = false
    } else {
        for (i in 2..num/2) {
            if (num % i == 0) {
                esPrimo = false
                break
            }
        }
    }

    if (esPrimo) {
        println("$num es un número primo.")
    } else {
        println("$num no es un número primo.")
    }
}