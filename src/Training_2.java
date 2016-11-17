/**
 * Created by opilane on 17.11.2016.
 */
public class Training_2 {

    public static void main(String[] args){

        int i = 1;
        while (i <= 9) {
            printRow(i);
            i = i + 1;
        }
    }
    public static void printRow(int n) {
        int i = 1;
        while (i <= 9) {
            System.out.printf("%4d", n * i);
            i = i + 1;
        }
        System.out.println();
    }

}

