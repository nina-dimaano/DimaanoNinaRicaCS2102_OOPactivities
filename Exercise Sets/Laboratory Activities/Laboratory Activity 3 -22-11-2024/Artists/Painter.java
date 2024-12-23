enum Medium {
    OIL, 
    WATERCOLOR, 
    ACRYLIC, 
    PENCIL, 
    CHARCOAL
}

public class Painter extends Artist {
    private Medium medium;

    public Painter(String name, String nationality, int age, Medium medium) {
        super(name, nationality, age, "Arts");
        this.medium = medium;
    }

    public Medium getMedium() {
        return medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    @Override
    public void displayInfo() {
        System.out.println("Painter's Info:");
        super.displayInfo();
        System.out.println("Medium: " + medium);
    }
}
