public class prefix {
    public static void prefixMaxSumSubarray(int array[]){
        int prefixArray[] = new int[array.length];
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        prefixArray[0] = array[0];
        for (int i = 1; i < prefixArray.length; i++) {
            prefixArray[i] = prefixArray[i-1] + array[i];
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                currSum = i == 0 ? prefixArray[0] : prefixArray[j] - prefixArray[i-1];

                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }

        System.out.println("Max using using prefix is "+maxSum);
    }
    public static void main(String[] args) {
        int numbers [] = {100, -200, 300, -400, 500, -600, 700, -800, 900};
        prefixMaxSumSubarray(numbers);
        
        System.out.println("Using bruteforce: ");
        maximumSubarraySum.maxSubarraySum(numbers);
    }
}
