// Print if a number is prime or not (Input n from the user).
import java.util.*;
public class Lecture4_Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                count++;
            }
        }
        if(count == 2) {
            System.out.println(num + " is a Prime Number.");
        }
        else {
            System.out.println(num + " is not a Prime Number.");
        }
    }
}
