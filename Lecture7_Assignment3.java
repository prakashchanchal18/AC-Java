// Make a function to print the table of a given number n.
import java.util.Scanner;
public class Lecture7_Assignment3 {
    public static void table(int n) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        table(n);
    }
}
