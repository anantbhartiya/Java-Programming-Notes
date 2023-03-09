import java.util.Scanner;

// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. 𝑥^n.

public class PowerCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x and n");
        int x = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        long res = getPower(x, n);
        System.out.println(res);
    }

    public static long getPower(int x, int n){
        if(n == 1)
            return x;
        else
            return x * getPower(x, n-1);
    }
}
