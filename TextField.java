
import java.util.Scanner;

public class TextField {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter text
        System.out.print("Enter some text: ");
        
        // Read the text entered by the user
        String userInput = scanner.nextLine();
        
        // Display the text entered by the user
        System.out.println("You entered: " + userInput);
        
        // Close the Scanner object
        scanner.close();
    }
}
