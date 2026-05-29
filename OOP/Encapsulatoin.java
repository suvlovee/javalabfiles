import java.util.Scanner;
/*Encapsulation in Java means wrapping data and the methods that work on that data inside one class, while controlling direct access to the data.

In simple words: an object keeps its internal data private, and other code must interact with it through public methods.

What a learner should know

Encapsulation is one of the main OOP principles in Java.

It is usually done by:

Making variables private
Providing public getter and setter methods
Adding validation inside setters
Hiding internal implementation details from outside code
Why it is useful:

Protects data from invalid changes
Gives better control over how values are read or updated
Makes code easier to maintain
Helps achieve data hiding
Keeps class details separate from the code that uses the class*/
class PersonData {
    private String name;
    private int age;
    private String address;
    private String phoneNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be greater than 0.");
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 10) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Phone number must contain 10 digits.");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

public class Encapsulatoin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PersonData person = new PersonData();

        System.out.print("How many specific data do you want to set for one person? ");
        int setChoices = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= setChoices; i++) {
            System.out.println("\nWhich data do you want to set? Choice " + i);
            System.out.println("1. Set name");
            System.out.println("2. Set age");
            System.out.println("3. Set address");
            System.out.println("4. Set phone number");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = input.nextLine();
                    person.setName(name);
                    break;

                case 2:
                    System.out.print("Enter age: ");
                    int age = input.nextInt();
                    input.nextLine();
                    person.setAge(age);
                    break;

                case 3:
                    System.out.print("Enter address: ");
                    String address = input.nextLine();
                    person.setAddress(address);
                    break;

                case 4:
                    System.out.print("Enter phone number: ");
                    String phoneNumber = input.nextLine();
                    person.setPhoneNumber(phoneNumber);
                    break;

                default:
                    System.out.println("Invalid set choice.");
            }
        }

        System.out.print("\nHow many specific data do you want to fetch? ");
        int fetchChoices = input.nextInt();

        for (int i = 1; i <= fetchChoices; i++) {
            System.out.println("\nWhich data do you want to fetch? Choice " + i);
            System.out.println("1. Fetch name");
            System.out.println("2. Fetch age");
            System.out.println("3. Fetch address");
            System.out.println("4. Fetch phone number");
            System.out.println("5. Fetch all details");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Name: " + person.getName());
                    break;

                case 2:
                    System.out.println("Age: " + person.getAge());
                    break;

                case 3:
                    System.out.println("Address: " + person.getAddress());
                    break;

                case 4:
                    System.out.println("Phone number: " + person.getPhoneNumber());
                    break;

                case 5:
                    System.out.println("Name: " + person.getName());
                    System.out.println("Age: " + person.getAge());
                    System.out.println("Address: " + person.getAddress());
                    System.out.println("Phone number: " + person.getPhoneNumber());
                    break;

                default:
                    System.out.println("Invalid fetch choice.");
            }
        }

        input.close();
    }
}