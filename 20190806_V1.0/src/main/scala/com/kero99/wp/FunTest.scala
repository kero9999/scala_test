package com.kero99.wp

/**
  *
  * @author wp
  * @date 2019-08-06 15:16
  *
  */
object FunTest extends App {
  //方法定义
  def sum(n1:Int,n2:Int):Int={
    return n1+n2
  }
  def sum1(n1:Int,n2:Int)={
    n1+n2
  }

  def sum2(n1:Int,n2:Int)=n1+n2
  //方法调用
  println(sum(1,2))
  println(sum1(1,2))
  println(sum2(1,2))

  var fun1=(n1:Int,n2:Int)=>n1+n2
  fun1=(n1:Int,n2:Int)=>n1*n2
  var fun2=()=>1+3
  println(fun1(11,2))
  println(fun2)
}
