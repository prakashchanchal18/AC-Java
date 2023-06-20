//  Print the spiral order matrix as output for a given matrix of numbers. [Difficult for Beginners]

import java.util.Scanner;
public class Lecture11_Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] spiralOrder = new int[row][col];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                spiralOrder[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(spiralOrder[i][j] + " ");
            }
        }
    }
}
