package fibonaci;

import java.util.Scanner;

public class fibobyrecurssion {

    public static int fibo(int n){

        if(n<2){
            return n;
        }

        return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int num=scan.nextInt();

        int ans=fibo(num);
        System.out.println(ans);

    }
}
