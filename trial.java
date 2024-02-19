public class trial {

    // ye code sahi h
    public static void maxSubarraySum(int array[]){
        int max = Integer.MIN_VALUE;

        for (int i=0; i<array.length; i++){
            if(array[i]>max){
                max = array[i];
            }
        }

        System.out.println("Maximum sum of the subarray is "+max);
    }
    // isme last element chut rha h
    public static int[] sumOfSubarray(int number[]){
        int noOfSubarray = (number.length * (number.length+1))/2;
        int sum[] = new int[noOfSubarray];
        int countOfSubarray = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i+1; j < number.length; j++) {
                System.out.println("List of elemets of subarray: ");
                for (int k = i; k <= j; k++) {
                    sum[countOfSubarray] += number[k];
                    //idhar yha issue h koi
                    System.out.println(number[k]);
                }
                System.out.println();
                countOfSubarray++;
            }
        }

        System.out.println("Sum subarray:");
        for (int i = 0; i < noOfSubarray; i++) {
            System.out.println(sum[i]+ " ");
        }

        return sum;
    }
    
    public static void main(String[] args) {
        int numbers [] = {2, 4, 6, 10, 12};
        maxSubarraySum(sumOfSubarray(numbers));
    }
}
