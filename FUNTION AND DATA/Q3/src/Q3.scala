object Q3 {

  def main(args: Array[String]): Unit = {


    class Account(id: String, n: Int, b: Double) {
      val NIC: String = id;

      var balance: Double = b;
      val numb: Int = n;



      def deposit(amount: Double) = this.balance += amount;
      def withdraw(amount: Double) = this.balance -= amount;

      def transfer(amount: Double, that: Account): Unit = {
        this.balance = this.balance - amount;
        that.balance = that.balance + amount;
      }


      @Override
      override def toString(): String = " NIC : " + this.NIC + "\n Account Number : " + this.numb + "\n Balance : " + this.balance;

    }
    val myaccount = new Account("971532327V", 10, 100.0)
    println(myaccount);


  }

}
