// Print a number pyramid.
//      1
//     2 2
//    3 3 3
//   4 4 4 4
//  5 5 5 5 5
public class Lecture5_Assignment2 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 9; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
