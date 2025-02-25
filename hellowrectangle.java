
import java.util.*;

public class hellowRectangle {
    public static void hellow_rectangle(int totRows, int totCols) {
        //outer loop
        for(int i=1; i<=totRows; i++) {
            // inner - colums
            for(int j=1; j<=totCols; j++) {
                if(i == 1 || i == totRows || j == 1 || j == totCols) {
                    // bounderies cell
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();


        }

    }
    public static void main(String args[]) {
        hellow_rectangle(10, 7);

    }
}



