// Take an array of names as input from the user and print them on the screen.

import java.util.Scanner;
public class Lecture10_Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input size of array
        int size = sc.nextInt();

        //Taking name as input in array
        String[] name = new String[size];
        for(int i = 0; i < size; i++) {
            name[i] = sc.next();
        }

        //Displaying output
        for(int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }
}
