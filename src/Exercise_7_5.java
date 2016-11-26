/**
 * Created by eero on 11/26/16.
 */
public class Exercise_7_5 {

    /*1. Write a method called myexp that takes x and n as parameters and
     *estimates e x by adding the first n terms of this series.
     **/
    public static double myExp(double x,int n){
        double num1=x;
           int num2=n;
        double sum1=1.0;
        double sum2=1.0;
        double result=1.0;
           int i;
         for (i=1;i<=n+1;i++){
             sum1=sum1*num1;
             sum2=sum2*i;
             result=result+(sum1/sum2);
         }return result;
    }

    public static void main(String[] args){

        /*Write a loop in main that invokes check with the values 0.1, 1.0, 10.0, and
100.0. How does the accuracy of the result vary as x varies? Compare
the number of digits of agreement rather than the difference between the
actual and estimated values.**/
        //Answer: the more digits the argument has the less accurate is the results
        for (double i=0.1;i<=100;i=i*10){
            check(i);
        }

            /*Add a loop in main that checks myexp with the values -0.1, -1.0, -10.0,
and -100.0. Comment on the accuracy.**/
        //Answer: the more digits the argument has the the less accurate is the results
            for (double a=-0.1;a>=-100;a=a*10){
                check(a);
            }

        }

    /*. Write a method called check that takes a parameter, x, and displays x,
     myexp(x), and Math.exp(x). The output should look something like:
     1.0  2.708333333333333  2.718281828459045**/
    public static void check(double x){
        System.out.println(x+"   "+myExp(x,16)+"   "+Math.exp(x));
    }

}
