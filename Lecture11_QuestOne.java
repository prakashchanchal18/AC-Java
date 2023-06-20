// Take a matrix as input from user.
// Search for a given number x and print the indices at which it is present

import java.util.Scanner;
public class Lecture11_QuestOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] search = new int[row][col];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                search[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the element to search : ");
        int element = sc.nextInt();

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(search[i][j] == element) {
                    System.out.println("Element lies at location : " + "(" + (i+1) + "," + (j+1) + ")");
                }
            }
        }
    }
}
