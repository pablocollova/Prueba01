package com.curso.prueba01

class Designer(name:String, age: Int):Person(name,age) {

    override fun work(){
        println("esta persona esta diseñando")
    }
}