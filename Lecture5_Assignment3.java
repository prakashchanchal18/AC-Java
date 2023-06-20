// Print a palindromic number pyramid.
//          1
//        2 1 2
//      3 2 1 2 3
//    4 3 2 1 2 3 4
//  5 4 3 2 1 2 3 4 5
public class Lecture5_Assignment3 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 9; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
