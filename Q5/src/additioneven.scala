import scala.io.StdIn.readInt

object additioneven {
  def main(args: Array[String]): Unit = {
    print("Enter a Number : ")
    var NO=readInt()

    println(AdditionOfeven(NO))
  }
  def AdditionOfeven(n:Int):Int={
    if (n%2==0){
      if(n==0) 0
      else n + AdditionOfeven(n - 1)
    }
    else {
      AdditionOfeven(n-1)
    }
  }
}
