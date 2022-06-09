package RotateNumber;
import java.util.*;
import java.util.Scanner;

public class rotatenumber {

    public static int  rotate(int num,int n){
        int rev=0;

        for (int i = 0; i < n; i++) {
            if(num>0){
                while(num>0){
                int rem=num%10;
                
                num=num/10;
                int count=0;
                int orgnum=num;
                while(num>0){
                    num=num/10;
                    count++;
                }  
                rev=(int)(rem*Math.pow(10,count)+orgnum);
                }
            num=rev;
            } 
            else if(num<0){
                System.out.println("Entered negative");
                int realnum=(-1)*(num);
                num=num*(-1);
                int count=0;
                while(num>0){
                    num=num/10;
                    count++;
                } 
                
                System.out.println(count);
                int div=(int)Math.pow(10, count-1);
                int ques=realnum/div;
                int rem=realnum%div;
                rev=-(rem*10+ques);
                num=rev;
                
            }
            
        }
      
      return rev;
    }
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your number:");
        int num=scan.nextInt();
        System.out.println("Enter the number of rotation you want:");
            int rotate=scan.nextInt();
            int rev=rotate(num,rotate);
            System.out.println("After "+ rotate + " rotation new number is: "+ rev);
    }       
        
    
}
