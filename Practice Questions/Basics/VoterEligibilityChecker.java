import java.util.Scanner;

/* 
Write a function that takes in age as input and 
returns if that person is eligible to vote or not. 
A person of age > 18 is eligible to vote.
*/

public class VoterEligibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        sc.close();

        String eligible = isEligible(age);
        System.out.println(eligible);
    }

    public static String isEligible(int age) {
        return age > 18 ? "You are eligible to vote" : "You are not eligible to vote";
    }
}
