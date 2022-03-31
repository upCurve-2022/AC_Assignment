package Java_Challenges;

import java.util.*;

public class CylinderVol {
    public static void main(String[] args) {
        /*V = pi*r^2*h*/
        int r, h;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        r = sc.nextInt();
        System.out.print("Enter height: ");
        h = sc.nextInt();
        double pie=3.14285714286;
        double volume = pie*r*r*h;
        System.out.println("Volume of cylinder is "+volume);
    }
}
