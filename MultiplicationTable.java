import java.util.Scanner;
class MultiplicationTable{

   public static void main(String[] args)

{
   int i,n;

   System.out.print("Input the number(Table to be calculated): ");
{
   System.out.print("Input number of terms : ");
    Scanner in = new Scanner(System.in);
		    n = in.nextInt();

   System.out.println ("\n");
   for(i=0;i<=n;i++)
  
     System.out.println(n+" X "+i+" = " +n*i);
   }
}
}