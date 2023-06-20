// Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.Scanner;
public class Exercise1_Q4 {
    public static void circumference(float radius) {
        System.out.println("circumference of a circle is : " + 2*3.14*radius);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextInt();
        circumference(radius);
    }
}
