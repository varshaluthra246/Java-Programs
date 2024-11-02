import java.util.Scanner;
class Add2{
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 number");
        int a = sc.nextInt();
        System.out.println("Enter 2 number");
        int b = sc.nextInt();
        int sum =a+b;
        System.out.println("Sum of these numbers is");
        System.out.println(sum);
        sc.close();
        
    }
}