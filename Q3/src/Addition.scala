import scala.io.StdIn._

object Addition {
  def main(args: Array[String]): Unit = {


    print("Enter a Number : ")
    var no =readInt()

    println(Add(no))
  }
  def Add(a:Int):Int={
    if(a==0){
      0
    }
    else a + Add(a-1)

    //case _ =>gcd(b,a%b)
  }

}
