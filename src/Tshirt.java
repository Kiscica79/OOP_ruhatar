public class Tshirt extends Clothes {
    private String color;
    private boolean patterned;


    public Tshirt(Gender gender, Condition clothes, String color, boolean patterned) {
        super("póló", gender, clothes);
        this.color = color;
        this.patterned = patterned;
    }

    public String getColor() {
        return color;
    }

    public boolean isFigured() {
        return figured;
    }

    @Override
    public String toString() {
        return super.toString() + ", "
                + color + ", "
                + (patterned ? "Patterned" : "Plain");
    }
}
