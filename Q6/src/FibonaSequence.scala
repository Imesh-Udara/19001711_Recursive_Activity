import scala.io.StdIn.readInt
import scala.util.control.Breaks.break

object FibonaSequence {
  def main(args: Array[String]): Unit = {
    print("Enter a Number : ")
    var n=readInt()

    printFibona(n,0)
  }
  def fib(n:Int):Int={//formula

    if(n<=1)
      n
    else
      fib(n-1)+fib(n-2)
  }
  def printFibona(n:Int,i:Int){//for print

    if(n==i)
      break
    else
      println(fib(i))
    printFibona(n,i+1)

  }
}
