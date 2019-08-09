/**
  *
  * @author wp
  * @date 2019-08-09 14:36
  *
  */
class Persion(pname:String,page:Int) {
  override def toString: String ={
    s"name:${pname},age:${page}"
  }
}

object Test extends App{
  println(new Persion("张三",22))
}

//class Teacher(tname:String,tage:Int) extends Persion("zhangsan",22){
//
//}
