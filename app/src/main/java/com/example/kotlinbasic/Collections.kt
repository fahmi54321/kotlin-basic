package com.example.kotlinbasic

fun main(){

    // Immutable list

    val list1 = listOf("Fahmi","Abdul","Aziz",1,2,3)
    val list2 = listOf<Int>(1,2,3,4,5)
    val list3 = listOf<String>("Satu","Dua","Tiga")

    for ( item in list1){
//        println(item)
    }
    for ( item in list2){
//        println(item)
    }
    for ( item in list3){
//        println(item)
    }


    // Mutable list
    var mutableList = mutableListOf("Fahmi","Abdul","Aziz",1,2,3)
    mutableList[1] = "Abdul Edit"
    mutableList.add("Ega")

    for(item in mutableList){
//        println(item)
    }

    // Imutable Set
    var immutableSet = setOf(1,2,2,3,3,4,5,1,"Fahmi","fahmi","Fahmi","Abdul","ABdul")
    for (item in immutableSet){
//        println(item)
    }

    // mutable Set
    var mutableSet = mutableSetOf(1,2,2,3,3,4,5,1,"Fahmi","fahmi","Fahmi","Abdul","ABdul")

    mutableSet.add("Fahmi")
    mutableSet.add("FahmI")
    mutableSet.add(5)

    mutableSet.remove("ABdul")
    mutableSet.remove("fahmI")

    for (item in mutableSet){
//        println(item)
    }

    // Immutable map
    var iMmutableMap = mapOf(1 to "Fahmi",2 to "Abdul",5 to 99)
    for (key in iMmutableMap.keys){
//        println(iMmutableMap[key])
    }

    for (key in iMmutableMap.keys){
//        println(key)
    }

    for (value in iMmutableMap.values){
//        println(value)
    }

    // Mutable map
    var mutableMap = mutableMapOf<Int,String>(1 to "Fahmi",2 to "Abdul",5 to "Aziz")
    mutableMap[7] = "Dermawan"
    mutableMap[1] = "Fahmi Edit"

    mutableMap.remove(2)
    mutableMap.remove(5,"Aziz")

    for (item in mutableMap.values){
        println(item)
    }

}