//package Array;
import java.util.Arrays;
import java.util.Scanner;
// sort() , equals(), copyof()
public class Array12 {
        public static void main(String args[]) {
            int a[] = new int[5];
            int a2[] = new int[5];
            Scanner r = new Scanner(System.in);
            System.out.println("Enter Value for first array:");
            for (int i = 0; i < a.length; i++) {
                a[i] = r.nextInt();
            }
            System.out.println("Enter Value for second array:");
            for (int i = 0; i < a2.length; i++) {
                a2[i] = r.nextInt();
            }
            boolean  b = Arrays.equals(a,a2);    //equals()
            System.out.println("is both array equals??"  + b);
        }
    }