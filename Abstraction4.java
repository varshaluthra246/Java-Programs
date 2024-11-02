abstract class Bike{  
  abstract void run();  
}  
class Abstraction4 extends Bike{  
void run(){System.out.println("running safely");}  
public static void main(String args[]){  
 Bike obj = new Abstraction4();  
 obj.run();  
}  
}  