package com.kero99.wp

/**
  *
  * @author wp
  * @date 2019-08-06 16:05
  *
  */
object ParameterDemo extends App {
//  def  fun(age:Int,names:String*): Unit ={
//    println(age)
//    for(name <- names){
//      println(name)
//    }
//  }
//  fun(18,"admin","zhangsan","root")


//  def fun(age:Int,name:String): Unit ={
//    println(s"age:${age},name:${name}")
//
//  }
//
//  fun(18,"zhangsan")
//  fun(name="lisi",age=55)

  def fun(name:String,age:Int=0): Unit ={
    println(s"age:${age},name:${name}")

  }
  fun("zhangsan")

}
