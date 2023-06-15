package com.example.kotlinbasics

import java.lang.Exception

fun main() {
   /* sum(3, 4)
    sum(a = 3, b = 4)

    val example = "15 TL" removeCurrencyCode "TL"
    myTrigger(5) {
        println(it * 2)
    }*/
    myTrigger(5) {
        println(it)
    }

    triggerMultipleFunctions({

    },{
        println("adsadas")
    }) {
        println("sadsadsad")
    }
}

fun sum(a: Int, b: Int): Int = a + b

fun sumTriple(a: Int, b: Int, c: Int) = a + b + c

fun sumTripleUsingSum(a: Int, b: Int, c: Int): Int {
    return sum(a, b) + c
}

fun returnThrow(): Nothing {
    throw throw throw Exception("😀")
}

fun myForLoop(range: IntRange) {
    for (item in range) {

    }

    val myList = listOf("1", "2", "3")
    for (item in myList) {
        println(item)
    }

    myList.forEach {
        println(it)
    }

    val deneme = myList.map {
        it.toInt()
    }

    myList.onEach {
        println(it)
    }
}

fun exampleExtensions() {
    val number = 5
    val nullableNumber: Int? = null

    number.apply {
        toDouble()
        toFloat()
    }


    val sayi = if (true) 5 else 6



    val myValue = with(number) {
        this * 2
        return@with 5
    }
    nullableNumber?.let {
        println("non-null $it")
    }

    val myRunValue = number.run {
        true
    }

    nullableNumber?.let {
        println(it)
    } ?: run {

    }
}

fun String.space(): String = "$this "

fun String.addCurrencyCode() = this.space() + "TL"

infix fun String.removeCurrencyCode(code: String): String = this.replace(code, "")


val myLambda: (String) -> Unit = {
    println(it)
}

/*val myString: () -> String = {
   "lambda string"
}*/

fun myTrigger(number: Int, event: (Int) -> Unit) {
    event.invoke(number)
}

inline fun triggerMultipleFunctions(
    event1: () -> Unit,
    event2: () -> Unit,
    event3: (String) -> Unit
) {}
