//  return-type function_name (parameter 1, parameter2, ...... parameter n) {
//          function_body
//  }
//  return-type;
// void --> No return type.

import java.util.Scanner;
public class Lecture7_Functions {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printMyName(name); //Calling the function
    }
}
