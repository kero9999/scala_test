/**
  *
  * @author wp
  * @date 2019-08-09 14:44
  *
  */
//伴生类
class TbUsers(name:String,age:Int) {
  override def toString: String = {
    s"name:${name},age:${age}"
  }
}
//伴生类对象
object TbUsers{
  def apply(name: String, age: Int): TbUsers = {
    var tmp = new TbUsers(name, age)
    println("TbUsers的apply方法")
    tmp
  }

  def apply(): TbUsers = new TbUsers("匿名", 0)
}


object CompanionDemo extends App {
  //类的构造方法
//  var u1=new TbUsers("zhangsan",18)

  //伴生类对象中的apply
//  println(u1)
  var u2=TbUsers.apply("lisi",22)
//  println(u2)
  var u5=TbUsers("zhaoliu",33)

  //  var u3=TbUsers.apply()
  //  println(u3)
  //
  //  var u4=TbUsers()
//  var l1 = List()
//  var l2 = List.apply()
}