fun main() {
    print("Ingrese su nombre completo: ")
    val nombreCompleto = readLine()!!.trim()

    val codigoUsuario = generarCodigoUsuario(nombreCompleto)
    println("Su código de usuario es: $codigoUsuario")
}

fun generarCodigoUsuario(nombreCompleto: String): String {
    // Dividir el nombre completo en una lista de palabras
    val palabras = nombreCompleto.split(" ")

    // Tomar la primera letra de cada palabra
    val iniciales = palabras.map { it.first() }

    // Juntar las iniciales en un string
    return iniciales.joinToString("").toLowerCase()
}

