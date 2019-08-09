/**
  *
  * @author wp
  * @date 2019-08-09 15:20
  *
  */
class Marker private(color:String) {
  println("Marker创建了:"+this)

  override def toString: String = s"color : ${color}"
}

object Marker{
  val map=Map(
    "red" -> new Marker("red"),
    "blue" -> new Marker("blue"),
    "green" -> new Marker("green")
  )

  def apply(color: String): Marker = if(map.contains(color)) map(color) else null

  def getMarker(color: String): Marker = if(map.contains(color)) map(color) else null

}
object MarkerDemo extends App{

//  var marker = new Marker("pink")
//  println(Marker("blue"))
//  println(Marker.getMarker("green"))
}