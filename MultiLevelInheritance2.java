class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{    //level 1
void bark(){System.out.println("barking...");}  
}   
class BabyDog extends Dog{  //level 2
void weep(){System.out.println("weeping...");}  
}  
class MultiLevelInheritance2{  
public static void main(String args[]){  
//Animal a = new Animal();
BabyDog a=new BabyDog();  
/*d.weep();  
d.bark();  
d.eat();  */
a.weep();
a.bark();
a.eat();

}}  