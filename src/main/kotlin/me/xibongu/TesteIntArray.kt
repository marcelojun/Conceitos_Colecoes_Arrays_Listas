package me.xibongu

 fun main(){
     val values= IntArray(5)
     values[0]=1
     values[1]=7
     values[2]=6
     values[3]=3
     values[4]=2

 for (valor in values)  {
     println(valor)
 }
     println("----------------")
values.forEach {
    println(it)

   }
     println("----------------")
     for(index in values.indices){
         println(values[index]) // iterar sobre os indices do array, não estamos iterando os valores contidos
     }                          // em CADA indice e sim SOBRE os indices.

     println("----------------")
     values.sort() // ordena por padrão do menor para o maior
          for(valor in values){ //
         println(valor)
     }

}