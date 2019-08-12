/**
  *
  * @author wp
  * @date 2019-08-09 16:48
  *
  */
object ArrayDemo extends App {
  var tmp= Array.tabulate(2,3)((x,y)=>{
    (x,y)
  });

  for(i <- tmp){
    for(j <- i){
      print(s"${j}\t")
    }
    println()
  }
}
