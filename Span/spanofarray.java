package Span;

import java.util.Arrays;
import java.util.Scanner;

import Inverse.inverseofanumber;

public class spanofarray {

    public static int  max(int[] arr){

        int max=arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>max){
                max=arr[i];
            }
            
        }

        return max;
    }

    public static int  min(int[] arr){

        int min=arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]<min){
                min=arr[i];
            }
            
        }

        return min;
    }

    public static int ans(int[]arr){
        int min=min(arr);
        int max=max(arr);

        int answer=max-min;

        return answer;
    }



    public static void main(String[] args) {
        System.out.println("Enter size of an array:");

        Scanner scan=new Scanner(System.in);
        int n =scan.nextInt();
        
        

        int arr[] =new int[n];
        System.out.println("Enter " +n+ " inputs of an array:");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Array provided was : "+Arrays.toString(arr));
       
        System.out.println("Largest number of the array : "+max(arr));

        System.out.println("Smallest number of the array : " +min(arr));

        System.out.println("Span of the array : " +ans(arr));


        
    }
}
