// Print a solid rhombus.
//      *****
//     *****
//    *****
//   *****
//  *****
public class Lecture5_Assignment1 {
    public static void main(String[] args) {
        int n = 5;
        int m = 9;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(j < n+1-i) {
                    System.out.print(" ");
                }
                else if(j > m+1-i) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
