package function;

import java.util.Scanner;

public class palindrome {

    public static boolean isPalindrome(String x){
        boolean value = false;
        for (int i=0; i<x.length()/2; i++){
            if(x.charAt(i)!=x.charAt(x.length()-i)){
                value = false;
                break;
            }
        }
        value = true;
        return value;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        isPalindrome(x);
        sc.close();
    }
}

// 123454321

// 9

// 0 9
// 1 8