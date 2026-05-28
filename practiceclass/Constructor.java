/* here to make this program we are using the assistance of 
copilot in program which i find is greately helping and time saving
i now do think ai makes our work 5x faster and more efficient
 and also it is a great learning tool for me as i am new to 
 programming and it is helping me to understand the concepts 
 better and also it is helping me to write better code and also
  it is helping me to learn new things and also it is helping 
  me to improve my coding skills and also it is helping me to 
  become a better programmer and also it is helping me to achieve 
  my goals and also it is helping me to become a successful
   programmer in future. */
import java.util.Scanner;

public class Constructor {
    long value;
    static String BRAND="BMW";
    String model;

    // default constructor
    public Constructor() {
        value = 100000;
        model = "Default constructor called";
    }

    // parameterized constructor
    public Constructor(long value, String model, String brand) {
        this.value = value;
        this.model = model;
        this.BRAND = brand;
    }

    void show() {
        System.out.println("value = " + value);
        System.out.println("model = " + model);
        System.out.println("brand = " + BRAND);
    }

    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        Scanner scanner = new Scanner(System.in);


        System.out.println("what do you want default car details or want to add it?");
        System.out.println("1. Default car details");
        System.out.println("2. Add custom car details");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character    
        if (choice == 1) {
            c1.show();
        } else if (choice == 2) {       
        System.out.println("Enter value:");
        long value = scanner.nextLong();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter model:");
        String model = scanner.nextLine();
        System.out.println("Enter brand:");
        String brand = scanner.nextLine();

        Constructor c2 = new Constructor(value, model, brand);
        c2.show();
        }else{
            System.out.println("Invalid choice. Please select 1 or 2.");
        }

        scanner.close();

    }
}