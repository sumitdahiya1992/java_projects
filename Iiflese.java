//conditional statement "if-else"
import java.util.Scanner;

public class Iiflese {
    public static void main(String[] args) {
        // create a scanner object to read the input from the user.
        Scanner scanner = new Scanner(System.in);

        //Promt the user to Enter the age
        System.out.print("Enter the age: ");
        int age = scanner.nextInt();
        
        //if-else statement
        if (age > 18) {
            System.out.println("He is a an Adult");
        } else {
            System.out.println("He is not an Adult");
        }
        //close the scanner
        scanner.close();
    }    
}
