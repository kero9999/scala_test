/**
  *
  * @author wp
  * @date 2019-08-09 16:15
  *
  */
class Person(var name:String,var age:Int) {
  override def toString: String = s"name:${name},age:${age}"
}

object Person{
  def apply(name: String, age: Int): Person = new Person(name, age)

  def unapply(arg: Person): Option[(String, Int)] = {
    Some(arg.name,arg.age)
  }
}
object MatchClassDemo extends App{
  var zs = new Person("zhangsan",18)
  var ls = new Person("lisi",22)
  var ww = new Person("wangwu",66)

  for(tmp <- List(zs,ls,ww)){
    tmp match {
      case Person("zhangsan",18) => println(tmp)
      case Person("lisi",22) => println(tmp)
      case Person(pname,page) => println(s"name:${pname},age:${page}")
    }
  }

}