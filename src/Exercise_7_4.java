/**
 * Created by opilane on 17.11.2016.
 */
public class Exercise_7_4 {
// computing factorial
    public static void factorial(int n){
        int c=n;
        int d=n-1;
        while (d>0){
            c=c*d;
            d=d-1;
        } System.out.print(n+"!="+c);
    }

    public static void main(String[] args){
        factorial(5);
    }
}
