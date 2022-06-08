package Count;

import java.util.Scanner;

import Reverse.reversenumber;

public class finaltest {

    public static int count(int number){
        int count=0;
        while(number>0){
            number=number/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int num=scan.nextInt();
        int count=count(num);
        int digit=(int)Math.pow(10,count-1);

        while(digit!=0){
            int ques=num/digit;
            System.out.println(ques);
            num=num%digit;
            digit=digit/10;
        }
    }
}
