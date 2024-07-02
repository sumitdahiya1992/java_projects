//Student Marks Tracker

import java.util.Scanner;

public class Studentmarkstracker {
    public static void main(String[] args) {
        // create a scanner object to enter the input
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enter 1 to Student marks, 0 to stop the program: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Enter student's marks out of 100");
                int marks = scanner.nextInt();

                if (marks >= 90) {
                    System.out.println("This is excillent");
                } else if ( marks >= 70 && marks <= 90) {
                    System.out.println("This is good");
                } else if ( marks >= 50 && marks <= 70) {
                    System.out.println("This is fine");
                } else if ( marks >= 33 && marks <= 50) {
                    System.out.println("This is horriable...how did you pass?");
                } else {
                    System.out.println("Keep trying next time");
                }
            } else if ( choice != 0 ) {
                System.out.println("Invalid input Please Enter 1 or 0 ");
            }   
        } while (choice != 0);
        System.out.println("Program stopped");
        //close the scanner
        scanner.close();   
    }
}