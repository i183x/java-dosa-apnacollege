package function;

import java.util.Scanner;

public class evenOrNot {

    public static boolean isEven(int x){
        if(x%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = sc.nextInt();
        if(isEven(x)){
            System.out.println("The number is even.");
        } else{
            System.out.println("The number is odd.");
        }

        sc.close();
    }
}
