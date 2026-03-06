public class Lion extends Animal {
    private String roar;

    public Lion(String name, int age, String species, String roar) {
        super(name, age, species);
        this.roar = roar;
    }
    public String getRoar() { return roar; }
    public void setRoar(String roar) { this.roar = roar; }
}