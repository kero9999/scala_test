/**
  *
  * @author wp
  * @date 2019-08-09 14:03
  *
  */
object ReduceTest extends App {
  /**
    */
//  var list = 111::222::333::444::Nil
//  println(list.sum)
//  println(list.reduce(_+_))
    var list = "hello,world,spark"::
               "hello,world,hadoop"::
               "hadoop"::Nil
    ("hello",List(("hello",1),("hello",1)))

    list.flatMap(_.split(",")).map((_,1)).
      groupBy(_._1).foreach(f=>{
      var tu= f._2.reduce((x,y)=>{
          (x._1,x._2+y._2)
      })
      println(tu);
    })
}
