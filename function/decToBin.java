package function;

import java.util.Scanner;

public class decToBin {
    public static int convertDecToBin(int decNum){
        int pow=0, binNum = 0;
        while (decNum>0) {
            binNum +=(int) (decNum%2)*Math.pow(10, pow);
            decNum /=2;
            pow++;
        }
        return binNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int decNum = sc.nextInt();
        System.out.println("The binary number for " + decNum + " is " + convertDecToBin(decNum) + ".");
        sc.close();
    }
    
}
