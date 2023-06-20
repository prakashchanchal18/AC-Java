// Print Solid Rectangle
//  *****
//  *****
//  *****
//  *****

public class Lecture5_Pattern1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 4; i++) {
            System.out.println("*****");
        }

        System.out.println();

        //Nested Loop
        //outer loop
        for(int i = 1; i <= 4; i++) {
            //inner loop
            for(int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
