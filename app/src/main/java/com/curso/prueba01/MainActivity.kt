package com.curso.prueba01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // enum clases
        enumClasses()

    }

    // lección 1 kotlin intermedio: Enum Classes
    enum class Direction(val dir : Int){
        NORTH(dir=1), SOUTH(dir=-1), EAST(dir=1), WEST(dir=-1);
        fun description():String{
            return when(this){
                NORTH-> "la dirección es NORTE"
                SOUTH-> "la dirección es SUR"
                EAST->"la dirección es ESTE"
                WEST->"la dirección es OESTE"
            }
        }
    }

    private fun enumClasses(){
        //Asignación de valores
        var userDirection: Direction?=null
        println("Dirección: $userDirection")

        userDirection=Direction.NORTH
        println("Dirección: $userDirection")

        userDirection=Direction.WEST
        println("Dirección: $userDirection")

        //propiedades por defecto
        println("propiedad name: ${userDirection.name}")
        println("propiedad ordinal: ${userDirection.ordinal}")

        //funciones
        println(userDirection.description())

        //Inicialización
        println(userDirection.dir)
    }
}