import java.util.Scanner;

// Write a function which takes in 2 numbers and returns the greater of those two.

public class GreaterNumberFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to compare");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int max = getMax(a, b);
        System.out.println("Greater number = " + max);
    }

    public static int getMax(int a, int b) {
        return a > b ? a : b;
    }
}
