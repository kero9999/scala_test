package com.kero99.wp

import scala.util.control.Breaks

/**
  *
  * @author wp
  * @date 2019-08-08 14:00
  *
  */
object ListTest extends App {
//  var list01=123::456::789::Nil;
//  var list02=111::456::123::999::Nil;
//  println(list01.equals(list02))

//  println(list01.exists(_<100))

//  list01.filter(_%2!=0).foreach(println)


  //println(list01.head,list01.last)

//  println(list01.indexOf(456,2))


//  println(list01.tail,list02.init)


//  list01.intersect(list02).foreach(prin tln)


  var list=List(
      "hello,world,hadoop",
      "hadoop,hdfs,mr",
      "hello,spark",
      "admin,root")


  list.map((_,1)).foreach(println)
  list.map(mapFun(_)).foreach(println)

  def mapFun(f:String) ={
    Tuple2(f,1)
  }

//  list.map((_,1)).toMap.foreach(f=>println(f._1+":"+f._2))
//    println(list.toBuffer)toBuffer

//  var max = list.head
//  var tmp = list.tail
//  var loop = new Breaks
//  tmp.foreach(f=>{
//    var minLength = math.min(max.length,f.length)
//    loop.breakable(
//      for(i <- 0 until minLength){
//        if(max.charAt(i)!=f.charAt(i)) {
//          if (max.charAt(i) > f.charAt(i)) {
//            max = f
//          }
//          loop.break()
//        }
//      })
//  })
//  println(max)

  //String ==> String[]
  //"hello,world".split(",").foreach(println)

  //List[String] ==> String
  //println(List("hello","world").mkString(","))

//  var nums = List.fill(10)(math.floor(math.random*100))
//  nums.sorted.foreach(println)
//  nums.sortWith((x,y)=>{x>y}).foreach(println)
//  println(nums.sum)















//  list.flatMap(_.split(",")).map((_,1)).groupBy(_._1).
//    foreach(f=>{
//      println(f._1+":"+f._2.length)
//    })
//  var t=Tuple2("hello",2)
//  println(t._1,t._2)







  //1 ==> 1
  //list.map(_.split(",")).foreach(_.foreach(println))


  //  List(
  //    Array("hello","world","hadoop"),
  //    Array("hadoop","hdfs","mr"),
  //    Array("hello","spark")
  //  )

  //1 ==> 多
//  list.flatMap(_.split(",")).foreach(println)
//
//  List("hello","world","hadoop","hadoop","hdfs","mr","hello","spark")

















}
