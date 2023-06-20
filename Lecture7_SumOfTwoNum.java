//Make a function to add two number and return sum.
import java.util.*;
public class Lecture7_SumOfTwoNum {
    public static int sumTwoNum(int a, int b) {
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = sumTwoNum(a, b);
        System.out.println("Sum of two numbers is : " + result);
    }
}
