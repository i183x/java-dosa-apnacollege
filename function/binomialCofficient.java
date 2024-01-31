package function;

import java.util.Scanner;

public class binomialCofficient {

    public static double binomial(int n, int r){
        double nF = factorial.factorial(n);
        double rF = factorial.factorial(r);
        double nMinusRF = factorial.factorial(n-r);

        return (nF/(rF*nMinusRF));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of r: ");
        int r = sc.nextInt();
        System.out.println("Binomial Coff is : " + binomial(n, r));
        
        sc.close();
    }
}
