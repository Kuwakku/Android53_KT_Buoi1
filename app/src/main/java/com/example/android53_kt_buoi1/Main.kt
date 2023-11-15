package com.example.android53_kt_buoi1

import kotlin.math.PI


fun main(args: Array<String>) {

    // khong khai bao duoc 2 bien cung 1 dong
    // khong can dau cham phay
    // khoi tao gia tri mac dinh ( hang so )
    val age: Int = 10

    // gia tri bien co the thay doi
    var name: String = "thai"

    val b = 0.6f // float
    val c = 6.0 // double
    var a = true // boolean

    // ho tro bieu thuc toan tu
    var number = 10
    number++
    number--
    number *= 3

    // lệnh in
    println("age: ${age + 10} | name: $name")

    // in kiểu dữ liệu
    println("kieu du lieu age: ${age::class.java}")
    println("kieu du lieu name: ${name::class.java}")

    // chuong trinh tinh the tich hinh cau
    val radius = 5.0
    val Pi = Math.PI
    val V = (4 / 3) * Math.pow(radius, 3.0) * Pi
    println("Pi: $Pi")
    println("V: $V")

    // viet gia tri nhap vao
//    print("Please enter number: ")
//    val newNumber = readln().toInt();
//    println(newNumber)

    // mảng
    // listof k the chinh sua, chi co the doc
    val listDemo = listOf("a", "b", "c")
    // mutableList co the chinh sua
    val listDemo2 = mutableListOf("a", "b", "c")
    listDemo2.add("d")

    println(listDemo)
    println(listDemo2)
    println(listDemo2[0])

    // duyet vs for
    for (i in listDemo2) {
        print(i)
    }
    println()
    for (i in listDemo2.indices) {
        print(i)
        print(listDemo2[i])
    }
    println()

//    var input = 0
//    do {
//        println("Enter number: ")
//        input = readln().toInt()
//    } while (input < 10)

//    for (i in 0 < .. < 10 step 2) {
//
//    }
    for (i in 10 downTo 0) {

    }
    // ..: until, downTo,

    // day fibonaci
//    val list = mutableListOf(0,1)
//    var input = 0
//    while (input <= 1) {
//        print("Enter n: ")
//        input = readln().toInt()
//    }
//    for (i in 2 until input) {
//        list.add(list[i-1] + list[i-2] )
//    }
//    println(list)

    // when == switch case
//    when (input) {
//        0 -> print(0)
//        1 -> println(1)
//    }

    // viết 1 chuỗi kiểm tra đọc xuôi và ngược
    println("Nhap vao 1 chuoi: ")
    val str = readln().toString()
    val length = str.length
    var check = true
    for (i in 0 until length/2) {
        if (str[i] != str[length - i - 1]) {
            check = false
        }
    }
    if (check) {
        println("Giong nhau")
    } else {
        print("Khac nhau")
    }

    // Unit = Void


}



