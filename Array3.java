// To find the LENGTH Of the array elements
import java.util.Scanner;
public class Array3 {
    public static void main(String args[]){
        int a[] = new int[5];
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i<a.length;i++){
            a[i]=r.nextInt();
        }
        System.out.println("Array Elements");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+ " ");
        }
        System.out.println("Array length:"+ a.length);
    }
}