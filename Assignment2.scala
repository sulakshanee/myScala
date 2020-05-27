

object Assignment2 {
  
  //Ques1
    def working(hours:Int):Int = hours*150;
    def ot(hours:Int):Int = hours*75;
    def salary(h1:Int,h2:Int):Int = working(h1) + ot(h2);
    def tax(taxPrice:Double):Double = taxPrice*10/100;
    def takeHome(h1:Int,h2:Int):Double = salary(h1,h2) - tax(salary(h1,h2));
    
  //Ques2
    def attendees(price:Int):Int = 120 + ((15-price)/5)*20;
    def income(price:Int):Int = attendees(price)*price;
    def cost(price:Int):Int = 500 + attendees(price)*3;
    def profit(price:Int):Int = income(price) - cost(price);
    
    def main(args:Array[String]){
      
      println(("Take home salary = ") + takeHome(40,20));
      println(("The profit = ") + profit(25));
    }
}