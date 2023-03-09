import java.util.Scanner;

// Write a function to print the sum of all odd numbers from 1 to n.

public class OddNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int n = sc.nextInt();
        sc.close();

        printSum(n);
    }

    public static void printSum(int n) {
        int sum = 0;
        for(int i = 1; i < n; i+=2) {
            sum += i;
        }

        System.out.println("Sum of odd numbers till " + n + " = " + sum);
    }
}
