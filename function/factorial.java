package function;

public class factorial {
    public static double factorial(int n){
        double fact = 1;
        if (n>0){
            for(int i=1; i<=n; i++){
                fact = i*fact;
            }
        }
        return fact;
    }

    public static void main(String[] args) {
        int num = 5;
        double mu = factorial(num);
        System.out.println("Factorial is : " + mu);
    }
}
