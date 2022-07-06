package LeetCode;
import java.util.*;

// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
public class avgsalary {

    public static int min(int[] arr){
        int min=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("min is "+ min);
        return min;

    }
    public static int max(int[] arr){
        int max=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
           
        }
        System.out.println("max is"+max);
        return max;
    }

    public static double average(int[] arr){
        int min =min(arr);
        int max=max(arr);
        int sum=0;
        for (int i = 0; i <arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println(sum+"sum is ");
        double remsum=sum-min-max;
        System.out.println(remsum+"remsum");

        int totalelements=arr.length-2;
        System.out.println("totalelements"+totalelements);

        double avg=(remsum/totalelements);

        return (double)avg;
    }
    public static void main(String[] args) {
        int [] arr={48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        System.out.println("Array provided was : "+Arrays.toString(arr));
        double avg=average(arr);
        System.out.println(avg);
    }
}
