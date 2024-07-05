//factorial of a number
//Write a program to find the factorial of a given number

public class LoopsP4 {
    public static void main(String[] args) {
        int num = 4; // Example of a number
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("factorial:" + factorial);
    }
}