//Java program to find whether the given character is an alphabet or not
import java.util.Scanner;
public class AlphabetOrNot {
   public static void main(String args[]){
      System.out.println("Enter a character :: ");
      Scanner sc = new Scanner(System.in);
      char ch = sc.next().charAt(0);

      if(((ch >= 'A' && ch <= 'Z')||ch >= 'a' && ch <= 'z') ){
         System.out.println("Given character is an alphabet");
      }else{
         System.out.println("Given character is not an alphabet");
      }
   }
}