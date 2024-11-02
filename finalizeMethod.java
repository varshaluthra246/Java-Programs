/*Finalize is a method of an object class in which the garbage collector is called before destroying the object.

This method does not have any return type, it performs clean up activities.

The finalize method overrides to dispose of system resources,  is also useful to minimize memory leak.
*/
public class finalizeMethod {
     public static void main(String[] args)
    {

   String str1 = new String("CS");
        str1 = null;

       
        System.gc();
        System.out.println("output of main method");

    }
    
    protected void finalize()
    {
        System.out.println("output of finalize method");
    }
}
