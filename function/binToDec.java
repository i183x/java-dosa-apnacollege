package function;

import java.util.Scanner;

public class binToDec {
    public static int binToDecNum(int binNum){
        int pow = 0, decNum = 0, lastDigit=0;

        while(binNum>0){
            lastDigit = binNum%10;
            decNum +=(int) lastDigit * Math.pow(2, pow);
            binNum /= 10;
            pow++;
        }
        return decNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        int binNum = sc.nextInt();

        System.out.println("The decimal number for " + binNum + " is " + binToDecNum(binNum) + ".");

        sc.close();
    }
}
