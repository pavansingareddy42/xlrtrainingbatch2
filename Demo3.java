import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num3 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("The greatest number is: " + num1);
        } else if (num2 > num3) {
            System.out.println("The greatest number is: " + num2);

        } 
        else if (num3 > num1) {
            System.out.println("The greatest number is: " + num3);
        }else {
            System.out.println("Both numbers are equal.");
        }
    }
}
