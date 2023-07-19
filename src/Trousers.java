public class Trousers extends Clothes {

    private TrousersLength trousers;

    public Trousers(Gender gender, Condition clothes, TrousersLength trousers) {
        super("nadrág", gender, clothes);
        this.trousers = trousers;
    }

    public TrousersLength getTrousers() {
        return trousers;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + trousers + " Length";
    }
}
