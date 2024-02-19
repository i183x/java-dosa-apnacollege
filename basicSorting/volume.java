import java.util.Scanner;

public class volume {

    public static double findVolume(double l, double w){
        double a = 12.0;
        double b = - 4.0 * (l + w);
        double c = l * w;
        double x = (-b - Math.sqrt( b*b - 4.0*a*c )) / (2.0*a) ;    //height or 'x'
        double volume = x * (l-2.0*x) * (w-2.0*x);
        return volume;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-->0) {
            String[] input = sc.nextLine().split(" ");
            
            double L = Double.parseDouble(input[0]);
            double W = Double.parseDouble(input[1]);

            System.out.println(String.format("%.9f", findVolume(L, W)));
        
        }
        sc.close();
    }
}
