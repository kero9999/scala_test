package com.kero99.wp

/**
  *
  * @author wp
  * @date 2019-08-06 15:28
  *
  */
object CallByNameTest extends App {
  //call by value
//  //获取纳秒
//  def getNano()={
//    println("生成纳秒了...")
//    System.nanoTime
//  }
//
//  def printInfo(time:Long) ={
//    println("纳秒数:"+time)
//    println("纳秒数:"+time)
//    println("纳秒数:"+time)
//  }
//
//  printInfo(getNano())


  //call by name
  //获取纳秒
  def getNano():Long={
    println("生成纳秒了...")
      System.nanoTime
  }

  def fun():Long={
    1L
  }

  def printInfo(time: => Long) ={
    println("纳秒数:"+time)
    println("纳秒数:"+time)
    println("纳秒数:"+time)
  }

  printInfo(fun())
  printInfo(getNano())

}


