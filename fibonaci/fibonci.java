package fibonaci;

import java.util.Scanner;

public class fibonci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number for fibonaci series : ");
        int num=scan.nextInt();
        for(int i=0;i<num;i++){
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
