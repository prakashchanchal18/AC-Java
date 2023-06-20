// Print the table of a number input by user.
import java.util.*;
public class Lecture4_Print_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
