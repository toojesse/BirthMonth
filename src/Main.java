import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner in = new Scanner(System.in);

        // Define variables
        int birthMonth = 0;
        String trash = "";

        // Prompt user for birth month
        System.out.print("Enter your birth month (1 - 12): ");

        // Validate input for integer
        if (in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine(); // Clear the buffer

            // Check if month is in valid range
            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("Your birth month is: " + birthMonth);
            } else {
                System.out.println("You entered an incorrect month value: " + birthMonth);
            }
        } else {
            trash = in.nextLine();
            System.out.println("\nYou entered an invalid input: " + trash);
            System.out.println("Run the program again and enter an integer between 1 and 12!");
        }
    }
}