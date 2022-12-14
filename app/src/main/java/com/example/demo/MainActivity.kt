package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
fun main() {
    var username = "Sudheer"
    username = "nitish"
    val greeting = "Good Morning"
    var age: Int = 420
    val maxIntegerValue: Int = Int.MAX_VALUE
    val minIntegerValue: Int= Int.MIN_VALUE
    println ("hello $username, $greeting, $age")
    println ("Int maximum value is: $maxIntegerValue")
    println ("Int minimum value is: $minIntegerValue")
    var number: Int = 2147483647
    val myMaxByteValue: Byte = Byte.MAX_VALUE
    val myMinByteValue: Byte = Byte.MIN_VALUE
    println ("Byte max value is: $myMaxByteValue")
    println ("Byte min value is: $myMinByteValue")

    val myMaxShortValue: Short = Short.MAX_VALUE
    val myMinShortValue: Short = Short.MIN_VALUE
    println ("Short maximum value is:$myMaxShortValue")
    println ("short minimum value is:$myMinShortValue")


}