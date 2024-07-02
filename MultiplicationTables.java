//Make a program that prints the table of a number that is input by the user

import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        // create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        //Promt the user to Enter a number
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();

        // Print the multiplication table
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", number, i, number * i);
        }

        // close the scanner
        scanner.close();
    }    
}
