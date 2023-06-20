//
import java.util.Scanner;
public class Lecture12_String {
    public static void main(String[] args) {
        String name = "Prakash";
        String fullName = "Prakash Kumar";
        String sentence = "My name is Prakash.";

        Scanner sc = new Scanner(System.in);
        String name2 = sc.nextLine();
        System.out.println(name2);

        String name1 = sc.next();
        System.out.println(name1);

        //concatenation
        String firstName = "Prakash";
        String lastName = "Kumar";
        String fullName1 = firstName + " " + lastName;
        System.out.println(fullName1);
        System.out.println(fullName1.length());

        //charAt();
        for(int i = 0; i < fullName1.length(); i++) {
            System.out.print(fullName1.charAt(i));
        }

        //compare String
        // String1 > String2 :-> Return a +ve value
        // String1 == String2 :-> Return a 0 value
        // String1 < String2 :-> Return a -ve value
        String nameA = "Prakash";
        String nameB = "Prakash";

        if(nameA.compareTo(nameB) == 0) {
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }
    }
}
