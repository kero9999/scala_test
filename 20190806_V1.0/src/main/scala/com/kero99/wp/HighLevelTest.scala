package com.kero99.wp

/**
  *
  * @author wp
  * @date 2019-08-06 16:34
  *
  */
object HighLevelTest extends App {
//  def buy(f:Int => String,index:Int)=f(index)
//  println(buy(f=>{
//    if(f==1001){
//      "🍎"
//    }else if(f==1002){
//      "🍐"
//    }else{
//      "🍌"
//    }
//  },1003))




//  def getGoods[E](index:E)={
//    if(index==1001){
//      "🍎"
//    }else if(index==1002){
//      "🍐"
//    }else{
//      "🍌"
//    }
//  }
//  println(buy(getGoods,1002))









  var index = 10;
  //格式化结果为两位小数
  var tmp = (i:Number)=>"%.2f".format(index*i.doubleValue())
  println(tmp(5))
  println(tmp(3.14))


  Array
}
