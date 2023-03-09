import java.util.Scanner;

// Enter 3 numbers from the user & make a function to print their average.

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        calculateAverage(a, b, c);
    }

    public static void calculateAverage(int a, int b, int c){
        System.out.println("Average = " + (a + b + c)/3);
    }
}
