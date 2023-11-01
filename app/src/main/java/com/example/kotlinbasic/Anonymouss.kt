package com.example.kotlinbasic

fun main(){

    // with parameters and return value
    val add = fun(a: Int,b:Int): Int {
        return a+b
    }
    println(add.invoke(10,20))
    println(add(10,20))

    val add2 = fun(a:Int,b:Int) : Int = a+b
    println(add2.invoke(10,20))
    println(add(10,20))

    // with parameters and no return value
    val add3 = fun(a: Int,b:Int) { println(a+b) }
    add3(10,20)

    // No parameters and return value
    val msg = fun() : String {return "Halo, Selamat datang"}
    println(msg.invoke())

    // No parameters and no return value
    val msg2 = fun() { println("Halo, Selamat datang kembali") }
    msg2()

    // higher order functions
    val add4 = {a: Int, b: Int -> a+b}

    hof(add4)
    // or
    hof{a:Int,b:Int -> a+b}

    hof2("fahmi") { a: Int, b: Int -> a + b }

    hof3 {
        println("Hai $it")
    }

    // Passing anonymous function as a parameter to HOF
    val subtr = fun(a:Int, b:Int): Int{
        return a-b
    }
    hof4(subtr)

    // Returning a value from an anonymous function
    println(hof5()())

    // Returning a regular function from HOF
    println(hof6()())

    // Passing a regular function to HOF
    hof7(::messageFun)
}

// higher order functions
fun hof(addition: (Int,Int) -> Int){
    val result = addition(4,5)
    println(result)
}

fun hof2(name: String, addition: (Int, Int) -> Int){
    val result = addition(4,5)
    println("name : $name, result: $result")
}

fun hof3(name: (String) -> Unit){
    name("Fahmi")
}

fun hof4(addition: (Int, Int) -> Int){
    val result = addition(4,5)
    println("result: $result")
}

fun hof5() : () -> String{
    val msg = fun() : String{
        return "Hai"
    }

    return msg
}

fun hof6(): ()-> String{
    return ::messageFun
}

// Reguler function
fun messageFun(): String{
    return "Hai"
}

fun hof7(regFun: () -> String){
    println(regFun())
}