package com.curso.prueba01


class MyNestedAndInnerClass {

    private val one =1

    private fun returnOne():Int{
        return one
    }
    // clase Anidada (Nested Class)
    class MyNestedClass{
        fun sum(first: Int, second: Int): Int{
            return first + second
        }
    }

    //clase interna (inner class)
    inner class MyInnerClass{
        fun sumTwo(number:Int):Int{
            return number + one + returnOne()
        }
    }

}