package Recursion_kunal;

public class sumofarray {
    public static int sum(int input[]) {
		
        return  helper(input,0,input.length-1);
        

	}
    public static int helper(int input[],int sum,int index) {
		
        if(index==0){
            return input[0];
        }
        helper(input,input[index]+input[index -1],index-1);

        System.out.println(sum);
        return sum;
        
		
	}

    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        System.out.println(sum(arr));
    }
}

