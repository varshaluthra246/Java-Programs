import java.util.Scanner;
class Areaofparallelogram 
{
   public static void main(String args[]) 
    {   
       
      Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the height:");
         double d1= s.nextDouble();
        System.out.println("Enter the breadth:");
         double d2= s.nextDouble();
          
          double  area=(d1*d2) ;      //b*h
      System.out.println("Area of Parallelogram is: " + area);      
   }
}