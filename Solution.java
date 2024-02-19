public class Solution {
    
    
    public static void generate(int numRows){
        int n = numRows;
        int[][] pascalTriangle = new int[numRows][];
        for (int i = 0; i < n; i++) {
            pascalTriangle[i] = new int[i+1];       //This line, I'm unable to understand it.
            for (int j = 0; j <= i; j++) {
                if(j==0 || j == i){
                    pascalTriangle[i][j] = 1;
                } else{
                    pascalTriangle[i][j] = pascalTriangle[i-1][j-1]+pascalTriangle[i-1][j];
                }
            }
        }
    }
    
    public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i-1] > nums[i]) {
                count++;
            }
        }
        
        if (nums[n-1]>nums[0]) {
            count++;
        }
        
        return count<=1;
    }
    
    public static int maxSubArray(int[] nums) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i]; 
            if(currSum<0){
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        if(maxSum==0){
            maxSum = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                maxSum = Math.max(maxSum, nums[i]);
            }
        }
        return maxSum;
    }
    
    public static void setZeroes(int[][] matrix) {
        int row[] = new int[matrix.length];
        int col[] = new int[matrix[0].length];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0){
                    row[i] = 1;                         
                    col[j] = 1;
                }
            }
        }
        
        // System.out.println("Rows: ");
        // printArray(row);
        // System.out.println();
        // System.out.println("Cols: ");
        // printArray(col);
        // System.out.println();
        
        for (int i = 0; i < row.length; i++) {
            if (row[i]==1) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        for (int i = 0; i < col.length; i++) {
            if(col[i]==1){
                for (int j = 0; j < row.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
    }
    
    public static void printArray(int matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void printArray(int matrix[]){
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i]+" ");
        }
    }
    
    public static double findVolume(double l, double w){
        double a = 12.0;
        double b = - 4.0 * (l + w);
        double c = l * w;
        double x = (-b - Math.sqrt( b*b - 4.0*a*c )) / (2.0*a) ;    //height or 'x'
        double volume = x * (l-2.0*x) * (w-2.0*x);
        return volume;
    }

    
    public static int trap(int[] height) {

        int leftBoundary[] = new int[height.length];
        leftBoundary[0] = height[0];

        for (int i = 1; i < leftBoundary.length; i++) {
            leftBoundary[i] = Math.max(height[i], leftBoundary[i-1]);
        }


        int rightBoundary[] = new int[height.length];
        rightBoundary[rightBoundary.length-1] = height[height.length-1];

        for (int i = rightBoundary.length-2; i >= 0; i--) {
            rightBoundary[i] = Math.max(height[i], rightBoundary[i+1]);
        }

        int water = 0;
        for (int i = 0; i < height.length; i++) {
            water += Math.max(0, Math.min(leftBoundary[i], rightBoundary[i]) - height[i]);
        }
        return water;
    }

    public static int isPrime(int n){
        int prime = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i == 0) {
                prime = 0;
                break;
            } else{
                prime = 1;
            }
        }
        return prime;
    }

    public static void sortColors(int[] array){

        int count[] = new int[3];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++; 
        }

        int j= 0;
        for (int i = 0; i < count.length; i++) {
            while(count[i]>0){
                array[j] = i;
                j++;
                count[i]--;
            }
        }

    }
      public static void main(String[] args) {

        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        // int n = 3;
        // System.out.println(isPrime(n));

        // int height[] = {4,2,0,3,2,5};
        // System.out.println("Trappped rainwater: " + trap(height));
        // inputs:
        
        // 3
        // double L = 2, W = 10;
        // double L = 3.590 , W =2.719;
        // double L = 8.1991, W = 7.189;

        // outputs:
        // 4. 513804324
        // 2.226884890
        // 33.412886097
        
        // 5
        // double L = 3 , W =8.1;
        // double L = 2.390, W = 12.719;
        // double L = 6 , W =7;
        // double L = 10 , W =6;
        // double L = 3.655, W = 4.567;
        
        // outputs:
        // 7.518538087
        // 8.250282196
        // 20.072957650
        // 32.835282941
        // 5.005296605
        // double volume = ;
        // System.out.println("The volume is : "+ String.format("%.9f", findVolume(L, W)));
        // System.out.println("The volume is : "+ eq(L, W));
        // int numRows = 8;
        // generate(numRows);
        
        
        // int matrix[][] = {
            //     {0,1,2,0},
            //     {3,4,5,2},
            //     {1,3,1,5}
            // };
            // System.out.println("Before: ");
            // printArray(matrix);
            // setZeroes(matrix);
            // System.out.println("After: ");
            // printArray(matrix);
            
            // int nums[] = {-1,-2,-4,0};
            // System.out.println("Max sum is "+maxSubArray(nums));
            
        // int nums[] = {3,4,5,1,2};
        // int nums[] = {1,2,3,4,5};
        // System.out.println("Give array is sorted and rotated: " + check(nums));    
        }
    }