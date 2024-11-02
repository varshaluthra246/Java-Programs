
abstract class Car{  

  abstract void run();  

}  

class Abstraction2 extends Car{  

void run(){
System.out.println("Hyundai manufactures cars");
}  

public static void main(String args[]){  

 Abstraction2 obj = new Abstraction2();  

 obj.run();  

}  

} 