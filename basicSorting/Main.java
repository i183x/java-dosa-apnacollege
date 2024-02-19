public class Main {
    public static void main(String[] args) {
        int n = 4; // You can change the value of n for different configurations

        int[][] twoDArray = new int[n][];

        for (int i = 0; i < n; i++) {
            twoDArray[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                twoDArray[i][j] = j + 1;
            }
        }

        // Accessing elements and printing the array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
