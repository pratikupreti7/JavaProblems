package Count;

public class countDigit {

    public static int count (int number){
        int count=0;
        while(number>0){
            number=number/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int number=020174460;
        int result=count(number);
        System.out.println(result);
    }
}
