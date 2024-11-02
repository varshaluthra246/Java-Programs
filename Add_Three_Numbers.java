import java.util.Scanner;
class Add_Three_Numbers
{
   public static void main(String[] args) 
    {   
    
      Scanner sc= new Scanner(System.in);
        
         System.out.println("Enter 1 number:");
         int a=sc.nextInt();
         System.out.println("Enter 2 number:");
         int b=sc.nextInt();
         System.out.println("Enter 3 number:");
         int c=sc.nextInt();
         int d = a+b+c;
         System.out.println("Total="+d);
         sc.close(); 
   }
}