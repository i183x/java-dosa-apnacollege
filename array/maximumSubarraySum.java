// package array;

public class maximumSubarraySum {
    
    public static void maxSubarraySum(int array[]){
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i=0; i<array.length; i++){
            if(array[i]>=max){
                max = array[i];
            }
            if(array[i] <= min){
                min = array[i];
            }
        }
        System.out.println("Maximum sum of the subarray is "+max);
        System.out.println("Minimum sum of the subarray is "+min);

        // printA.printArray(array);
    }

    public static int[] sumOfSubarray(int number[]){
        int noOfSubarray = (number.length* (number.length+1))/2;
        int sum[] = new int[noOfSubarray];
        int countOfSubarray = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                for (int k = i; k <= j; k++) {
                    sum[countOfSubarray] += number[k];
                }
                countOfSubarray++;
            }
        }
        return sum;
    }


    
    public static void main(String[] args) {
        int numbers [] = {100, -200, 300, -400, 500, -600, 700, -800, 900};
        maxSubarraySum(sumOfSubarray(numbers));
    }
}
