package String_Assignment;
import java.util.*;
public class SA_compare {
    public static void main(String[] args) {
        String s1, s2, s3="";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        s1 = sc.nextLine();
        s3 = s1;
        System.out.print("Enter the string: ");
        s2 = sc.nextLine();
        System.out.println("(1)Two strings are equal: "+s1.equals(s2));
        if(s1 == s3){
            System.out.println("(2)Two strings are equal.");
        }
        System.out.println("(3)Two strings are equal: "+s1.compareTo(s2));
    }
}
