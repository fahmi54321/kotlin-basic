package com.example.kotlinbasic

// todo 2 (next HelloKotlin.kt)
class Car : Vehicle {

    override val vehicleSpeed: Int = 20
    override fun startEngine(): String {

        return "Start Engine"
    }
}