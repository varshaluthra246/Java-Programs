import java.util.Scanner;
public class ReplaceExample1{  
public static void main(String args[]){  
Scanner sc = new Scanner(System.in);
String s1,r1,r2;  
System.out.println("Enter any String:");   //varsha
s1 = sc.nextLine();
System.out.println("Enter the string u want to replace :");   
r1 = sc.nextLine();

System.out.println("replace with :");  
r2= sc.nextLine();

String replaceString=s1.replace(r1,r2);//replaces all occurrences of 'r' to 'p'  
System.out.println(replaceString);  //vprshp
}}