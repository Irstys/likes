package ru.netology

fun main() {
    print("Введите количество лайков: ")
    val likes = readln().toInt()
    val tail:Int = (likes%10)
    val people: String =if(tail==1) "человеку" else "людям"


    println("Пост нравится $likes $people")
}