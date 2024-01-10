import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers seperated by space: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float avg = (float)(a+b+c)/3;
        System.out.println("The average of " + a + ", " + b + " and " + c + " is " + avg + ".");
    }
}
