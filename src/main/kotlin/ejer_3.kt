fun main(argumentos: Array<String>){
    println("Bienvenidos a kotlin")
    val n1= 12
    val n2 = "2.4"
    val n3= n1 + (n2.toDouble())
    val n4= 'a'
    val n5= n4.toInt()
    val n6= n1.toString() + n3
    println("valor de  n3 es ${n3} y es de tipo ${n3::class.simpleName}")
    println("valor de  n5 es ${n5} y es de tipo ${n5::class.simpleName}")
    println("valor de  n6 es ${n6} y es de tipo ${n6::class.simpleName}")

}