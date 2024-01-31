package function;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit: ");
        String x  = sc.nextLine();
        int sum = 0;
        for (int i=0; i<x.length(); i++){
            sum = sum + x.charAt(i) - 48;
            // System.out.println(x.charAt(i));
            // sum = x.charAt(i);
            // System.out.println(sum);
        }
        System.out.println(sum);
        sc.close();
    }
}
