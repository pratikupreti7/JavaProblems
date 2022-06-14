package Inverse;

public class inverseofanumber {
    public static boolean check(int number){

        int count=0;
        int newnumber=number;
        while(newnumber!=0){
            newnumber=newnumber/10;
            count++;
        }


        int div=(int)Math.pow(10, count-1);

        while(div!=0){
            int q=number/div;

            for(int i=1;i<=count;i++){
                if(i==q){
                    return true;
                }
                else{
                    return false;
                }
            }
            System.out.println(q);
            number=number%div;
            div=div/10;
        }


        System.out.println(count);
        for (int i = 1; i <=count; i++) {
            int div2=(int)Math.pow(10, count-1);

            
                int q=number/div2;
                System.out.println(q);
            
                if(i==q){
                    System.out.println(i+"is present");
                    break;
                }
                else{
                    System.out.println(i+"is not present");
                    
                }
        }

        return true;

    }
    public static void main(String[] args) {
        System.out.println(check(2341));
    }
}
