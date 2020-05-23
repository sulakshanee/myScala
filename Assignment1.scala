

object Assignment1 {
  
  //Ques1
    def convert(x:Double):Double = x*1.8+32.0;
    
  //Ques2
    def volume(r:Double):Double = 4/3*math.Pi*r*r*r;
    
  //Ques3
    def bookPrice(y:Int):Double = y*24.95;
    def discount(dis:Double):Double = dis*40/100;
    def shipping(y:Int):Double = y*3+(y-50)*0.75;
    
 
    
    def main(args:Array[String]){
      println(convert(35));
      println(volume(5));
      println(bookPrice(60)-discount(bookPrice(60))+shipping(60));
    }
  
}