fun main (argumentos: Array<String>){
    println("Bienvenidos a kotlin")
    val n1=12
    val n2=12.5
    val n3=13.5f
    val n4="hola"
    val n5=true
    val n6="p"
    println("variable n1 es de tipo ${n1::class.simpleName}")
    println("variable n2 es de tipo ${n2::class.simpleName}")
    println("variable n3 es de tipo ${n3::class.simpleName}")
    println("variable n4 es de tipo ${n4::class.simpleName}")
    println("variable n5 es de tipo ${n5::class.simpleName}")
    println("variable n6 es de tipo ${n6::class.simpleName}")
}