// Write a program to enter the numbers till the user wants and at the end it should display the count of
// positive, negative and zeros entered.
import java.sql.SQLOutput;
import java.util.Scanner;
public class Exercise1_Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zero = 0;
        int positive = 0;
        int negative = 0;
        char ch;
        do {
            int num = sc.nextInt();
            if(num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else  {
                zero++;
            }
            System.out.println("Do you want to Continue(y/n)?");
            ch = sc.next().charAt(0);
        } while(ch == 'y' || ch == 'Y');

        System.out.println("Count of positive : " + positive);
        System.out.println("Count of zeros    : " + zero);
        System.out.println("Count of negative : " + negative);
    }
}
