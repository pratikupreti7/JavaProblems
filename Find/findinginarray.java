package Find;
import java.lang.annotation.Target;
import java.util.*;
public class findinginarray {

    public static int find(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(target==i){
                System.out.println("Target found at index "+i);
                return i;
            }
        }
        System.out.println("Element was not found");
        return -1;
    }
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the target element :");
        int target=scan.nextInt();
        System.out.println("Enter size of an array :");
        int n =scan.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter " +n+ " inputs of an array :");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Array provided was : "+Arrays.toString(arr));

        System.out.println(find(arr,target));

        


    }
}
