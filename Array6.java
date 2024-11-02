import java.util.Scanner;
//To find the sum of array elements
public class Array6 {

    public static void main(String args[]) {
        int a[] = new int[5];
        int sum = 0;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Value for first array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt();
        }
        System.out.println(" array elements:");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i] + "");
            sum = sum + a[i];
        }
        System.out.println("Addition of array elements:" + sum);
    }
}