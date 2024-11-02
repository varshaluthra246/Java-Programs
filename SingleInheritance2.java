class Animal{  
void eat(){System.out.println("eating...");}  
} 
class Animal2{  
void eat(){System.out.println("eabsvjws...");}  
}   
class Dog extends Animal,Animal2{  
void bark(){System.out.println("barking...");}  
}  
class SingleInheritance2{  
public static void main(String args[]){  
Dog d=new Dog();  
 
d.bark();  
d.eat(); 
d.eat();
}} 