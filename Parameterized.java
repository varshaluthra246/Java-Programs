class Parameterized{  
    int id;  
    String name;  
    //creating a parameterized constructor  
    Parameterized1(int i,String n){  
    id = i;  
    name = n;  
    }    
    void display()
{
System.out.println(id+" "+name);
}  
    public static void main(String args[]){   
    Parameterized s1 = new Parameterized(111,"Karan");  
    Parameterized s2 = new Parameterized(222,"Aryan");   
    s1.display();  
    s2.display();  
   }  
}  