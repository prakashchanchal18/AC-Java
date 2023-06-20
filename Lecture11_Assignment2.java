// For a given matrix of N x M, print its transpose.

import java.util.Scanner;
public class Lecture11_Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] transpose = new int[row][col];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                transpose[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(transpose[j][i] + " ");
            }
            System.out.println();
        }
    }
}
