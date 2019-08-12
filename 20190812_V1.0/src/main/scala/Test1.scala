/**
  *
  * @author wp
  * @date 2019-08-12 14:15
  *
  */
object Test1 extends App {
  def printInfo(x:(String,Int))=println(s"姓名:${x._1},年龄:${x._2}")

  implicit def xToY(str:String):(String,Int)=
    (str.split(",")(0),str.split(",")(1).toInt)


  //printInfo(xToY("zhangsan,22"))

  printInfo("lisi,18,aaa,vvv,bbb,xcc")
  printInfo("lisi,18,aaa,vvv,bbb,xcc")
  printInfo("lisi,18,aaa,vvv,bbb,xcc")
  printInfo("lisi,18,aaa,vvv,bbb,xcc")
  printInfo("lisi,18,aaa,vvv,bbb,xcc")

}
