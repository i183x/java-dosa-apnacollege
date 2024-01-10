import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of side of square: ");
        float side = sc.nextFloat();
        float area = side*side;
        System.out.println("The area of the square with side " + side + " is " + area + ".");
    }    
}
