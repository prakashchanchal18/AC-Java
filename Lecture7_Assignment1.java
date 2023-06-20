// Make a function to check if a number is prime or not.

import java.util.Scanner;
public class Lecture7_Assignment1 {
    public static void primeOrNot(int num) {
        int count = 0;
        for(int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if(count == 2) {
            System.out.println(num + " is a Prime Number.");
        }
        else {
            System.out.println(num + " is not a Prime Number.");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num <= 1) {
            System.out.println("Invalid Input!");
        }
        else {
            primeOrNot(num);
        }
    }
}
