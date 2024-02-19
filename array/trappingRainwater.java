// Question: How can we efficiently trap rainwater given an array representing the heights of walls at different positions?

public class trappingRainwater {


    /*
    Intial code:
    Time complexity: O(n)
    Space complexity: O(n)
    */

    // public static int calculateRainWater(int heights[]){
        
    //     int leftMaxBoundary[] = new int[heights.length];
    //     leftMaxBoundary[0] = heights[0];
    //     for (int i = 1; i < leftMaxBoundary.length; i++) {

    //         leftMaxBoundary[i] = Math.max(heights[i], leftMaxBoundary[i-1]);
    //     }

    //     int rightMaxBoundary[] = new int[heights.length];
    //     rightMaxBoundary[heights.length-1] = heights[heights.length-1];
    //     for (int i = heights.length-2; i >= 0; i--) {
    //         rightMaxBoundary[i] = Math.max(heights[i], rightMaxBoundary[i+1]);
    //     }

    //     int trappedWater = 0;
    //     for (int i = 0; i < heights.length; i++) {
    //         int waterLevel = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);
    //         trappedWater += Math.max(0, waterLevel - heights[i]);
    //     }
    //     return trappedWater;
    // }


    /*
    Assignment code:
    Time complexity: O(n)
    Space complexity: O(1)
    */
    
    public static int trap(int height[]){
        
        int n = height.length;

        int res = 0, l = 0, r = n-1;
        int rMax = height[r], lMax = height[l];

        while (l<r) {
            if(lMax<rMax){
                l++;
                lMax = Math.max(lMax, height[l]);
                res += lMax - height[l];
            } else{
                r--;
                rMax = Math.max(rMax, height[r]);
                res += rMax - height[r];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int heights[] = {4, 2, 0, 3, 2, 5};
        // System.out.println("Rain water: "+ calculateRainWater(heights));
        System.out.println("Rain water: "+ trap(heights));
    }
}
