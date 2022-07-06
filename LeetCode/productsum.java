package LeetCode;
// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
public class productsum {

    public static int sum(int num){
        int sum=0;
        while(num>0){
            int dig=num%10;
            sum=sum+dig;
            num=num/10;

        }
        return sum;
    }
    public static int product(int num){
        int prod=1;
        while(num>0){
            int dig=num%10;
            prod=prod*dig;
            num=num/10;

        }
        return prod;
    }
    public static int difference(int num){
        int product=product(num);
        int sum=sum(num);
         int diff=product-sum;
        
        return diff;
    }
    public static void main(String[] args) {
        System.out.println(difference(1234));
    }
}
