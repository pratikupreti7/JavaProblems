package Prime;
import java.util.*;

public class isPrime {

    public static boolean prime(int number){
        if (number <= 1)
            return false;

        int count=0;
        for(int i=2;i*i<=number;i++){
            if(number%i==0){
                count++;
                break;
            }

        }
        if(count>0){
            return false;
        }
        else{
            return true;
        }


        
    }
    public static void main(String[] args) {
        System.out.println("How many number you want to scan??");
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();

        for(int i=1;i<n;i++){
            // int number=scan.nextInt();
            boolean check=prime(i);
            System.out.println("The number "+i+" "+"is Prime?"+" "+check);
        }

        
        
    }
}
