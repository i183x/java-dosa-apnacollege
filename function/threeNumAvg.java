package function;

import java.util.Scanner;

public class threeNumAvg {

    public static float avg(int a,int b,int c){
        float Average = (float) (a+b+c)/3;
        return Average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers seperated by space: ");
        int x=sc.nextInt(), y=sc.nextInt(), z=sc.nextInt();
        System.out.println("Average is " + avg(x, y, z));

        sc.close();
    }
}
