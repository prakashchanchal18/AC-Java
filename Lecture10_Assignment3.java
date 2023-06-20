// Take an array of numbers as input and check if it is an array sorted in ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
// {3, 4, 6, 2} is not sorted in ascending order.

import java.util.Scanner;
public class Lecture10_Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] numbers = new int[size];

        for(int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i+1] >= numbers[i]) {
                System.out.println("array is sorted in ascending order.");
            }
            else {
                System.out.println("array is not sorted in ascending order.");
            }
        }
    }
}
