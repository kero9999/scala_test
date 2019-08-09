/**
  *
  * @author wp
  * @date 2019-08-09 15:39
  *
  */
object MatchDemo extends App {
//  var index=3
//  var result = index match {
//    case 1 => "选项1"
//    case 2 => "选项2"
//    case 3 => "选项3"
//    case 4 => "选项4"
//    case 5 => "选项5"
//    case _ => "其他选项"
//  }
//  println(result)
  def wpMatch(param:Any)= {
    param match {
      case y:Int if(-1 < y) => s"${y}正数"
      case y:Int => s"${y}整数"
    }
  }


  println(wpMatch(123))
}
