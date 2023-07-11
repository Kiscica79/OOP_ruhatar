public class Tshirt extends Clothes {
    private String color;
    private boolean figured;


    public Tshirt(Gender gender, Condition clothes, String color, boolean figured) {
        super(gender, clothes);
        this.color = color;
        this.figured = figured;
    }

    public String getColor() {
        return color;
    }

    public boolean isFigured() {
        return figured;
    }
}
