package com.kero99.wp

/**
  *
  * @author wp
  * @date 2019-08-07 14:25
  *
  */
object StringTest extends App {
  var pi = 3.14159265
  var r1: String = "%.2f".format(pi)
  println(r1)
  printf("%.2f\n", pi)
  //var r2: String = String.format("%.2f", pi)
  //println(r2)
  /**
    * Error:(14, 24) overloaded method value format with alternatives:
    * (x$1: java.util.Locale,x$2: String,x$3: Object*)String <and>
    * (x$1: String,x$2: Object*)String
    * cannot be applied to (String, Double)
    * var r2:String=String.format("%.2f",pi)
    */
}