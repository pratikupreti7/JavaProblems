package Count;

import java.util.Scanner;

public class digit{
    public static int count(int number){
        int count =0;
        while(number>0){
            number=number/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int num=scan.nextInt();
        int count = count(num);
        int div=(int)Math.pow(10,count-1);

        while(div!=0){
           int ques= num/div;
           System.out.println(ques);
           num=num%div;

           div=div/10;

        }
    }
}