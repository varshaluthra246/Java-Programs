// To print array elements
public class Array1 {
    public static void main(String args[])
    {
        int a[] = new int[3];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        //using For loop
        System.out.println("Array using For Loop (reverse)");
        for(int i =2; i>=0; i--){

            System.out.println(a[i]+ " ");
        }
System.out.println("Array using For Loop in sequence");
        for(int i =0; i<=2; i++){

            System.out.println(a[i]+ " ");
        }
        System.out.println("Array using For-each Loop");
        // Using For-each loop:
        for(int b : a)
        {

            System.out.println(b+ " ");

        }


    }
}