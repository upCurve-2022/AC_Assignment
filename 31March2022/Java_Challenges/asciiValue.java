package Java_Challenges;
import java.util.*;
public class asciiValue {
    public static void main(String[] args) {
        char c;
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a character: ");
        c = sc.next().charAt(0);
        System.out.print("ASCII value of "+c+" is "+(int)c);
    }
}
