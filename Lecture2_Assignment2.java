//Make a program that takes the radius of a circle as input,
// calculates its radius and area and prints it as output to the user
import java.util.Scanner;
public class Lecture2_Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double area = 3.14 * radius * radius;
        double perimeter = 2 * 3.14 * radius;
        System.out.println(area);
        System.out.println(perimeter);
    }
}
