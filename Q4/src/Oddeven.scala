import scala.io.StdIn._
import scala.util.control.Breaks.break
object Oddeven {
  def main(args: Array[String]): Unit = {


    print("Enter a 1st Number : ")
    var L=readInt()
    print("Enter a 2nd Number : ")
    var M=readInt()

    //println(addition(n))

    // even numbers
    print("Even numbers:\t")
    Even(L, M)
    println()

    // odd numbers
    print("Odd numbers:\t")
    Odd(L,M)
  }

  def Even(L: Int, M: Int): Unit = {
    if (M < L) return

    if (M % 2 == 0) Even(L, M - 2)
    else Even(L, M - 1)

    if (M % 2 == 0) print(M + " ")
  }

  def Odd(L: Int, M: Int): Unit = {
    if (M < L) return

    if (M % 2 == 1) Odd(L, M - 2)
    else Odd(L, M - 1)

    if (M % 2 == 1) print(M + " ")
  }

}
