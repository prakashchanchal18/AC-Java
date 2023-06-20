import java.util.Scanner;

public class Lecture7_Factorial {
    public static int factorial(int num) {
        int fact = 1;
        for(int i = num; i >= 1; i--) {
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num < 0) {
            System.out.println("Invalid Input!");
        }
        else if(num == 0) {
            System.out.println("Factorial of " + num + " is : " + 1);
        }
        else {
            System.out.println("Factorial of " + num + " is : " + factorial(num));
        }
    }
}
