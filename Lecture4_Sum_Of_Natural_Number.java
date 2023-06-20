// Print the sum of natural number.
import java.util.*;
public class Lecture4_Sum_Of_Natural_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println((num*(num+1)/2));

        int sum = 0;
        for(int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
