package com.example.kotlinbasic

// todo 1 (next Car.kt)

interface Vehicle {

    val vehicleSpeed: Int

    fun startEngine(): String

    fun accelerate(){
        println("accelerate")
    }
}