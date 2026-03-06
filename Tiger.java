public class Tiger extends Animal {
    private String stripePattern;

    public Tiger(String name, int age, String species, String stripePattern) {
        super(name, age, species);
        this.stripePattern = stripePattern;
    }
    public String getStripePattern() { return stripePattern; }
    public void setStripePattern(String stripePattern) { this.stripePattern = stripePattern; }
}