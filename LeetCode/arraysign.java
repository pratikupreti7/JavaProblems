package LeetCode;

import java.util.Arrays;

// https://leetcode.com/problems/sign-of-the-product-of-an-array/
public class arraysign {

    public static long product(int[] nums){

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        // System.out.println();
        long product=1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            if(start==end){
                product=product*nums[start];
                System.out.println("product from euqal"+product);
                return product;
            }
            product=product*nums[start]*nums[end];
            System.out.println(product);
            start++;
            System.out.println(start);
            end--;
            System.out.println(end);
        }
        return product;
    }



    public static int signFunc(int[] nums){
     long product=product(nums);
     if(product==0){
         System.out.println(product+"Product from signfunc");
         return 0;

     }
     else if (product<0){
        return -1;
     }
     else if(product>0){
         return 1;
     }
    }

    public static void main(String[] args) {
        int[] nums={9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};
        long product=product(nums);
        System.out.println(product+"Product is 00000000");
        System.out.println("sign func"+signFunc(nums));
    }
}
