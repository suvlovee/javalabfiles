
import java.util.Scanner;

// Step 1:
// Create a custom exception class.
// It inherits from Exception, making it a checked exception.
class LowBalanceException extends Exception {

    // Constructor that accepts an error message.
    // The message is passed to the parent Exception class.
    public LowBalanceException(String message) {
        super(message);
    }
}

public class CustomException {

    public static void main(String[] args) {

        // Step 2:
        // Create Scanner object to take input from keyboard.
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter mobile balance.
        System.out.print("Enter your mobile balance: ");

        // Read balance entered by user.
        double balance = scanner.nextDouble();

        try {

            // Step 3:
            // Call method that checks whether balance is sufficient.
            // If balance is below 5, an exception will be thrown.
            checkBalance(balance);

            // This line executes only if no exception occurs.
            System.out.println("Balance is sufficient. You can make a call.");

        } catch (LowBalanceException e) {

            // Step 4:
            // Catch the custom exception and display its message.
            System.out.println("Warning: " + e.getMessage());
        }

        // Close scanner to free system resources.
        scanner.close();
    }

    // Step 5:
    // Method that validates mobile balance.
    // 'throws LowBalanceException' tells Java that this method
    // may throw this custom exception.
    public static void checkBalance(double balance)
            throws LowBalanceException {

        // Check whether balance is less than Rs. 5.
        if (balance < 5) {

            // Step 6:
            // Create and throw a custom exception object.
            throw new LowBalanceException(
                    "Mobile balance is less than Rs. 5. Please recharge.");
        }

        // If balance is >= 5, no exception is thrown.
        // Control returns to the calling method.
    }
}