package String_Assignment;
import java.util.*;
public class SA_ContainsDigits {
    public static void main(String[] args) {
        String st;
        int flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        st = sc.nextLine();
        int len = st.length();
        for(int i=0; i<len; i++){
            if(Character.isDigit(st.charAt(i))){
                flag++;
            }
            else
                flag = 0;
        }
        if(flag == len)
            System.out.println("String with only digits");
        else
            System.out.println("String is not comprising of only digits");
    }
}
