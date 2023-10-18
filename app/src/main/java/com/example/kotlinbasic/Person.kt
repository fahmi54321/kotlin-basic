package com.example.kotlinbasic

open class Person(var name:String, var age:Int) {

    init {
        println("The person name: $name")
        println("The person age: $age")
    }

    fun talk(){
        println("$name is talking")
    }

    fun walk(){
        println("$name is walking")
    }
}