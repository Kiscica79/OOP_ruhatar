public class Shirt extends Clothes {

    private boolean shirtSleeve;


    public Shirt(Gender gender, Condition clothes, boolean shirtSleeve) {
        super("ing", gender, clothes);
        this.shirtSleeve = shirtSleeve;
    }

    public boolean isShortSleeve() {
        return shirtSleeve;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + (shirtSleeve ? "Long Sleeve" : "Short Sleeve");
    }
}
