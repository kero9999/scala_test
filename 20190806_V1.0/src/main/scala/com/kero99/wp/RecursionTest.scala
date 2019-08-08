package com.kero99.wp

/**
  *
  * @author wp
  * @date 2019-08-06 16:15
  * 斐波那契数列：1 1 2 3 5 8 13 21...
  */
object RecursionTest extends App {
  def fun(index:Int):Int ={
    if(index==1||index==2){
      1
    }else{
      fun(index-1)+fun(index-2)
    }
  }
  println(fun(5))
}
