import java.util.Scanner;

public class program8 {
    private double accountBalance = 1000.0;

    public void deposit(double depositAmount) {
        accountBalance += depositAmount;
        System.out.println("✅ Successfully deposited: $" + depositAmount);
        System.out.println("🔹 Updated Balance: $" + accountBalance);
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount <= accountBalance) {
            accountBalance -= withdrawAmount;
            System.out.println("✅ Successfully withdrawn: $" + withdrawAmount);
            System.out.println("🔹 Updated Balance: $" + accountBalance);
        } else {
            System.out.println("❌ Insufficient balance! Unable to withdraw $" + withdrawAmount);
            System.out.println("🔹 Available Balance: $" + accountBalance);
        }
    }

    public void showBalance() {
        System.out.println("💰 Current Account Balance: $" + accountBalance);
    }

    public static void main(String[] args) {
        program8 myATM = new program8();
        Scanner scanner = new Scanner(System.in);

        System.out.println("🏦 Welcome to the Simple ATM Machine 🏦");

        while (true) {
            System.out.println("\n---------------------------------");
            System.out.println("Please choose an option:");
            System.out.println("1️⃣  Deposit Money");
            System.out.println("2️⃣  Withdraw Money");
            System.out.println("3️⃣  Check Balance");
            System.out.println("4️⃣  Exit");
            System.out.println("---------------------------------");
            System.out.print("Enter your choice: ");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    myATM.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    myATM.withdraw(withdrawAmount);
                    break;
                case 3:
                    myATM.showBalance();
                    break;
                case 4:
                    System.out.println("👋 Thank you for using the ATM. Have a great day!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("⚠️ Invalid choice! Please select 1, 2, 3, or 4.");
            }
        }
    }
}
