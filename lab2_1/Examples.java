
import java.util.Scanner;

//To show example of loopoing statements ,
//conditional statements and jumping statements

public class Examples{
    public static void main(String[] args) {
        // Looping statement example: for loop
        System.out.println("For loop example:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }
        // conditional statement example:simple if statement
        int num = 10;
        System.out.println("\nSimple if statement example:");
        if (num > 0) {
            System.out.println(num + " is a positive number.");
        }   
        // Conditional statement example: if-elseif statement to find grade based on grading system
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter your marks (0-100): ");
        int marks = scanner.nextInt();
        System.out.println("\nIf-elseif ladder example");
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 85) {
            System.out.println("Grade: A-");
        } else if(marks >= 80) {
            System.out.println("Grade: B+");
        }else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: B-");
        } else if (marks >= 65) {
            System.out.println("Grade: C+");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 55) {
             System.out.println("Grade: C-");
        } else if (marks >= 50) {
             System.out.println("Grade: D+");
        } else if (marks >= 45) {
             System.out.println("Grade: D");
        } else{
            System.out.println("Grade: F");
        }
    


        // Jumping statement example: break
        System.out.println("\nBreak statement example:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            System.out.println("i: " + i);
        }

        // Jumping statement example: continue
        System.out.println("\nContinue statement example:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println("i: " + i);
        }
    }
}