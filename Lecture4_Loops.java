public class Lecture4_Loops {
    public static void main(String[] args) {

        // For Loop
        // for(initialization; condition; update) {
        //      body of-loop
        // }
        for(int i = 0; i < 3; i++) {
            System.out.println("Hello World");
        }
        for(int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // While Loop
        // while(condition) {
        //      body of the loop
        // }
        int i = 1;
        while(i <= 10) {
            System.out.print(i + " ");
            i++; // i = i + 1;
        }
        System.out.println();

        // Do While Loop
        // do {
        //   body of loop;
        // }
        //  while (condition);
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while(j <= 10);
    }
}
