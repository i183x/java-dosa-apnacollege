public class KadaneAlgorithm {

    public static int kadaneMaxSumSubarray(int numbers[]){
        int currSum=0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            currSum += numbers[i];
            if(currSum<0){
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);

        }
        boolean allNegative = true;
        if(maxSum==0){
            for (int i = 0; i < numbers.length; i++) {
               if(numbers[i]>0){
                allNegative = false;
                break;
               } 
            }
        }
        if(allNegative){
            maxSum = Integer.MIN_VALUE;
            for (int i = 0; i < numbers.length; i++) {
                maxSum = Math.max(maxSum, numbers[i]);
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int numbers[] = {-1,-2,-3,-4,-2,-3,4,-1,-2,1,5,-3};
        System.out.println("Final Max Sum: "+kadaneMaxSumSubarray(numbers));

    }
}
