class Bank{  
float getRateOfInterest(){
return 0;
}  
}  
class SBI extends Bank{  
float getRateOfInterest(){
return 8.4f;
} 
/*float getRateOfInterest(){
return 0;
} */ 
}  
class ICICI extends Bank{  
float getRateOfInterest(){
return 7.3f;
}  
}  
class AXIS extends Bank{  
float getRateOfInterest(){
return 9.7f;
}  
}  
class Polymorphism2{  
public static void main(String args[]){  
Bank b;  
b=new SBI();     //Bank b = new SBI();  
System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
b=new ICICI();  
System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
b=new AXIS();  
System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());  
 b = new Bank();
System.out.println("bank Rate of Interest: "+b.getRateOfInterest()); 
}  
}