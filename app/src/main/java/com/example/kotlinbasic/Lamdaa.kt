package com.example.kotlinbasic

fun main(){
    // 1. With parameters and return value
    val add1 = {a: Int, b: Int -> a+b}
    println(add1(10,20))

    // 2. With parameters and no return value
    val add2 : (Int,Int) -> Unit = {a,b -> println(a+b) }
    add2(10,20)

    // 3. No parameters and with return value
    val add3: () -> String = {"Halo, Selamat datang"}
    println(add3())
    println(add3.invoke())

    // 4. No parameters and no return value
    val add4: () -> Unit = { println("Halo, Selamat datang kembali") }
    add4.invoke()
    add4()
}