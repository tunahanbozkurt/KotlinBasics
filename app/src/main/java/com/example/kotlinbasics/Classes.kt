/*
package com.example.kotlinbasics

class MyClass

open class Student(
    val age: Int,
    val grade: String
) {


    init {
        println("age: $age, grade: $grade")
    }

    fun example() {
        //println(age)
        println(grade)
    }


    private val number1 = 5
    protected val number2 = 5

}

fun main() {
    val model =  MyDataClass(
        5,
        null,
        amount = 5
    )

}
class MyPublicClass() : MyAbstractClass() {
    override fun myAbstractFunction() {

    }

    override fun myFunction() {
        super.myFunction()
        println("6")
    }
}

internal class MyInternalClass()
private class MyPrivateClass()

data class MyDataClass(
    val number: Int,
    val string: String?,
    val amount: Long?
)

abstract class MyAbstractClass {
    init {

    }
    open fun myFunction() {

    }
    abstract fun myAbstractFunction()
}




//class MyInheritedClass : MyAbstractClass()

interface MyRepository {
    fun getData()
    fun getUser()
    fun sendPassword()
}

class MyRepositoryImpl() : MyRepository {
    override fun getData() {
        TODO("Not yet implemented")
    }

    override fun getUser() {
        TODO("Not yet implemented")
    }

    override fun sendPassword() {
        TODO("Not yet implemented")
    }
}
fun deneme(type: MySealedClass) {
    when(type) {
        MySealedClass.Error -> TODO()
        is MySealedClass.Loading -> TODO()
        is MySealedClass.Success -> {
            type.deneme
        }
    }
}
enum class MyEnums {
    REQUEST_MONEY,
    SEND_MONEY
}

sealed class MySealedClass(val loading: Boolean) {
    class Loading(isLoading: Boolean) : MySealedClass(isLoading)
    data class Success(val item: MyDataClass, val deneme: String) : MySealedClass()
    object Error : MySealedClass()
}

sealed interface Error

sealed class IOError(): Error // extended only in same package and module
open class CustomError(): Error // anywhere
*/
