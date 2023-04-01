fun main(argumentos: Array<String>){
    println("Bienvenidos a kotlin")
    var x = arrayListOf("PER",'U')
    for(i in 1..5){
        x.add(1)
    }
    println(x)
    for(i in x.count()-1 downTo 0 step 2){
        print(x.get(i))
    }
}