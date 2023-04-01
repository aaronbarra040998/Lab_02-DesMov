/*

ERROR:
fun main(argumentos: Array<String>){
    println("Bienvenidos a kotlin")
    val n1= 12
    val n2= 2.4
    val n3= 0.0
    n3= n1 + n2
    println("valor de  n3 es ${n3} y es de tipo ${n3::class.simpleName}")

}
SOLUCION:
*/
fun main(argumentos: Array<String>){
    println("Bienvenidos a kotlin")
    val n1= 12
    val n2= 2.4
    var n3= 0.0
    n3= n1 + n2
    println("valor de  n3 es ${n3} y es de tipo ${n3::class.simpleName}")

}