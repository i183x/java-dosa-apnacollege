import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome dear customer!!");

        System.out.print("Enter the cost of pen: ");
        float pen = sc.nextFloat();
        
        System.out.print("Enter the cost of pencil: ");
        float pencil = sc.nextFloat();
        
        System.out.print("Enter the cost of ereaser: ");
        float ereaser = sc.nextFloat();

        // bill
        float cost = pen + pencil + ereaser;
        // gst
        float gst =(float) (cost * 0.18);
        float totalCost = cost+gst;
        System.out.println("Your bill:");
        System.out.println("Total Cost of the products your purchased: " + cost);
        System.out.println("Gst: " + gst);
        System.out.println("Total Bill: " + totalCost);

        int $ = 4;
    }    
}
