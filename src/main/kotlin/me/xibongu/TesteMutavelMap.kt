package me.xibongu

fun main() {
    val joao= Funcionario("João",6000.0)
    val pedro= Funcionario("Pedro",2000.0)
    val maria= Funcionario("Maria",3000.0)

    val repositorio=Repositorio<Funcionario>()

    repositorio.create(joao.nome,joao)
    repositorio.create(pedro.nome,pedro)
    repositorio.create(maria.nome,maria)

    println(repositorio.finById(joao.nome))

    println("--------------")

    repositorio.finAll().forEach{ println(it)}


}