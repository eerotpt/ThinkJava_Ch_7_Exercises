/**
 * Created by eero on 11/26/16.
 */

/**
 *One way to evaluate exp(−x 2 ) is to use the infinite series
 expansion:
 exp(−x^2 ) = 1 − x^2 + x^4 /2 − x^6 /6 + . . .
 The ith term in this series is (−1)^i x^2i /i!. Write a method named gauss that
 takes x and n as arguments and returns the sum of the first n terms of the
 series.
 */
public class Exercise_7_6 {
    public static double gauss(double x,int n){
        double num1=x*x;
        int num2=n;
        int num3=-1;
        double sum1=1.0;
        double sum2=1.0;
        double result=1.0;
        int i;
        for (i=1;i<=n+1;i++){
            sum1=sum1*num1*num3;
            sum2=sum2*i;
            result=result+(sum1/sum2);
        }return result;
    }

    public static void main(String[] args){
        System.out.println(gauss(3,45));
        //testing accuracy
        System.out.print(Math.exp(-9));
    }
}
