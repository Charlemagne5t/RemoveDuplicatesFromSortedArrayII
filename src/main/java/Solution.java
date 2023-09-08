import java.util.Arrays;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 3){
            return nums.length;
        }
        int placeHolder = Integer.MIN_VALUE / 2;
    int placeHolderCount = 0;
        for (int i = 0; i < nums.length - 1;) {
            int currentNumber = nums[i];
            if(currentNumber == nums[i + 1]){
                i = i + 2;
                while (i < nums.length && nums[i] == currentNumber  ){
                    nums[i] = placeHolder;
                    placeHolderCount++;
                    i++;
                }
            }else i++;
        }


        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != placeHolder && nums[i - 1] == placeHolder){
                moveLeft(nums, i);
            }
        }

        return nums.length - placeHolderCount + 1;
    }
    private void moveLeft(int[] nums, int i){
        int placeHolder = Integer.MIN_VALUE / 2;
        int newIndex = i - 1;
        while (newIndex >= 0 && nums[newIndex] == placeHolder){
            newIndex--;
        }
        newIndex++;
        nums[newIndex] = nums[i];
        nums[i] = placeHolder;
    }

}
