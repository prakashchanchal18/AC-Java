import java.util.*;
public class Lecture3_Greater_Less_Equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1 > num2)
            System.out.println(num1 + " is greater.");
        else if(num2 > num1)
            System.out.println(num2 + " is greater.");
        else
            System.out.println(num1 + " is equal to " + num2);
    }
}
