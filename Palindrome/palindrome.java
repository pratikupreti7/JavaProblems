package Palindrome;

import java.util.Scanner;

public class palindrome {

    public static int reverse(int number){
        int rev=0;
        while(number>0){
            int rem=number%10;
            rev=rev*10+rem;
            number=number/10;
           
        }
        return rev;

    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int num=scan.nextInt();

        int rev=reverse(num);

        if(num==rev){
            System.out.println("Number is a palindrome");
        }
        else{
            System.out.println("Number is not a palindrome");
        }
    }
}
