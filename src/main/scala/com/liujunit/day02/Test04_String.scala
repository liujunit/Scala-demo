package com.liujunit.day02

//noinspection TypeAnnotation
object Test04_String {

  def main(args: Array[String]): Unit = {
    //(1) 字符串，通过+号连接
    val name: String = "alice"
    val age: Int = 18
    println(name + "的年龄" + age)

    //* 用于字符串复制多次拼接
    println(name * 10)

    //(2) printf用法：字符串 通过%传值
    printf("%d岁的%s在学习", age, name)
    println()

    //(3) 字符串模板（插值字符串）：通过$获取变量
    println(s"${age}岁的${name}在学习")

    val num: Double = 2.3456
    println(s"num is ${num}")
    println(f"num is ${num}%2.2f")
    println(raw"The num is ${num}%2.2f")
    //三引号表示字符串，保持多行字符串的原格式输出
    val sql: String =
      s"""
         |select *
         |from
         |  user
         |where
         |  name = ${name}
         |and
         |  age > ${age}
         |""".stripMargin
    println(sql)
  }

}
