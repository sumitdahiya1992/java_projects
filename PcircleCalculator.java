//Make a program that takes the radius of a circle as input
//calculates its radius and area and prints its as output to the user

import java.util.Scanner;

public class PcircleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Promt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        //Calculate the circumference and area
        double Circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        //Print the result
        System.out.printf("Circumference of the circle: %.2f%n", Circumference);
        System.out.printf("Area of the circule: %.2f%n", area);

        //Close the scanner
        scanner.close();        
    }    
}
