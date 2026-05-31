//wap to handle runtime exception
//(ArithmeticException, ArrayIndexOutOfBoundsException)

import java.util.Scanner;
public class RuntimeExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers for division:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array elements");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();

        }

        System.out.println("Enter an index to access:");
        int index = scanner.nextInt();

        try {
            System.out.println("Element at index " + (index+1) + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds. Please enter a valid index.");
        }
    }
}
