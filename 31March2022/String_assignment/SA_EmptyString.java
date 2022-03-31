package String_Assignment;

import java.util.Scanner;

public class SA_EmptyString {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        if(str == null || str.isEmpty())
            System.out.print("String is empty");
        else
            System.out.print("String is not empty");
    }
}
