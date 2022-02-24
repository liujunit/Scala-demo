package com.liujunit.day02

import com.liujunit.day01.Student

object Test02_Variable {

  def main(args: Array[String]): Unit = {
    //声明一个变量的通用语法
    var a: Int = 10

    //(1) 声明变量时，类型可以省略，编译器自动推导
    var a1: Int = 11
    var b1: Int = 22

    //(2) 类型确定后，就不能修改，说明 Scala 是强数据类型语言。
    //    a = "ajfdksljfs"

    //(3)变量声明时，必须要有初始值
    //    var a2
    //    var a2: Int

    //(4)在声明/定义一个变量时，可以使用 var 或者 val 来修饰，var 修饰的变量可改变，val 修饰的变量不可改。
    var a2: Int = 10
    a2 = 12
    val b2: Int = 10
//    b2 = 13

    val alice: Student = new Student("alice", 20)
//    alice = new Student("Alice", 20)
//    alice = null
    alice.age = 24
//    alice.name = "123"
    alice.printInfo()

    var bob: Student = new Student("bob", 20)
    bob = new Student("Bob", 20)
    bob.age = 21
//    bob.name = "bobo"
    bob.printInfo()
  }

}
