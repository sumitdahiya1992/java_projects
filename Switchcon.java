// finding days

import java.util.Scanner;

//Conditional Statement 'switch'


public class Switchcon {
    public static void main(String[] args) {
        // create the scanner object to enter the input
        Scanner scanner = new Scanner(System.in);

        //  enter the days in number
        System.out.print("Enter the Days: ");
        int days = scanner.nextInt();

        switch (days) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;        
            case 4 :
                System.out.println("Thrusday");
                break;        
            case 5 :
                System.out.println("Friday");
                break;        
            case 6 :
                System.out.println("Saturday");
                break;        
            case 7 :
                System.out.println("Sunday");
                break;        
        }
        //close the scanner
        scanner.close();
    }    
}
