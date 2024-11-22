enum DanceStyle {
    BALLET, 
    HIPHOP, 
    JAZZ, 
    CONTEMPORARY
}

public class Dancer extends Artist {
    private DanceStyle danceStyle;

    public Dancer(String name, String nationality, int age, DanceStyle danceStyle) {
        super(name, nationality, age, "Dancing");
        this.danceStyle = danceStyle;
    }

    public DanceStyle getDanceStyle() {
        return danceStyle;
    }

    public void setDanceStyle(DanceStyle danceStyle) {
        this.danceStyle = danceStyle;
    }

    @Override
    public void displayInfo() {
        System.out.println("== Dancer Info ==");
        super.displayInfo();
        System.out.println("Dance Style: " + danceStyle);
    }
}
