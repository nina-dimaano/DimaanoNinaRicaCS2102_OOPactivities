//Dimaano, Nina Rica A.
//CS-2102
import java.util.Scanner;  

class Escseq {
    public static void main(String[] args) {
        boolean withTab = true;

        for (int i = 1; i <= 5; i++) {
            int multiple = 7 * i;
            if (withTab) {
                System.out.println("\t" + multiple);
            } else {
                System.out.println(multiple);
            }

            withTab = !withTab;
        }
    }
}