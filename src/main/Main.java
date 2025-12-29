import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rdm = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to basic java calculator");
        System.out.println("What type of calculation? (add, rest, multi, division, power, min)");
        String type = sc.nextLine();

        System.out.println("Enter the first number:");
        double num1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the second number:");
        double num2 = sc.nextDouble();
        sc.nextLine();

        double result;

        if (type.equalsIgnoreCase("add")) {
            result = num1 + num2;
        } else if (type.equalsIgnoreCase("power")) {
            result = Math.pow(num1, num2);
        } else if (type.equalsIgnoreCase("min")) {
            result = Math.min(num1, num2);
        } else if (type.equalsIgnoreCase("rest")) {
            result = num1 - num2;
        } else if (type.equalsIgnoreCase("multi")) {
            result = num1 * num2;
        } else if (type.equalsIgnoreCase("division")) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Cannot divide by zero!");
                sc.close();
                return;
            }
        } else {
            System.out.println("Invalid operation!");
            sc.close();
            return;
        }

        System.out.println("The result is " + result);
        sc.close();
    }
}
