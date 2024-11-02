//program to search element of an array
import java.util.Scanner;
public class Array7 {
    public static void main(String args[]) {
        int a[] = new int[5];
        int n, count = 0;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Value for first array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt();
        }
        System.out.println(" array elements:");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i] );
        }
        System.out.println("Enter Search Element:");
        n = r.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Item Found" + count + "times");
        } else {
            System.out.println("Item not Found");
        }
    }
}