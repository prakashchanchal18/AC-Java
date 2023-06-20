// Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
import java.util.Scanner;
public class Exercise1_Q9 {
    public static void greatestCommonDivisor(int num1, int num2) {
        int num = Math.min(num1, num2);
        for(int i = num; num >= 1; num--) {
            if(num1 % num == 0 && num2 % num == 0) {
                System.out.println("Greatest Common Divisor of " + num1 + " and " + num2 + " is : " + num);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        greatestCommonDivisor(num1, num2);
    }
}
