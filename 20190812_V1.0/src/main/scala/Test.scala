/**
  *
  * @author wp
  * @date 2019-08-12 14:07
  *
  */
object Test extends App {
  implicit val str1:String="匿名1"
  implicit val str2:Int=2

  def printInfo(implicit name:String)=println(name)
  printInfo



  implicit var tmp = ("zhangsan",123)

  def  pInfo(implicit x:(String,Int))=println(x)


  pInfo
}
