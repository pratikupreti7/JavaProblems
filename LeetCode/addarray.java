package LeetCode;

import java.util.Arrays;

public class addarray {



    public static int[] sum(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            
            System.out.println(sum);
            arr[i]=sum+arr[i];

        }
        System.out.println(arr[1]);
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] sum=sum(arr);
        System.out.println(Arrays.toString(sum));
    }
}
