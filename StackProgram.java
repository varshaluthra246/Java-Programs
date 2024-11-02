import java.util.Stack;
class StackProgram 
{
static void showpush(Stack s, String st) 
{
s.push(new String(st));
System.out.println("push");
System.out.println("stack: " + s);
}
static void showpop(Stack s)
{
System.out.print("pop -> ");
String st = (String) s.pop();
System.out.println(st);
System.out.println("stack: " + s);
}
public static void main(String args[])
{
Stack s = new Stack();
System.out.println("stack: " + s);
showpush(s, "varsha");
showpush(s, "amit");
showpush(s, "swati");
showpush(s, "raju");
showpush(s, "kaju");
showpush(s, "kajal");
showpop(s);
showpop(s);
showpop(s);
showpop(s);
showpop(s);
showpop(s);
try 
{
showpop(s);
}
catch(Exception e)
{
System.out.println("Stack is Empty.");
}
}
}
