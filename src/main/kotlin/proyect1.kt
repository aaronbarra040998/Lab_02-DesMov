fun main() {
    // Crear el diccionario de cantidad de alumnos matriculados en cada sección por año
    val alumnosMatriculadosPorAnio = mapOf(
        2018 to mapOf("1" to 45, "2" to 40, "3" to 36),
        2019 to mapOf("1" to 43, "2" to 38, "3" to 35),
        2020 to mapOf("1" to 44, "2" to 37, "3" to 30),
        2021 to mapOf("1" to 40, "2" to 34, "3" to 28)
    )

    // Solicitar la entrada del usuario para obtener la cantidad de alumnos matriculados en una sección específica y año
    print("Ingrese la sección: ")
    val seccion = readLine()!!.toLowerCase()
    print("Ingrese el año: ")
    val anio = readLine()!!.toInt()

    // Obtener la cantidad de alumnos matriculados en la sección y año específicos
    val cantidadAlumnos = alumnosMatriculadosPorAnio[anio]?.get(seccion)
    if (cantidadAlumnos != null) {
        println("La cantidad de alumnos matriculados en la sección $seccion en el año $anio es $cantidadAlumnos.")
    } else {
        println("No se encontró información para la sección $seccion en el año $anio.")
    }
}
