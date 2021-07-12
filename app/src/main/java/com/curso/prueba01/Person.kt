package com.curso.prueba01


//utilizo open para definir que esta clase puede ser heredable
open class Person (name:String, age: Int){
    //Cualquier clase tiene una superclase comun llamada "Any"
   open fun work() /* utilizamos open para poder sebre escribirla*/ {
        println("esta persona esta trabajando")
    }
}