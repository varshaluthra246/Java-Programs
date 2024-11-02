import java.util.*;
class LinkedListProgram {
public static void main(String args[])
{
LinkedList list1 = new LinkedList();
list1.add("varsha");
list1.add("simran");
list1.add("raju");
list1.add("amit");
list1.add("swati");
list1.addLast("sam");
list1.addFirst("Anil");
list1.add(5, "gagan");
System.out.println("Initial Contents of linked list are = " + list1);
list1.remove("swati");
list1.remove(3);
System.out.println("Contents of linked list after deletion: "+ list1);
list1.removeFirst();
list1.removeLast();
System.out.println("linked list after deleting first and last item: " + list1);
System.out.println("linked list after updation: " + list1);
}
}