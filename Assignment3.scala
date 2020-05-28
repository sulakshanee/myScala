

object Assignment3 {
  
  def GCD(n:Int,m:Int):Int = m match{
    case x if (x==0) => n
    case x if (x>n) => GCD(x,n)
    case x => GCD(x,n%x)
  }
  
  //Ques1
    def prime(n:Int,m:Int=2):Boolean = n match{
      case x if (x==m) => true
      case x if (GCD(x,m)>1) => false
      case x => prime(x,m+1)
    }
    
  //Ques2
    def primeSeq(n:Int):Any = {
      if (n>2) primeSeq(n-1)
      if (prime(n)==true) print((n) + " ")
    }

  //Ques3
    def addition(n:Int):Int = n match{
      case 1 => 1
      case _ => n + addition(n-1)
    }
    
  //Ques4
    def isOdd(n:Int):Boolean = n match{
      case 0 => false
      case _ => isEven(n-1)
    }
    
    def isEven(n:Int):Boolean = !(isOdd(n))
    
  //Ques5
    def evenAddition(n:Int):Int = n match{
      case 0 => 0
      case x if (isOdd(x)==true) =>  evenAddition(n-1)
      case x =>  n + evenAddition(n-2)
    }
    
  //Ques6
    def fibo(n:Int):Int = n match{
      case 0 => 0
      case 1 => 1
      case _ => fibo(n-1) + fibo(n-2)
    }
    
    def fiboSeq(n:Int):Any = {
      if(n>0) fiboSeq(n-1)
      print(fibo(n) + " ")
    }
    
    
    def main(args:Array[String]){
      
      println(prime(5),prime(8));
      primeSeq(10);
      println("\n" + addition(5));
      println(isOdd(5),isEven(4));
      println(evenAddition(10));
      fiboSeq(10);
    }
}