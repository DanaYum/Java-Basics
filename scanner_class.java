import java.util.Scanner;

public class scanner_class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter the marks of three subjects: ");
        float marks1 = scanner.nextFloat();
        float marks2 = scanner.nextFloat();
        float marks3 = scanner.nextFloat();

        float total = marks1 + marks2 + marks3;
        float percentage = total / 3;

        System.out.println("Student name: " + name + " got " + total + "and  Percentage: " + percentage);
        
        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
