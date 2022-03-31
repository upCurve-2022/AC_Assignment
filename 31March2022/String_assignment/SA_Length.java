package String_Assignment;
import java.util.*;
public class SA_Length {
    public static void main(String[] args) {
        String str;
        int j = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = sc.nextLine();
        char c[] = str.toCharArray();
        for(char i: c){
            j++;
        }
        System.out.print("Length of string: "+j);
    }
}
