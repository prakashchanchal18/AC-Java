//Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows :
//  1 : + (Addition) a + b
//  2 : - (Subtraction) a - b
//  3 : * (Multiplication) a * b
//  4 : / (Division) a/b
//  5 : % (Modulo or remainder) a%b
//Calculate the result according to the operation given and display it to the user.
import java.util.*;
public class Lecture3_Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operation = sc.next().charAt(0);

        switch(operation) {
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : if(b == 0) {
                            System.out.println("Invalid Division!");
                        }
                        else
                            System.out.println(a/b);
            break;
            case '%' : if(b == 0) {
                            System.out.println("Invalid Division!");
                        }
                        else
                            System.out.println(a%b);
            break;
            default :  System.out.println("Invalid Input!");
        }
    }
}
