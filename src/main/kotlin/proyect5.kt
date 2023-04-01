fun main() {
    print("Ingrese los caracteres: ")
    val input = readLine()!!

    val numeros = mutableListOf<Int>()
    val letras = mutableListOf<Char>()

    for (c in input) {
        if (c.isDigit()) {
            numeros.add(c.toString().toInt())
        } else if (c.isLetter()) {
            letras.add(c)
        }
    }

    println("Letras encontradas: $letras")
    println("Números encontrados: $numeros")

}
