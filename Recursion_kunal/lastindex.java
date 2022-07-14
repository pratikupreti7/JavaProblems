package Recursion_kunal;


    
public class lastindex {

	public static int firstIndex(int input[], int x) {
	
        return helper(input,x,input.length-1);

    }
    public static int helper(int input[], int x,int index) {
        
        if(index==0){
            return -1;
        }

        if (input[index]==x){
            return index;
        }

        else{
           return  helper(input, x, index-1);
        }

    }

    public static void main(String[] args) {
        int [] arr={1,1,2,3,5,6,7};

        System.out.println(firstIndex(arr, 1));
    }

}