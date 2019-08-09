/**
  *
  * @author wp
  * @date 2019-08-09 14:28
  *
  */



class TbStudent (name:String,age:Int) {
  def info(): Unit ={
    println(s"姓名：${name},年龄：${age}")
  }
}

object Demo extends App{
  var stu = new TbStudent("zhangsan",18)
  stu.info()
}
