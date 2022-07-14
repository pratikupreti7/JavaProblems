package Recursion_kunal;

public class productofdigits {

    public static int  product(int number) {



        if(number%10==number){
            return number;
        }

        

        return (number%10)*product(number/10);
        
    }
    public static void main(String[] args) {
        System.out.println(product(55));
    }
}
