interface Polygon {

  int area(int length, int breadth);
}
interface Polygon2 {

  int area1(int length, int breadth);
}
class Rectangle implements Polygon, Polygon2{

  public int area(int length, int breadth) {
	return length*breadth;   
  }
public int area1(int length, int breadth) {
	return length+breadth;   
  }
}
class Interface {
  public static void main(String[] args) {
    
    Rectangle r1 = new Rectangle();
    
   System.out.println("area of rect. :" + r1.area(5,6));
   System.out.println("area of rect. :" + r1.area1(5,6));
  }
}