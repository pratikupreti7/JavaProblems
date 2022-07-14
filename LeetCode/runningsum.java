package LeetCode;

import java.util.Arrays;

class Solution {
    public static int[] runningSum(int[] nums) {
        recurse(nums,0);
        return nums;
    }

    public static void recurse(int[] nums, int pointer) {
        if (pointer == nums.length-1) {
            return ;
        }
        recurse(nums, pointer+1);
        nums[pointer] += nums[pointer +1];
    }

    public static void main(String[] args) {
        int arr[]={
            10,20,30
        };
        System.out.println(Arrays.toString(runningSum(arr)));
    }
}