public class questions {
    
    public static int countSeven(int[][] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j]==7) {
                 count++;   
                }
            }
        }
        return count;
    }

    public static int sumOfSecondRow(int[][] array){
        int sum = 0;
        for (int i = 0; i < array[1].length; i++) {
            sum += array[1][i];
        }
        return sum;
    }

    public static int[][] makeTranspose(int[][] matrix){
        int[][] transposeMatrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        return transposeMatrix;
    }

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] array= {
            {4,7,8},
            {8,8,7},
            {1,4,9},
            {5,4,3},
            {2,2,3}
        };

        // System.out.println("No. of seven in given array is: " + countSeven(array));
        // System.out.println("Sum of second row is: " + sumOfSecondRow(array));
        System.out.println("Original Matrix: ");
        printMatrix(array);
        System.out.println("Transpose of matrix: ");
        printMatrix(makeTranspose(array));
    }
}