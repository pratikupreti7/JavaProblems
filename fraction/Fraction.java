package fraction;

public class Fraction {
    private int numerator;
    private int denomirator;

    public  Fraction(int numerator,int denomirator){
        this.numerator=numerator;

        if(denomirator==0){
            System.out.println("Denomirator cannot be zero");
        }

        this.denomirator=denomirator;

        simplify();
    }



    private void simplify(){

        int gcd=1;
        int smallest=numerator<denomirator?numerator:denomirator;
        for(int i=2;i<smallest;i++){
            if(numerator%i==0 && denomirator%i==0){
                gcd=i;
            }
        }
        numerator=numerator/gcd;
        denomirator=denomirator/gcd;
    }
}
