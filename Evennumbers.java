//print all even numbers till n


import java.util.Scanner;

public class Evennumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        System.out.println("Enter even numbers upto " + n + ";");
        for (int i = 2; i <= n; i+= 2) {
            System.out.println(i);
        }
    }
}
