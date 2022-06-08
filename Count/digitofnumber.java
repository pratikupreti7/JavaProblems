package Count;

import java.util.Scanner;

public class digitofnumber {

    public static int  count(int number){
          int count=0;  
        while(number>0){
            number=number/10;
            count++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        int count=count(number);
   
        int div=(int)Math.pow(10, count-1);

        while(div!=0){
            int q=number/div;
            System.out.println(q);
            number=number%div;
            div=div/10;
        }
    }
}
