package com.example.kotlinbasic

// todo 1 (next Player.kt)
open class Person(var name:String, var age:Int) { // primary constrator

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