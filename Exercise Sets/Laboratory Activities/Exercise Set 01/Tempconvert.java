//Dimaano, Nina Rica A.
//CS-2102
import java.util.Scanner;  

class Tempconvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Celsius value: ");
        float CelsiusValue = input.nextFloat();
        float Fahrenheit = (CelsiusValue * 9/5) + 32;
        System.out.println(String.format("%.2f Celsius",CelsiusValue) + " is " + String.format("%.2f Fahrenheit",Fahrenheit));  
        input.close();
    }
}