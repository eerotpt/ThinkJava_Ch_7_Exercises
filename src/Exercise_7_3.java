/**
 * Created by opilane on 17.11.2016.
 */
public class Exercise_7_3 {
//computing number "a" in power "b" (a raised to the power b)
    public static void power(double a,int b){
        double result=a;
        while (b>1){
            b=b-1;
            result=result*a;
        }
        System.out.println("result = "+result);
    }

    public static void main(String[] args){
        power(3,4);
    }
}
