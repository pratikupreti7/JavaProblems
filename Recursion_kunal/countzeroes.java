package Recursion_kunal;

public class countzeroes {

    public static int  count(int number) {
        return helper(number,0);
    }

    public static int helper(int number,int count) {
        if(number==0){
            return count;
        }
        int rem=number%10;
        if(rem==0){
            return helper(number/10, count+1);
        }
        return helper(number/10, count);
    }
    public static void main(String[] args) {
        System.out.println(count(231));
    }
}
