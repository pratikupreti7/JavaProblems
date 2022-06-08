package Reverse;
import java.util.*;
public class reversestring{

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String revstr="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            revstr=ch+revstr;
        }

        System.out.println("The reverse of the given number is: " + revstr);  
    }
}