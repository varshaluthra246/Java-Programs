import java.util.Arrays;
// Use of STATIC METHODS in array -- a) toString()  b) asList()  c) deepToString()
public class Array2 {
    public static void main(String[] args)
    {
        String a[]={"hello","varsha","Subjectsaholic","Coding"};
        System.out.println("toString()  " + Arrays.toString(a));
        System.out.println("asList()  " + Arrays.asList(a));
        int arr[][] = {{10,20,30},{40,50,60}};
        System.out.println("deepToString()" + Arrays.deepToString(arr));

    }
}