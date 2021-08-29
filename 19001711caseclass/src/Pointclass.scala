case class Pointclass(x:Int,y:Int){

  def move(dx:Int,dy:Int)=Pointclass(this.x+dx,this.y+dy)  def +(that:Pointclass)=Pointclass(this.x+that.x,this.y+that.y)
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  def distance(point2:Pointclass):Double={
    val A=BigInt(this.x-point2.x).pow(2)+BigInt(this.y-point2.y).pow(2)
    math.sqrt(A.toDouble)
  }//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  def invert()=Point(this.y,this.x)
}