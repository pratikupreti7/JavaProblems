package Count;

public class digitfrequency {

    public static int count (int number,int digit){
        
        int count=0;
            while(number>0){
                int rem=number%10;
                if(digit==rem){
                    count++;
                }
                number=number/10;
            }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(count(2323432, 2));
    }
}
