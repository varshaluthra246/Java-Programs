import java.util.Scanner;
class Factoral2
{
	public static void main(String arg[])
	
	{
	
            long n,fact=1;
	
	    Scanner sc=new Scanner(System.in);
 
	    System.out.println("enter number");
	   
            n=sc.nextLong();
 
	    for(int i=1;i<=n;i++)
	    {
	
	    fact=fact*i;
 
 	    }
 
  	    System.out.println("fact="+fact);
 
	}
 
}