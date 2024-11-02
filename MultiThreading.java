// Multi Threading Program
class A extends Thread
{
public void run()
{
for(int i = 1; i<=10; i++)
{
System.out.println("i="+i);
}
}
}
class B extends Thread
{
public void run()
{
for(int j = 1; j<=10; j++)
{
System.out.println("j="+(j*j));
}
}
}
class C extends Thread
{
public void run()
{
for(int k = 1; k<=10; k++)
{
System.out.println("k="+(k*k*k));
}
}
}
class MultiThreading {
public static void main(String str[])
{
A t1 = new A();
B t2 = new B();
C t3 = new C();
t1.start();
t2.start();
t3.start();
}
}

