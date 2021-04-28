package me.xibongu

class Repositorio <T>{
    private val map= mutableMapOf<String,T>()

    fun create(id:String,value:T){
        map[id] = value
    }

    fun finById (id:String)= map[id]

    fun finAll()= map.values
}