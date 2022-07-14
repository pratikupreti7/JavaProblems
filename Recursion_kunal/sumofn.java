package Recursion_kunal;

public class sumofn {
    public static int sum(int n){
        if(n==1){
            return 1;
        }

        return n+sum(n-1);
        
    }
    public static void main(String[] args) {
        int sum=sum(2);

        System.out.println(sum);
    }
}
