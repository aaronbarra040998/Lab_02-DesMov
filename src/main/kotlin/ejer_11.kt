fun main(argumentos: Array<String>){
    println("Bienvenidos a kotlin")
    var n1= "Kotlin en Android"
    val n2= n1.indexOf( 'e')
    println("Subcadena: ${n1.substring(n2, n2 + 2)}")
    val n3= n1.replace(  'O',  ' ')
    println("Recorrido de cadena")
    for(i in n3) {
        print(i + " ")
    }
}


