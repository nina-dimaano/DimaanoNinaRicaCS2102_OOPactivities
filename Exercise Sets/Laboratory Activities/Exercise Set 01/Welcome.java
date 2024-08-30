//Dimaano, Nina Rica A.
//CS-2102
import java.util.Scanner; 

class Welcome {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 211: Object-oriented Programming!"); 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        String statement = "This course will be fun ";
        System.out.println(statement + name + " !");  
        input.close();
    }
}
