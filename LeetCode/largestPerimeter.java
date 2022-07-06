package LeetCode;

import java.util.Arrays;
import java.util.*;

// https://leetcode.com/problems/largest-perimeter-triangle/
public class largestPerimeter {
    
    public static int Perimeter(int[] nums) {
       Arrays.sort(nums);
        for(int i=nums.length-1;i>=2;i--){
            if(nums[i-1]+nums[i-2]>nums[i]){
                int  sum=nums[i]+nums[i-1]+nums[i-2];
                return sum;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] nums={7,10,5,2};
       int per=Perimeter(nums);
       System.out.println(per);
    }
}
