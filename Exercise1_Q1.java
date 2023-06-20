// Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;
public class Exercise1_Q1 {
    public static void average(float num1, float num2,float num3) {
        System.out.println((num1+num2+num3)/3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextInt();
        float num2 = sc.nextInt();
        float num3 = sc.nextInt();
        average(num1, num2, num3);
    }
}
