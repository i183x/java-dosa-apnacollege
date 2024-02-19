package assignment;

public class q5Triplites {
    public static String printTriplets(int nums[]){
        System.out.print("[");
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if(nums[i]!=nums[j] && nums[i]!=nums[k] && nums[j]!=nums[k] && nums[i]+nums[j]+nums[k] == 0){
                        System.out.print("[" + nums[i] + "," + nums[j] + "," + nums[k] + "]");
                    }
                }
            }
        }
        System.out.print("]");
        return "";
    }
    public static void main(String[] args) {
        int nums[] = {-1, 0,  1, 2, -1, -4};  
        System.out.println(printTriplets(nums));
    }
}
