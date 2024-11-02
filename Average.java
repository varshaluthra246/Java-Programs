import java.util.Scanner;
public class Average {

    
  public static void main(String[] args)

{       
    int i,n=0,s=0;
	double avg;
	{
	   
        System.out.println("Input the 5 numbers : ");  
         
	}
		for (i=0;i<5;i++)
		{
		    Scanner in = new Scanner(System.in);
		    n = in.nextInt();
		    
  		s +=n;
	}
	System.out.println("Sum is " + s);
	avg=s/5;
	System.out.println("Average is " + avg);
    //in.close();
 
}
}