class ConstOverloading{  
    int id;  
    String name;  
    int age;   
    ConstOverloading(int i,String n)
{  
    id = i;  
    name = n;  
System.out.println(id+" "+name+" "+age); 
}  
    ConstOverloading(int i,String n,int a)
{  
    id = i;  
    name = n;  
    age=a; 
System.out.println(id+" "+name+" "+age);  
 }  
    void display()
{
System.out.println(id+" "+name+" "+age);
}  
    public static void main(String args[]){  
   ConstOverloading s1 = new ConstOverloading(111,"Karan");  
    ConstOverloading s2 = new ConstOverloading(222,"Aryan",25);  
    s1.display();  
    s2.display();  
   }  }  