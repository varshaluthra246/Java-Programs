//Copy array elements
import java.util.Scanner;
public class Array5 {
    public static void main(String args[]) {
        int a[] = new int[5];
        int b[] = new int[5];
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Value for first array:");
        for (int i = 0; i < a.length; i++) {
            a[i]=r.nextInt();
        }
        System.out.println("First array elements:");
        for(int i=0;i<5;i++)
        {
            System.out.println( a[i] +"");
        }
        System.out.println("Second array element");
        for(int i =0;i<5;i++)
        {
            b[i]=a[i];
            System.out.println( b[i] +"");
        }
    }
}
/*int a=90;
int b;
b=a;*/