//Print the sum of first n natural numbers

import java.util.*;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;
        for ( int i = 0; i <=n; i = i + 1) {
            sum = sum + i;
        }
        System.out.print(sum);    
    }
}