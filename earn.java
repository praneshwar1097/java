import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        int earnings = 0;
        int patientCount = 0;
        int maxPatients = 20;

       
        int[] ages = new int[maxPatients];

        System.out.println("Enter age values (press Enter without a value to stop):");

       
        while (patientCount < maxPatients) {
            try {
                String input = scanner.nextLine();

               
                if (input.isEmpty()) {
                    break;
                }

               
                int age = Integer.parseInt(input);

               
                if (age <= 0 || age > 120) {
                    System.out.println("Invalid age. Age must be between 1 and 120.");
                    continue;
                }

               
                ages[patientCount] = age;

               
                if (age < 17) {
                    earnings += 200;
                } else if (age >= 17 && age <= 40) {
                    earnings += 400;
                } else {
                    earnings += 300;
                }

               
                patientCount++;

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for age.");
            }
       

    }
        System.out.println("Total earnings for the day: " + earnings + " INR");

       
        scanner.close();
    }
}