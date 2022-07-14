package Recursion_kunal;

public class from_oneto_n {
    public static void number(int n){

        if(n<=0){
            return ;
        }
        number(n-1);
        System.out.println(n);
    
    }

    public static void main(String[] args) {
        number(5);
    }
}
