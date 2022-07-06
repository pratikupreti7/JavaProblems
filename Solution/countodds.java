package Solution;

public class countodds {

    public static int count(int high ,int low){
        int count =0;
        for(int i=low+1;i<=high;i++){
            if(i%2!=0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
        int high,low;
        int count=count(high,low);
    }
}
