package com.kero99.wp

import scala.util.control.Breaks

/**
  *
  * @author wp
  * @date 2019-08-06 14:15
  *
  */
object ForTest extends App {
  //Range
//  for(i <- Range(1,11,2)){
//    println(i)
//  }

//  Range(1,11).filter(_%2==1).foreach(println(_))
//  Range(1,11).filter(f=>{f%2==1}).foreach(f=>{println(f)})



//  for(i <- Range.inclusive(1,10)){
//    println(i)
//  }

//    for(i <- 1 to 10 by 2){
//      println(i)
//    }

//    for(i <- 1 until 10){
//      println(i)
//    }

//  var list = List(123,321,456,654);
//  for(i <- list){
//    println(i)
//  }


//  for(i <- 1 to 10 by 2
//      if i!=3;if i!=7){
//    println(i)
//  }

  var loop=new Breaks
  loop.breakable{
    var i=1
    while(true){
      println(i)
      if(i==10){
        loop.break
      }
      i+=1;
    }
  }



}
