// Make a function to multiply two number and return the product.
import java.util.Scanner;
public class Lecture7_ProductOfTwoNumber {
    public static int productOfTwoNumber(int a, int b) {
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Product of two numbers is : " + productOfTwoNumber(a, b));
    }
}
