package function;

import java.util.Scanner;

public class primeInRange {

    public static void primeInRange(int n){
        for(int i=2; i<=n; i++){
            if(prime.checkPrime(i)){
                System.out.print(i + " ");
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = sc.nextInt();
        System.out.println("Primes in the range are: ");
        primeInRange(n);

        sc.close();
    }
}
