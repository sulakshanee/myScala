object Assignment5 {
  
  class Rational(a:Int,b:Int){
    
    def numer = a;
    def denom = b;
    
    override def toString = numer + "/" + denom;
    
    //Ques1
    def neg = new Rational(-numer,denom);
    
    //Ques2
    def sub(r:Rational) = new Rational(numer*r.denom - r.numer*denom,denom*r.denom);
  }
  
  
  class Account(id:String,no:Int,bal:Double){
    
    val nic:String = id;
    val account_no:Int = no;
    var balance:Double = bal;
    
    override def toString = "["+nic+":"+account_no+":"+balance+"]";
    
    //Ques3
    def withdraw(a:Double) = new Account(nic,account_no,balance - a);
    
    def deposit(a:Double) = new Account(nic,account_no,balance + a);
    
    def transfer(a:Account,b:Double) = {
      println(a.deposit(b));
      println(this.withdraw(b));
    }
    
  }
  
  def main(args:Array[String]){
    
    val x = new Rational(3,4);
    val y = new Rational(5,8);
    val z = new Rational(2,7);
    
    println(x.neg);
    println(x.sub(y.sub(z)));
    println((x.sub(y)).sub(z));
    
    val a1 = new Account("222v",123,1000.00);
    val a2 = new Account("333v",234,1500.00);
    
    a1.transfer(a2,500.00)
    
    val a3 = new Account("444v",345,-300.00);
    val a4 = new Account("555v",456,-2500.00);
    val a5 = new Account("666v",567,100.00);
    
    var bank:List[Account] = List(a3,a4,a5);
    
    //Ques4.1
    val neg_balance=(b:List[Account]) => b.filter(x=>x.balance.<(0));
    println(neg_balance(bank));
    
    //Ques4.2
    val sum_of_balance=(b:List[Account]) => b.reduce((x,y)=>(new Account(x.nic,x.account_no,x.balance+y.balance)));
    println(sum_of_balance(bank).balance);
    
    //Ques4.3
    val interest=(b:List[Account]) => b.map(x=>{if(x.balance>0) (new Account(x.nic,x.account_no,x.balance+x.balance*0.05)) else (new Account(x.nic,x.account_no,x.balance+x.balance*0.1))});
    println(interest(bank));
    println(sum_of_balance(interest(bank)).balance);
  }
  
}