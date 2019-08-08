package com.kero99.wp

import java.util.UUID

/**
  *
  * @author wp
  * @date 2019-08-07 14:41
  *
  */
object ArrayTest extends App {
//  var as=Array(123,321,1234567)
//  for(i <- as){
//    println(i)
//  }
//  var sum=0
//  for(i <- 0 until as.length){
//    sum+=as(i)
//  }
  //  println(sum)
  /**                             行     列
    *             1               0     1
    *           1   1             1     2
    *         1   2   1           2     3
    *       1   3   3   1         3     4
    *     1   4   6   4   1       4     5
    *   1   5   10  10  5   1     5     6
    */
  //  var line=5
  //  var as:Array[Array[Int]] = Array.ofDim(line+1,line+1)
  //  for(i <- 0 to line){
  //    as(i)(0)=1
  //    as(i)(i)=1
  //  }
  //  for(i <- 2 to line){
  //    for(j <- 1 until i){
  //      as(i)(j)=as(i-1)(j)+as(i-1)(j-1)
  //    }
  //  }
  //  //循环二维数组，i是每一个一维数组
  //  for(i <- as){
  //    //循环每一个一维数组,j是每一个值
  //    for(j <- i){
  //      print(s"${j}\t")
  //    }
  //    println()
  //  }
  //
  //
  //  var i=Array(1,2,3)
  //
  //  var ii=Array(Array(1,2,3),Array(3,4,5))

  //  var i1=Array(123,321,222,333,444)
  //  var i2=Array(1,2,3)
  //
  //  var i3:Array[Int] = Array.concat(i1,i2);
  //
  //  //i3.foreach(f=>{println(f)})
  //  i3.foreach(println(_))
  //  var as = Array.range(1,10)
  //  as.foreach(println(_))
  //  var a1=Array.apply[Int](123,321,3123)
  //  a1.foreach(println(_))

  //  var a1=Array.range(1,11)
  //  var a2=Array(111,222)
  //  Array.copy(a1,0,a2,0,3)
  //
  //  a2.foreach(println(_))



//  var a1=Array.empty
//  var a3=Array.empty[Int]
//  var a4=Array()
  /**
    * 从11开始往后生成9个数，一共十个数
    * 后9个数的生成方式f=>f+1)
    */
//  var a1=Array.iterate[Int](11,10)(f=>f*2)
//  a1.foreach(println(_))


//  var a1=Array.fill(5)(UUID.randomUUID().toString)
//  a1.foreach(println(_))


//  var a1=Array.tabulate(10)(f=>(f+11)*(f+11))
//  var a1=Array.tabulate(10)(f=>math.pow(f+11,2))
//  a1.foreach(println(_))


//  var list=List(123,222,333,444)
//
  //  list.foreach(println)

  //  var list01=123 :: (222 :: (333 :: (444 :: Nil)))
  //  list01.foreach(println)
  //
  //  var list02=Nil.::(444).::(333).::(222).::(123)
  //  list02.foreach(println)

  /**
    * Null null Nil none
    *
    */

//  var list=List("123","222",333,444)
//  println(list.head)
//  println(list.tail)
//  println(Nil.isEmpty)

//  var list01 = 111 :: (222 :: (333 :: Nil))
//  var list02 = 444 :: (555 :: (666 :: Nil))
//  var list04 = list01:::list02
//  var list05 = list01.:::(list02)
//  var list06 = List.concat(list01,list02)
//  list04.foreach(f=>print(s"${f}\t"))
//  println()
//  list05.foreach(f=>print(s"${f}\t"))
//  println()
//  list06.foreach(f=>print(s"${f}\t"))

  //:前后对着List 数在左或右 则往最对应方法向加
//  var list:List[Int] = Nil
//  list = 11+:list;
//  list = 22+:list;
//  list = 33+:list;
//  list = list:+11;
//  list = list:+22;
//  list = list:+33;

//  list=list.:+(1)
//  list=list.+:(2)
//
//  list.foreach(println)
//  var list=111 :: (222 :: (333 :: Nil))

//  println(list.apply(1))
//  var builder = new StringBuilder
//  list.addString(builder,",")
//  println(builder)

//  var list = List.fill[Double](10)(math.floor(math.random*1000))
//  list.foreach(f=>printf("%.0f,",f))

  var list=List(692,84,756,998,603,146,511,19,426,418)
  list.dropWhile(_%2==0).foreach(println)























}
