import java.util.Scanner;

// Write a function that takes in the radius as input and returns the circumference of a circle.

public class CircumferenceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of Circle");
        double r = sc.nextDouble();
        sc.close();

        double circumference = getCircumference(r);
        System.out.println("Circumference of circle = " + circumference);
    }

    public static double getCircumference(double r) {
        return 2*Math.PI*r;
    }
}
