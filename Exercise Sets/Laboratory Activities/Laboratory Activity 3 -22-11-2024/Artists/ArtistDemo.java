public class ArtistDemo {
    public static void main(String[] args) {
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        artist.displayInfo();
        System.out.println();

        Singer singer = new Singer("Nayeon Im", "Korean", 29, "Music", Genre.POP);
        singer.displayInfo();
        System.out.println();

        Painter painter = new Painter("Vincent van Gogh", "Dutch", 37, Medium.OIL);
        painter.displayInfo();
        System.out.println();

        Writer writer = new Writer("Jonah Pacala", "Filipino", 33, WritingStyle.FICTION);
        writer.displayInfo();
        System.out.println();

        Dancer dancer = new Dancer("Niana Guerrero", "Filipino", 18, DanceStyle.HIPHOP);
        dancer.displayInfo();

    }
}