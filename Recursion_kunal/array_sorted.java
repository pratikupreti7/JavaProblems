package Recursion_kunal;

public class array_sorted {

    public static boolean sorted(int[] arr,int index) {

        if(index==arr.length-1){
            return true;
        }

        return arr[index]<arr[index+1] && sorted(arr, index+1);
        
    }
    public static void main(String[] args) {
        int [] arr={10,2,30};
        System.out.println(sorted(arr,0));
    }
}
