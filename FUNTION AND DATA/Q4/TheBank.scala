object TheBank extends App {

class Account( id:String , n: Int , b : Double){
    val NIC: String = id;
    val Number : Int = n;
    var Balance : Double = b;

    def withdraw(amount : Double) = this.Balance -= amount;

    def deposit (amount : Double) = this.Balance += amount;

    def transfer(amount : Double , that : Account): Unit = {
        this.Balance =  this.Balance - amount;
        that.Balance = that.Balance + amount;
    }


    @Override
    override def toString() : String = " NIC : " + this.NIC + "\n Account Number : " + this.Number + "\n Balance : " + this.Balance;

}
   
    var BankAccs : List[Account] = List( new Account("970001111v",1,50000.0),new Account("600002229v",2,1000.0),new Account("800489785v",3,-200.0));

    

    val overdraft = ( b : List[Account] ) => b.filter( x => x.Balance < 0);


    def Acc_bal():Double={
      
        var sum:Double=0;
        for(acc<-BankAccs){
         sum=sum+acc.Balance;
         }
        sum;
    }
    
    
    def interest(): Unit ={
        for(acc<-BankAccs){
          if(acc.Balance>0){
            acc.Balance=acc.Balance+acc.Balance*0.05.toFloat;
          }else if(acc.Balance<=0){
            acc.Balance=acc.Balance+acc.Balance*0.1.toFloat;
          }
        }
    }
    
    
    
    
    println(" *** Accounts *** \n " + BankAccs);
    
    println;
    
    println;
    println("*** Overdraft Accounts *** \n" + overdraft(BankAccs ));
    println;
    println("total balance of accounts = " + Acc_bal())
    println;
    interest();

    
    println;
    println("*** Balance after adding interest ***\n" + Acc_bal());
    println;
    }

