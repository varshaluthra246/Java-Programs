class Bike{  
 final void run()
{
System.out.println("running");
}  
}  
     
class Final_method extends Bike{  
   //void run(){System.out.println("running");
void run1(){
System.out.println("running safely with 100 kmph");
}  
     
   public static void main(String args[]){  
   Final_method h= new Final_method();  
   h.run(); 
	h.run1(); 
   }  
}