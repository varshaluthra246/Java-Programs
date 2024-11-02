import java.util.Scanner;

//to find the smallest element in an array
public class Array15 {
    public static void main(String args[]) {
        int a[] = new int[5];
        int min;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Value for first array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt();
        }
        min = a[0];
        for (int i = 1; i < a.length; i++) {

            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Minimum element:" + min);
    }
}