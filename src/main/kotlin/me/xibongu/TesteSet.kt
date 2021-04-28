package me.xibongu

fun main() {
    val joao= Funcionario("João",6000.0)
    val pedro= Funcionario("Pedro",2000.0)
    val maria= Funcionario("Maria",3000.0)
    val tiago= Funcionario("Tiago",5000.0)

    val funcionarios1= listOf(joao ,pedro) // conjuntos
    val funcionarios2= listOf(maria,tiago)

    val resultUnion =funcionarios1.union(funcionarios2) // une conjuntos.
    resultUnion.forEach{ println(it)}
    println("------------")

    val funcionarios3= listOf(joao ,pedro,maria)
    val resultSubtract =funcionarios3.subtract(funcionarios2)// retira o item comum dos conjuntos.

    resultSubtract.forEach{ println(it)}
    println("------------")


    val resultIntersect =funcionarios3.intersect(funcionarios2)// mostra qual item é comum aos conjuntos
    resultIntersect.forEach{ println(it)}

}