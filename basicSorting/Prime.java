public class Prime {
    public static int isPrime(int n){
        int prime = 1;
        if(n==1){
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i == 0) {
                prime = 0;
                break;
            } else{
                prime = 1;
            }
        }
        return prime;
    }
    public static void main(String[] args) {

        int n = 3;
        System.out.println(isPrime(n));
    }
}
