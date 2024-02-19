public class pairInArray {

    public static void findPairArray(int number[]){
        for (int i = 0; i < number.length; i++) {
            for (int j = i+1; j < number.length; j++) {
                System.out.print("("+number[i]+","+number[j]+") ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int numbers [] = {2, 4, 6, 10, 12};
        findPairArray(numbers);
    }
}
