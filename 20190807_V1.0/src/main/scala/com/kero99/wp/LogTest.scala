package com.kero99.wp
import java.text.SimpleDateFormat
import java.util.Date
/**
  *
  * @author wp
  * @date 2019-08-07 14:14
  *
  */
object LogTest extends App {

  def log(date:Date,msg:String):Unit={
    println(date+"-----"+msg)
  }
  var dateF=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
  var wpLog=log(dateF.parse("2019-01-01 22:22:22"),_:String)

  wpLog("新年开始了...")
  wpLog("开吃")
  wpLog("一年过去了...")

}
