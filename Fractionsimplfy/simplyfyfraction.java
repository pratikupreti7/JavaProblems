package Fractionsimplfy;

public class simplyfyfraction {
    private int numerator;
    private int denomirator;
    public void fraction(int numerator,int denomirator){
        System.out.println("Numerstor"+numerator);
        System.out.println("denomerstor"+denomirator);
        simplify();
        System.out.println("Numerstor"+numerator);
        System.out.println("denomerstor"+denomirator);
        System.out.println("I am here");
        if(denomirator==1){
            System.out.println(numerator);
        }
        System.out.println(numerator+"/"+denomirator);
    }

    private void simplify(){

        int gcd=1;
        int smallest=numerator<denomirator?numerator:denomirator;
        System.out.println("I am smallest"+smallest);
        for(int i=2;i<=smallest;i++){
            if(numerator%i==0 && denomirator%i==0){
                gcd=i;
            }
        }
        System.out.println("I am GCD"+gcd);
        numerator=numerator/gcd;
        denomirator=denomirator/gcd;

        System.out.println("I am numerator"+numerator);
        System.out.println("I am denomerator"+denomirator);
    }
    public static void main(String[] args) {
        
        simplyfyfraction obj=new simplyfyfraction();

        obj.fraction(10,20);

    }
}
