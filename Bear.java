public class Bear extends Animal {
    private String habitat;

    public Bear(String name, int age, String species, String habitat) {
        super(name, age, species); // This must match the Animal constructor!
        this.habitat = habitat;
    }

    public String getHabitat() { return habitat; }
    public void setHabitat(String habitat) { this.habitat = habitat; }
}