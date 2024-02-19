public class subarray {
    public static void printSubarray(int number[]){
        for (int i = 0; i < number.length; i++) {
            for (int j = i+1; j < number.length; j++) {
                for (int k = i; k < j; k++) {
                    System.out.print(number[k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers [] = {2, 4, 6, 10, 12};
        printSubarray(numbers);
    }
}
