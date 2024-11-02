import java.io.*;
class Exceptions19 {
void myMethod(int num)throws IOException, ClassNotFoundException{
 if(num==1)
 throw new IOException("IOException Occurred");
 else
 throw new ClassNotFoundException("ClassNotFoundException");
}
}
public class Exceptions9{
public static void main(String args[]){
 try{
 Exceptions19 obj=new Exceptions19();
 obj.myMethod(1);
 }catch(Exception ex){
 System.out.println(ex);
 }
}
}
