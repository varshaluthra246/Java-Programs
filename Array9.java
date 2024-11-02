import java.util.Scanner;
//Sort array elements in ascending order
public class Array9 {
    public static void main(String args[]) {
        int a[] = new int[5];
        int temp;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter Value for first array:");
        for(int i = 0; i<5; i++)
        {
            a[i]=r.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            for(int j=i+1;j<5;j++)
            {
                if(a[i]>a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Sorted array elements:");
        for(int i = 0; i<5; i++)
        {

            System.out.println(a[i]);
        }

        }
}