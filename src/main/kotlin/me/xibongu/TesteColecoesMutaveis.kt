package me.xibongu

fun main() {
    val joao= Funcionario("João",6000.0)
    val pedro= Funcionario("Pedro",2000.0)
    val maria= Funcionario("Maria",3000.0)
    val funcionarios = mutableListOf( joao,maria)
    funcionarios.forEach{ println(it)}

    println("----------")
    funcionarios.add(pedro)
    funcionarios.forEach{ println(it)}

    println("----------")
    funcionarios.remove(joao)
    funcionarios.forEach{ println(it)}

    println("----SET------")

     val funcionarioSet= mutableSetOf(joao)
      //funcionarioSet.forEach{ println(it)}

      funcionarioSet.add(pedro)
      funcionarioSet.add(maria)
      funcionarioSet.forEach{ println(it)}
}