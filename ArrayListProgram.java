import java.util.*;
class ArrayListProgram {
public static void main(String args[]) {
ArrayList array1 = new ArrayList();
System.out.println("size of Array: " + array1.size());
array1.add("varsha");
array1.add("raju");
array1.add("kaju");
array1.add("sam");
array1.add("anjali");
array1.add("amit");
array1.add(4, "shweta");
array1.add(7, "swati");
System.out.println("Size of array1 after adding: " + array1.size());
System.out.println("Now (after adding) Contents of array1: " + array1);
array1.remove("raju");
array1.remove(5);
System.out.println("Size of array1 after deleting: " + array1.size());
System.out.println("Final Contents of array1: " + array1);
}
}