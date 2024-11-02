
//delete an array element
import java.util.Scanner;
public class Array17 {
    public static void main(String args[]) {
        int size, loc, i;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter array size:");
        size = r.nextInt();
        int a[] = new int[size + 1];
        System.out.println("enter array elements");
        for (i = 0; i < size; i++) {
            a[i] = r.nextInt();
        }
        System.out.println("enter array location:");
        loc = r.nextInt();
        for(i=loc;i<size-1;i++)
        {
            a[i]=a[i+1];
        }
        size--;
        for(i=0;i<size;i++)
        {
            System.out.println(a[i]+ " ");
        }

    }
}
