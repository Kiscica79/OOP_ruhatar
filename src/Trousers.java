public class Trousers extends Clothes {

    private TrousersLength trousers;

    public Trousers(Gender gender, Condition clothes, TrousersLength trousers) {
        super(gender, clothes);
        this.trousers = trousers;
    }

    public TrousersLength getTrousers() {
        return trousers;
    }
}
