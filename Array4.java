// Print array elements in reverse order
import java.util.Scanner;
public class Array4 {
    public static void main(String args[])
    {
        int a[]=new int[5];
        Scanner r = new Scanner(System.in);
        System.out.print("Enter elements in array:");
        for(int i= 0;i<5;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.print("Array elements:");
        for(int i= 0;i<a.length;i++)
        {
            System.out.println(a[i]+ " ");
        }
        System.out.println("Array elements in REVERSE ORDER:");
        for(int i= a.length-1;i>=0;i--)
        {
            System.out.println(a[i]+ " ");
        }
    }
}