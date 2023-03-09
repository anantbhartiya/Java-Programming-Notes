import java.util.Scanner;

// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

public class NumberCounter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of numbers to be entered");
        int n = sc.nextInt();
        int positive = 0, negative = 0, zeros = 0;
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            if(num == 0)
                zeros++;
            else if(num > 0)
                positive++;
            else
                negative++;
        }
        sc.close();
        System.out.println("Zeros = " + zeros + "\nPositives = " + positive + "\nNegatives = " + negative);
    }
}
