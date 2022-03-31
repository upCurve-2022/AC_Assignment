package String_Assignment;
import java.util.*;
public class SA_RemoveAllOccurencesInString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        System.out.print("Enter a string: ");
        String str= sc.nextLine(); //reads string.
        System.out.print("Enter number of character to be removed: ");
        int T = Integer.parseInt(sc.nextLine());
        while(T>0)
        {
            System.out.print("Enter character to be removed: ");
            String remove = sc.nextLine();
            str = str.replace(remove, "");
            System.out.println(str);
            T--;
        }
    }
}
