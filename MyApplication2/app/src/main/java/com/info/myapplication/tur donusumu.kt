package com.info.myapplication

import java.util.*

fun main (){
    var i:Int = 42
    var d:Double = 42.45
    var f:Float = 42.89f

    var sonuc1:Int = d.toInt()
    var sonuc2:Double = i.toDouble()
    var sonuc3:Int = f.toInt()

    println(sonuc1)
    println(sonuc2)
    println(sonuc3)

    var str1 = i.toString()
    var str2 = d.toString()
    var str3 = f.toString()

    println(str1)
    println(str2)
    println(str3)

    //yöntem

    var yazi2 ="98.5y"

    var y = yazi2.toDoubleOrNull()
    if (y != null){
    println("y =$y")
} else {
    println("kodda hata var")
}















































}