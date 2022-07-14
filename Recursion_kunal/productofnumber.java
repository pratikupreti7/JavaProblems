package Recursion_kunal;


public class productofnumber {

    public static int  product(int number) {

        if(number==1){
            return 1;
        }

        return number*product(number-1);
        
    }
    public static void main(String[] args) {
        System.out.println(product(4));
    }
}
