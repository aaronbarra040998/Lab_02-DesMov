fun main(argumentos: Array<String>){
    println("Bienvenidos a kotlin")
    var n1= "Kotlin"
    var n2= "Kotlin"
    var n3= "Kotlin"
    var n4= if (n1==n2){"Kotlin2"}else{"Kotlin"}
    println(n4)
    if (n3==n4)
        println("son iguales")
    else
        println("son distintos")
}
