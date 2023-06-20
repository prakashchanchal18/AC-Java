// Write a function that takes in age as input and returns if that person is eligible to vote or not.
// A person of age > 18 is eligible to vote.

import java.util.Scanner;
public class Exercise1_Q5 {
    public static void voting(int age) {
        if(age >= 18) {
            System.out.println("Person is eligible to vote");
        }
        else {
            System.out.println("person is not eligible to vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        voting(age);
    }
}
