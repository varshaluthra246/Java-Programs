import java.util.Arrays;
import java.util.Scanner;
// sort() , equals(), copyof()
public class Array13 {
        public static void main(String args[]) {
            int a[] = new int[5];
            Scanner r = new Scanner(System.in);
            System.out.println("Enter Value for first array:");
            for (int i = 0; i < a.length; i++) {
                a[i] = r.nextInt();
            }
            int a2[] = Arrays.copyOf(a,5);    //copyof
            System.out.println("Second array elements:");
            for(int i = 0; i<a.length;i++)
            {
                System.out.println(a2[i] + " ");
            }
        }
    }