package assignment;

public class q1RepeatingNumbers {
    public static boolean repeatingNum(int nums[]){
        boolean foundRepeating = false;
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (key == nums[j]) {
                    foundRepeating = true;
                    break;
                }
            }
        }
        return foundRepeating;
    }
    public static void main(String[] args) {
        int nums[] = {1, 3, 4,2};
        System.out.println(repeatingNum(nums));
    }
}
