package Recursion_kunal;

public class sum {
    public static int sumOfDigits(int input){
		
        
        if(input==0){
            return 0;
        }

        return (input%10)+sumOfDigits(input/10);


	}
    public static void main(String[] args) {
        System.out.println(sumOfDigits(2345));
    }
}
