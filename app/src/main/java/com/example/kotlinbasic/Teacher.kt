package com.example.kotlinbasic

// todo 2 (next HelloKotlin.kt)
class Teacher: Person {

    constructor(): super(){

        println("teacher hobi : $hobi")
    }

    override var name: String = "Abdul"

    override var hobi: String = "Ngegame"
}