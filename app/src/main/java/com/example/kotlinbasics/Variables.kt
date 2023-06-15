package com.example.kotlinbasics

fun main() {

    val myValue = 5
    // myValue = 4

    var myVariable: Int = 5
    myVariable = 4
    myVariable++
    myVariable += 1
    myVariable--
    myVariable += 5
    myVariable -= 2
    myVariable = myValue

    var myString = "Example String..."


    var password: Int? = null
    //password + 5
    password = 5

    var nullableNumber: Int? = null
    nullableNumber = null

    if (password != null) {
        println("password is not null")
    } else {
        println("password is null")
    }

    password?.let {
        it
        println("password is not null $it")
    }

}
private lateinit var myString: String

const val MY_CONSTANT = 1



