package Recursion_kunal;

public class returnsteps {

    public static int steps(int number) {
        return helper(number,0);
    }

    public static int helper(int number,int count) {
        if(number==0){
            return count;
        }
        if(number%2==0){
            return helper(number/2, count+1);
        }
        else{
            return helper(number-1, count+1);
        }
    }
    public static void main(String[] args) {
        
    }
}
