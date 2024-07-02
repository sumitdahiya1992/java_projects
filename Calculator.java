// Make a Calculator. Take 2 numbers from the user and an operation as follows
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        //take first input the user 
        System.out.print("Enter the number a: ");
        int a = scanner.nextInt();

        // take the second input from the user
        System.out.print("Enter the number b: ");
        int b = scanner.nextInt();

        //perform the following operation
        System.out.println("");
        System.out.println("Select the following Numbers");
        System.out.println("");
        System.out.println("1 = addition");
        System.out.println("2 = Substration");
        System.out.println("3 = Multiplication");
        System.out.println("4 = Division");
        System.out.println("5 = Remainder");
        System.out.println("");

        //Enter the choice
        int choice = scanner.nextInt();


        //Enter the formulas
        int addition = a + b;
        int substraction = a - b;
        int multiplication = a * b;
        int division = 0;
        int remainder = 0;

        //perform division and remainder carefully
        if (b != 0) {
            division = a / b;
            remainder = a % b;
        }

        // use switch to perform the operation from the user choice  
        switch(choice) {
            case 1 :
            System.out.print("Addition: " + addition + "\n");
            break;
            case 2 :
            System.out.print("Substration: " + substraction + "\n");
            break;
            case 3 :
            System.out.print("Multilication: " + multiplication + "\n");
            break;
            case 4 :
            if ( b != 0) {
                System.out.print("Division: " + division + "\n");
            } else {
                System.out.println("Division by zero is not allowed");
            }
            break; 
            case 5 :
            if ( b != 0) {
                System.out.print("remainder: " + remainder + "\n");
            } else {
                System.out.println("Remainder by zero is not allowed");
            }
            break;
        }       
        //Close the scanner
        scanner.close();    
    }    
}
