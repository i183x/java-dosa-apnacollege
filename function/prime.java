package function;

import java.util.Scanner;


public class prime {

    public static boolean checkPrime(int n){
        boolean x = true;
        if (n == 2){
            return x;
        }
        for (int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                x = false;
                break;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(checkPrime(n));

        sc.close();
    }
}
