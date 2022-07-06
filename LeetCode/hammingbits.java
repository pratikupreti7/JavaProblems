package LeetCode;
java.util.*;
// https://leetcode.com/problems/number-of-1-bits/
public class hammingbits {

    public static int countones(int num){
        String number = Integer.toBinaryString(num);
        int count=0;
        for (int j = 0; j < number.length(); j++) {
            if(number.charAt(j)==1){
                count++;
            }
        }
       return count;   

        }
     
    public static void main(String[] args) {
        System.out.println(countones(00000000000000000000000000001011));
    }
}
