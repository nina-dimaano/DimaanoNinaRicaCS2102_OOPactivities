import java.util.Scanner;

class GettingInputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int Year = input.nextInt();
        input.nextLine();
        
        System.out.print("Enter the genre: ");
        String Genre = input.nextLine();
        
        System.out.print("Enter the album: ");
        String Album = input.nextLine();
        
        System.out.print("Enter the song title: ");
        String Title = input.nextLine();
        
        System.out.print("Enter the artist: ");
        String Artist = input.nextLine();
        
        String Border = "-----------------------------";
        System.out.println(Border);
        System.out.println("SONG DETAILS");
        System.out.println(Border);
        System.out.println("Year Released: " + Year);
        System.out.println("Genre: " + Genre);
        System.out.println("Album: " + Album);
        System.out.println("Title: " + "\"" + Title + "\"");
        System.out.println("Artist: " + Artist);
        input.close();
    }
}
