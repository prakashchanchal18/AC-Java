//Print Inverted Half Pyramid
//  ****
//  ***
//  **
//  *
public class Lecture5_Pattern4 {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n+1-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=n; i>=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
