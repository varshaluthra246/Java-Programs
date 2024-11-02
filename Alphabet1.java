import java.util.Scanner;
public class Alphabet1
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the n value:");
int n = sc.nextInt();


int i, j;
for(i=1;i<=n;i++)
{
for(j=1;j<=n;j++)
{
if(i==1 || i==(n/2)+1 || j==1 || j==n)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
}
}

