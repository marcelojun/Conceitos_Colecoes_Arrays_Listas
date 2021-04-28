package me.xibongu

fun main(){
    val nomes=Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Joao"
    nomes[2] = "Jose"

    for (nomes in nomes){
        println(nomes)
    }
    println("---------")

    nomes.sort()
    nomes.forEach { println(it) }

    println("---------------")

    val nomes2= arrayOf("Maria","Jose","Tiao","Carlos")
    nomes2.sort()
    nomes2.forEach { println(it) }
}