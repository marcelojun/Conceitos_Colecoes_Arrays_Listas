package me.xibongu

fun main() {
    val joao= Funcionario("João",6000.0) // estancionar
    val pedro= Funcionario("Pedro",2000.0)
    val maria= Funcionario("Maria",3000.0)
    val tiago= Funcionario("Tiago",5000.0)

    val funcionarios= listOf(joao ,pedro,maria,tiago) //atribuir a lista
    funcionarios.forEach{println(it)}// iterar a lista
    println("-----------")
    println(funcionarios.find { it.nome=="Maria" })// buscar

    println("-----------")
    funcionarios
        .sortedBy { it.salario }// it neste caso é o objeto(funcionario).
        .forEach{ println(it)}  // it neste caso é a função

}
