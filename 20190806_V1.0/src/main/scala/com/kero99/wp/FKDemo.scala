package com.kero99.wp

/**
  *
  * @author wp
  * @date 2019-08-06 14:06
  * 1 1 2 3 5 8 13 21...
  */
object FKDemo extends App {
  var index=8;

  if(index==1||index==2){
    println(1)
  }else{
      var ni=3
      var n1=1
      var n2=1
      var n3=n1+n2
      var isRun = true
      while(isRun){
        if(ni==index){
          println(n3)
          isRun=false
        }else{
          n1=n2
          n2=n3
          n3=n1+n2
        }
        ni+=1
      }
  }


}
