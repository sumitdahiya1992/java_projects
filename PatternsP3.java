//read the patterns
/*
 * 
 **
 ***
 **** 
 */

public class PatternsP3 {
    public static void main(String[] args) {
        int n = 4;
        for ( int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");               
            }
            System.out.println();
        }
    }    
}
