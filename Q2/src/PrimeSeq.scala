import scala.util.control.Breaks._
import scala.io.StdIn._

object PrimeSeq  {
  def main(args: Array[String]): Unit = {


    def gcd(a: Int, b: Int): Int = b match {
      case 0 => a
      case b if (b > a) => gcd(b, a)
      case _ => gcd(b, a % b)
    }

    def PrimeNo(x: Int, y: Int): Boolean = x match {
      case x if x == y => true
      case x if gcd(x, y) > 1 => false
      case t => PrimeNo(x, y + 1)
    }

    def printSequence(n: Int, i: Int) {
      if (n == 1 || n == i) {
        break
      }
      /*if(n==i)
      {
        break
      }*/
      if (PrimeNo(i, 2)) {
        println(i)
      }
      printSequence(n, i + 1)
    }

    print("Enter your Number")
    var n = readInt()
    printSequence(n, 2)
  }
}
