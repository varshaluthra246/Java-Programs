import java.util.Scanner;

//Sort elements in descending order
public class Array10 {
        public static void main(String args[]) {
            int a[] = new int[5];
            int temp;
            Scanner r = new Scanner(System.in);
            System.out.println("Enter Value for first array:");
            for(int i = 0; i<a.length; i++)
            {
                a[i]=r.nextInt();
            }
            for (int i = 0; i < a.length; i++) {
                for(int j=i+1;j<a.length;j++)
                {
                    if(a[i]<a[j])
                    {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            System.out.println("Sorted array elements in descending order: ");
            for(int i = 0; i<a.length; i++)
            {

                System.out.println(a[i]);
            }

        }
    }