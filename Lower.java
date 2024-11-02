//Check whether a character is Lowercase or not in Java

public class Lower{
   public static void main(String []args) {
      System.out.println("Checking for Lowercase character...");
      char val = 'q';
      System.out.println("Character: "+val);
      if (Character.isLowerCase(val)) {
         System.out.println("Character is in Lowercase!");
      } else {
         System.out.println("Character is in Uppercase!");
      }
System.out.println("Checking for Uppercase character...");
      char val2 = 'Z';
      System.out.println("Character: "+val2);
      if (Character.isUpperCase(val2)) {
         System.out.println("Character is in Uppercase!");
      }else {
         System.out.println("Character is in Lowercase!");
      }
   }
}