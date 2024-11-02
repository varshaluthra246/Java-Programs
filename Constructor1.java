//Java Program to create and call a default constructor  
class Constructor1{  

//creating a default constructor  

Constructor1()
{
System.out.println("Bike is created");
}  
//main method  

public static void main(String args[]){  
//calling a default constructor  

Constructor1 b=new Constructor1(); 
Draw b1 = new Draw();
b1.draw(); 
}  
//draw(){System.out.println("Car is created");}
}
 class Draw
{
 void draw(){System.out.println("Car is created");}
}

