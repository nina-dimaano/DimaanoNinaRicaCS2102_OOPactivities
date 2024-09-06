import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Getting the Greater Value");
        System.out.print("\nEnter first character: ");
        char Char1 = input.next().charAt(0);

        System.out.print("Enter second character: ");
        char Char2 = input.next().charAt(0);

        char GreaterChar = (char) Math.max(Char1, Char2);

        String Border = "------------------------------------------";
        System.out.println(Border);
        System.out.println("The character with greater value is: " + GreaterChar);
        System.out.println(Border);
        System.out.println("Showing the ASCII Codes");
        System.out.println(Char1 + ": " + (int) Char1);
        System.out.println(Char2 + ": " + (int) Char2);
        
        input.close();
    }
}
