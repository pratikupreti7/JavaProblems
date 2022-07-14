package Recursion_kunal;

public class linearsearcharray {

    public static boolean isfound(int[] arr,int target,int index) {
        if(index==arr.length)
        {
            return false;
        }
        return arr[index]==target || isfound(arr, target, index+1);
    }
    public static int isfoundindex(int[] arr,int target,int index) {
        if(index==arr.length)
        {
            return -1;
        }
        if(arr[index]==target){
            return index;
        } 
       else{
        return isfoundindex(arr, target, index+1);
       } 
    }
    public static void main(String[] args) {

        int [] arr= {1,2,3,4,4,4,6,7};
        System.out.println(isfound(arr,4,0));
        System.out.println(isfoundindex(arr,4,0));
    }
}
