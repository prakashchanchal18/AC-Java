// Make a function to check if a given number n is even or not.

import java.util.Scanner;
public class Lecture7_Assignment2 {
    public static void evenOrOdd(int num) {
        if(num%2 == 0) {
            System.out.println(num + " is even.");
        }
        else {
            System.out.println(num + " is odd.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        evenOrOdd(num);
    }
}
