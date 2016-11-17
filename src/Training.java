/**
 * Created by opilane on 17.11.2016.
 */
public class Training {
    public static void countdown(int n) {
        while (n > 0) {
            System.out.print(n+" ");
            n = n - 1;
        }
        System.out.println("Blastoff!");
    }
    public static void power(double a,int b){
        double result=a;
        while (b>0){
            b=b-1;
            result=result*a;
        }
        System.out.println("end : "+result);
    }
    public static void main(String[] args){
        countdown(11);
        power(2,5);

        int i = 1;
        while (i < 10) {
            double x = (double) i;
            System.out.println(x + " " + Math.log(x));
            i = i + 1;
        }
    }
}
