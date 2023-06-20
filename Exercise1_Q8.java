// Two numbers are entered by the user, x and n.
// Write a function to find the value of one number raised to the power of another i.e. x^n.

import java.util.Scanner;
public class Exercise1_Q8 {
    public static void power(int n, int x) {
        System.out.println("Value of one number raised to the power of another is : " + Math.pow(x,n));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        power(x, n);
    }
}
