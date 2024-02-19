

public class largestNumber {

    public static int findLargestNumber(int numbers[]){
        int largestNumber = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>largestNumber){
                largestNumber = numbers[i];
            }
        }
        return largestNumber;
    }
    public static void main(String[] args) {
        int numbers [] = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println("Largest number is " + findLargestNumber(numbers));
    }
}
