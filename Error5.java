class Error5{
    public static void main(String args[]) {
    int num1, num2;
    try {
   
    num1 = 10;
    num2 = 62 / num1;
    System.out.println(num2);
    System.out.println("Hey I'm at the end of try block" + num2);
    }
    catch (ArithmeticException e) {
    
    System.out.println("You should not divide a number by zero");
    }
    catch (Exception e) {
   
    System.out.println("Exception occurred");
    }
    System.out.println("I'm out of try-catch block in Java.");
    }
   }
   