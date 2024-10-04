import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maxNumber;
        do {
            System.out.print("Enter the size of the multiplication table: ");
            maxNumber = scanner.nextInt();
        } while (maxNumber <= 0); 
        
        int[][] table = new int[maxNumber][maxNumber];

        for (int i = 1; i <= maxNumber; i++) {
            for (int j = 1; j <= maxNumber; j++) {
                table[i - 1][j - 1] = i * j; 
            }
        }

        System.out.println("Multiplication Table:");
        System.out.printf("%4s", " "); 
        for (int i = 1; i <= maxNumber; i++) {
            System.out.printf("%4d", i); 
        }
        System.out.println();

        for (int i = 1; i <= maxNumber; i++) {
            System.out.printf("%4d", i); 
            for (int j = 1; j <= maxNumber; j++) {
                System.out.printf("%4d", table[i - 1][j - 1]);
            }
            System.out.println(); 
        }

        scanner.close();
    }
}
