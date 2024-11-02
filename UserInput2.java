import java.util.Scanner;
class UserInput2
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your Name, age and salary:");
String name = sc.nextLine();
int age = sc.nextInt();
double salary = sc.nextDouble();
System.out.println("your name is " + name);
System.out.println("your age is " + age);
System.out.println("your salary is " + salary);
}
}