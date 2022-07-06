package Barchart;
import java.util.*;
public class barchart {

    public static void bar(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            
        }
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
    }
    
}
