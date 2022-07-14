package Reverse;
import java.util.*;
public class reversenumber{

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        int reverse=0;
        while(number>0){
            int rem=number%10;
            reverse = reverse * 10 + rem;  
            System.out.println(reverse);
            number=number/10;
          
        }
        System.out.println("The reverse of the given number is: " + reverse);  
    }
}