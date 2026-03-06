public class Hyena extends Animal {
    // Unique features for Hyena
    private String laugh;

    public Hyena(String name, int age, String species, String laugh) {
        super(name, age, species); // This passes data to the parent 'Animal' class
        this.laugh = laugh;
    }

    public String getLaugh() { return laugh; }
    public void setLaugh(String laugh) { this.laugh = laugh; }
}