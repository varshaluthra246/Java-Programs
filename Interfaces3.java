interface Inf1{
   public void method1();
}
interface Inf2 extends Inf1 {
   public void method2();
}
public class Interfaces3 implements Inf2{
   /* Even though this class is only implementing the
    * interface Inf2, it has to implement all the methods 
    * of Inf1 as well because the interface Inf2 extends Inf1
    */
    public void method1(){
	System.out.println("method1");
    }
    public void method2(){
	System.out.println("method2");
    }
    public static void main(String args[]){
	Inf1 obj = new Interfaces3();
	Inf2 obj2 = new Interfaces3();
	//obj.method2();	
	obj2.method1();
	obj2.method2();
    }
}