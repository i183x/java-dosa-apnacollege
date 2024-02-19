class baseFile{

    public static void decreasingOrder(int n){
        
        if ( n == 1 ){
            System.out.print(n);
            return;
        }
        System.out.print( n + " ");
        decreasingOrder(n-1);

        // max limit is 10705, after that it gives Stack Overflow error for my system.
    }

    public static void increasingOrder(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        increasingOrder(n-1);
        System.out.print(n+" ");

    }

    public static int factorial(int n){
        if (n == 0) {
            return 1;
        }
        int factorial = n * factorial(n-1);
        return factorial;
    }

    public static int sumOfNNumber(int n){
        if (n==1) {
            return 1;
        }
        int sum = n + sumOfNNumber(n-1);
        return sum;
    }

    public static int fibonacciNumber(int n){
        if(n==0 || n==1){
            return n;
        }
        int number = fibonacciNumber(n-1)+fibonacciNumber(n-2);
        return number;
    }

    public static boolean isSorted(int[] arr, int i){
        if(i==arr.length-1){
            return true;
        }
        if (arr[i]>arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int firstOccurence(int[] arr, int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    public static int lastOccurence_Krishna(int[] arr, int key, int i){ //passing last index instead of zero for i
        if(i==-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lastOccurence_Krishna(arr, key, i-1);
    }

    public static int lastOccurence_byMaam(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccurence_byMaam(arr, key, i+1);
        if(isFound==-1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static int  pow(int x, int n){
        if(n==0){
            return 1;
        }
        return x*pow(x, n-1);

    }

    public static int optimisedPow(int x, int n){
        if(n==0){
            return 1;
        }
        int halfPower = optimisedPow(x, n/2);
        int halfPowerSq = halfPower*halfPower;
        if(n%2!=0){
            halfPowerSq*=x;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        // int number = 26;
        // decreasingOrder(number);
        // increasingOrder(number);
        // factorial(number); 
        // System.out.println(factorial(number));
        // System.out.println(sumOfNNumber(number));
        // System.out.println(fibonacciNumber(number));
        // System.out.println(isSorted(arr, 0));
        int[] arr = {1,5,4,5};
        // System.out.println(firstOccurence(arr, 5, 0));
        // System.out.println(lastOccurence_Krishna(arr, 5, arr.length-1));    //passing last index instead of zero for i
        System.out.println(lastOccurence_byMaam(arr, 5, 0));
        // System.out.println(pow(2, 11));
        // System.out.println(optimisedPow(2, 11));
        // System.out.println(optimisedPow(2, 10));
    }
    
}