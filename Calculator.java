import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Simple Calculator!");
        System.out.println("Enter two numbers:");

        System.out.print("Number 1: ");
        double num1 = scanner.nextDouble();

        System.out.print("Number 2: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter operation number: ");
        int operation = scanner.nextInt();

        double result = 0.0;

        switch (operation) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation selection.");
                return;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
