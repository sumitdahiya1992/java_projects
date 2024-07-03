//print the table of a number input by the user

import java.util.*;

public class Loops1 {
    public static void main(String[] args) {
        //create scanner object to take input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for ( int i = 1; i < 11; i++) {
            System.out.println(i*n);
        }        
    }
}

