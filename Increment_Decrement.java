/*public class Increment
{
public static void main(String args[])
{
int x = 4; 
int y = (++x) + 100;
// x = 5, y = 105
System.out.println(x);
System.out.println(y);
int a = 4;
int b = (a++) + 100;
// x = 5, y = 104
System.out.println(a);
System.out.println(b);
}
}
*/
import java.util.Scanner;
public class Increment_Decrement
{
    public static void main(String[] args) 
    {
        int a, b, c, d, e;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer a:");     //12
        a = s.nextInt();
        b = ++a;   						// 13 = //13
        System.out.println("Result after Pre Increment a:"+a); //13
        System.out.println("Result after Pre Increment b:"+b);  //13
        c = a++;									//first a = 13; then incremented to 14; so, C = 13 first
        System.out.println("Result after Pre Increment a:"+a);		//14
        System.out.println("Result after Post Increment c:"+c);		//13
        d = --a;										//a = 14-1 = 13
        System.out.println("Result after Pre Increment a:"+a);  //13
        System.out.println("Result after Pre Decrement d:"+d);  //13
        e = a--;
        System.out.println("Result after Pre Increment a:"+a);  //a = 13-1 = 12; but e = 13 bcoz first assign and then reduce.
        System.out.println("Result after Post Decrement e:"+e);
    }   
}