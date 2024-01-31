// leap year or not

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Yes, it is a leap year.");
        } else{
            System.out.println("No, it is not a leap year.");
        }
        sc.close();
    }
}
