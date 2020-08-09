
object Assignment6 {
  
  case class Point(x:Int,y:Int){
    def a:Int = x;
    def b:Int = y;
    
    //Ques1
    def add(that:Point) = Point(this.x+that.x , this.y+that.y);
    
    //Ques2
    def move(dx:Int,dy:Int) = Point(this.x+dx , this.y+dy);
    
    //Ques3
    def distance(that:Point):Double = math.sqrt(math.pow((this.x-that.x),2) + math.pow((this.y-that.y),2));
    
    //Ques4
    def switch = Point(this.y , this.x);
  }
  
  
  def main(args:Array[String]){
    
    val p1 = Point(1,2);
    val p2 = Point(4,5);
    
    println(p1.move(3,4));
    println(p1.add(p2));
    println(p1.distance(p2));
    println(p2.switch);
  }
}