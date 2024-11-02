
// Insert element into array
import java.util.Scanner;
public class Array16 {
    public static void main(String args[]){
        int size, loc, item, i;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter array size:");
        size = r.nextInt();
        int a[] = new int[size+1];
        System.out.println("enter array elements");
        for(i = 0; i<size ;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.println("enter array location:");
        loc =r.nextInt();
        System.out.println("Enter new item:");
        item = r.nextInt();
        for( i = size; i>loc; i--)
        {
            a[i] = a[i-1];
        }
        a[loc] = item;
        size++;
        for(i = 0; i<a.length ;i++)
        {
            System.out.println(a[i]+ " ");
        }
    }
}
