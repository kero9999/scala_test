package com.com.wy
import com.zh.util.UsersToWpUtil._

/**
  *
  * @author wp
  * @date 2019-08-12 14:38
  *
  */
class UsersService{
  def demo(name:String)=println(s"UsersService的demo方法被调用,参数是:${name}")
}
object Test extends App {
  val usersService=new UsersService

  println(usersService)
  usersService.serviceTest("哈哈");
  usersService.demo("张涵大傻子")
  println(usersService)
}
