import java.util.Scanner;
class UserInput1
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter any first number:");
int a = sc.nextInt();
System.out.println("enter any second number");
int b = sc.nextInt();
int c = a + b;
System.out.println("Sum of a and b number is:" + c);
}
}