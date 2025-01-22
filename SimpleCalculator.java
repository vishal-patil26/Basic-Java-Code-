import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double x = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double y = scanner.nextDouble();

        System.out.print("Enter operation (Add, Subtract, Multiply, Divide): ");
        String operation = scanner.next().toLowerCase();

        double result = 0;

        switch (operation) {
            case "add":
                result = x + y;
                break;
            case "subtract":
                result = x - y;
                break;
            case "multiply":
                result = x * y;
                break;
            case "divide":
         
                if (y != 0) {
                    result = x / y;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    return; 
                }
                break;
            default:
                System.out.println("Invalid operation. Please enter Add, Subtract, Multiply, or Divide.");
                return; 
        }

        System.out.println("Result: " + result);
    }
}
