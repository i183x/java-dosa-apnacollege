import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Chose your operator from (+,-,*,/,%): ");
        char operator = sc.next().charAt(0);

        System.out.println("The result is: ");
        switch (operator) {
            case '+':
                System.out.println(num1+num2);
                break;

            case '-':
                System.out.println(num1-num2);
                break;
            
            case '/':
                System.out.println(num1/num2);
                break;

            case '*':
                System.out.println(num1*num2);
                break;

            case '%':
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Invalid Operator.");
                break;
        }

    }
}
