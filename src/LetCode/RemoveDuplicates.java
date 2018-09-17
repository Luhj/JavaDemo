package LetCode;

/**
 * Created by Luhaijie on 2018/9/9.
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int result = nums.length;
        int lastNum = nums[0];
        int i = 1;
        while (i < result) {
            if (nums[i] == lastNum) {
                removeItem(nums, i);
                result--;
            } else {
                lastNum = nums[i];
                i++;
            }
        }
        return result;
    }

    private void removeItem(int[] nums, int removeFlag) {
        for (int i = removeFlag; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
    }

    public static void printNums(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] nums = {0, 0, 1, 1, 2, 2, 3, 4, 5, 5};
        System.out.println(removeDuplicates.removeDuplicates(nums));
        printNums(nums);
    }
}
