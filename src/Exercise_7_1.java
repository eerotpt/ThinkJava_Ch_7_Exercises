/**
 * Created by eero on 17/11/2016.
 */

/** Exercise:
 * 1. Draw a table that shows the value of the variables i and n during the
 execution of loop. The table should contain one column for each variable
 and one line for each iteration.
 ANSWER_1 :
 i-column    n-column
 10           10
 5            10
 6            10
 3            10
 4            10
 2            10

 2. What is the output of this program?
 ANSWER_2 :
 Output of the program is "i-column"
 3. Can you prove that this loop terminates for any positive value of n?
 ANSWER_3 :
 The code proves it.Dividing continues until i=1, while loop continues until i>1
 */
public class Exercise_7_1 {
    public static void main(String[] args) {
        loop(10);
    }
    public static void loop(int n) {
        int i = n;
        while (i > 1) {
            System.out.println(i);
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i = i + 1;
            }
        }
    }
}
