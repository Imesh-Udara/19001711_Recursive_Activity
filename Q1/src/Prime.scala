import scala.io.StdIn._

object Prime extends App {
  def gcd(a:Int,b:Int):Int = b match {
    case 0 => a
    case b if (b>a) => gcd(b,a)
    case _ => gcd(b,a%b)
  }
  def PrimeNo(x:Int,y:Int): Boolean = x match {
    case x if x==y => true
    case x if gcd(x,y)>1 => false
    case t => PrimeNo(x,y+1)
  }
  print("Enter Your Number : ")
  var NO =readInt()

  println(PrimeNo(NO,2))
}
