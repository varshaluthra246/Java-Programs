import java.util.Scanner;
// find average of array elements
//avg = sum/total terms
import java.util.Scanner;
public class Array8 {
    public static void main(String args[]) {
        Scanner r = new Scanner(System.in);
        int length1;
        System.out.println("Enter the elements you want in your array? ");
        length1 = r.nextInt();
        int a[] = new int[length1];
        int sum=0; double avg;

        System.out.println("Enter Value for first array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt();
        }
        System.out.print(" array elements:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "");
        }
        for (int i = 0; i < a.length; i++) {
            sum = a[i] + sum;
        }
        avg = sum/5;
        System.out.println("sum is" + sum + "and average is " + avg);

    }
}