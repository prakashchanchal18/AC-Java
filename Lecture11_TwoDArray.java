//

import java.sql.SQLOutput;
import java.util.Scanner;
public class Lecture11_TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] Two_D_Array = new int[rows][columns];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                Two_D_Array[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.print(Two_D_Array[i][j] + " ");;
            }
            System.out.println();
        }
    }
}
