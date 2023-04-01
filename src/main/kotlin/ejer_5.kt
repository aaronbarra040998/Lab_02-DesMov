/*
ERROR:
fun main(argumentos: Array<String>){
    println("Bienvenidos a kotlin")
    var n1:Int? = null
    var n2:String? = null
    n1 = 12
    n2 = "10"
    val n3 = n1 + n2
    println("valor de  n3 es ${n3} y es de tipo ${n3::class.simpleName}")

}
SOLUCION:
*/
fun main(argumentos: Array<String>){
    println("Bienvenidos a kotlin")
    var n1: Int? = null
    var n2: String? = null
    n1 = 12
    n2 = "10"
    val n3 = n1?.plus(n2?.toIntOrNull()?: 0)
    println("valor de  n3 es $n3 y es de tipo ${n3?.javaClass?.simpleName}")
}


