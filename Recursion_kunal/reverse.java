package Recursion_kunal;


public class reverse {
    public static int  count(int number) {

        int count=0;

        while(number>0){
            number=number/10;
            count++;
        }
        return count;
        
    }
    public static int reversing(int number) {
        int reverse=0;
        

          
        while(number>0){
            int digit=number%10;
            int count=count(number);
            reverse=reverse*10+digit;
            number=number/10;
        }

        return reverse;
        
    }
    public static void main(String[] args) {
        System.out.println(reversing(1234));
    }
}
