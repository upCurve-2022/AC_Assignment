import java.util.Scanner;

public class AL1_WholeNum_FracNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        float num  = sc.nextFloat();
        int whole = (int)num;
        float decimal = whole - num;
        System.out.println("Integer part: "+whole+"\nFractional part: "+(float)decimal);

    }
}
