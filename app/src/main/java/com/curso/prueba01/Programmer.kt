package com.curso.prueba01

class Programmer(name:String, age:Int):Person(name,age) {

    override fun work(){
        println("esta persona esta programando")
    }
}