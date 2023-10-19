package com.example.kotlinbasic

// todo 1 (next Teacher.kt)
abstract class Person {


    var age:Int = 30

    fun displayAge(){
        println("My age is $age")
    }

    abstract  fun displayGreetings()
}