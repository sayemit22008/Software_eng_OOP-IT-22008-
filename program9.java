import java.util.Scanner;

public class program9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🧮 Welcome to the Simple Calculator! 🧮");
        System.out.println("--------------------------------------");

        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("\nSelect an operation:");
        System.out.println("➕  Addition (+)");
        System.out.println("➖  Subtraction (-)");
        System.out.println("✖️  Multiplication (*)");
        System.out.println("➗  Division (/)");
        System.out.print("Enter your choice: ");
        char operation = scanner.next().charAt(0);

        double result = 0;
        boolean validOperation = true;

        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("❌ Error: Cannot divide by zero!");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("⚠️ Invalid operation selected!");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println("\n✅ Calculation Successful!");
            System.out.println("🔹 Result: " + result);
        }

        System.out.println("\n👋 Thank you for using the Calculator!");
    }
}
