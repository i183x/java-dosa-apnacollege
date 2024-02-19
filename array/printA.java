public class printA {
    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ ", ");
        }
    }
    public static void main(String[] args) {
        int[] x = {1,2,3};
        printArray(x);
    }
}
