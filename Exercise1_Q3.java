// Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;
public class Exercise1_Q3 {
    public static void greaterOfTwo(int num1, int num2) {
        if(num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        }
        else if(num2 > num1) {
            System.out.println(num2 + " is greater than " + num1);
        }
        else {
            System.out.println(num1 + " equal to " + num2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        greaterOfTwo(num1, num2);
    }
}
