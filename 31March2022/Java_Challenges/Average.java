package Java_Challenges;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int arr[] = new int[10];
        double sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 elements of array: ");
        for(int i=0; i<10; i++)
            arr[i] = sc.nextInt();
        for(int i:arr){
            sum += i;
        }
        sum = sum/10;
        System.out.print("Average of the array elements: "+sum);
    }
}
