/**
 * Created by eero on 17/11/2016.
 */
public class Exercise_7_2 {

    public static void squareRoot(double num){
        //temporary values for computing
        double roughGuess=num/2;
        double estimate1=2;
        double estimate2=1;
        //computing square root
        while ((estimate1-estimate2)>=0.0001) {
            estimate1 = ((roughGuess + num / roughGuess)) / 2;
            estimate2 = ((estimate1 + num /estimate1)) / 2;
            roughGuess = estimate1;
        }
        //Answer to screen
            double answer=estimate2;
            System.out.printf("Square root %.2f = %.3f",num,answer);
    }

    public static void main(String[] args){
        double ant=(2);
       squareRoot(ant);
    }
}
