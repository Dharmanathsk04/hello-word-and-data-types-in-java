import java.util.Scanner;  // Import Scanner for input

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables and Data Types
        double num1, num2, result;
        char operator;

        // Input
        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();

        System.out.print("Choose an operator (+, -, *, /): ");
        operator = sc.next().charAt(0);

        // Calculation using switch
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;

            default:
                System.out.println("Invalid operator!");
        }

        sc.close();  // Close scanner
    }
}
