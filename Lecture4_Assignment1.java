// Print all even numbers till n.
import java.util.*;
public class Lecture4_Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
