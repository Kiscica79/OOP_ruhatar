public class Coat extends Clothes {

    private CoatType type;


    public Coat(Gender gender, Condition clothes, CoatType type) {
        super("kabát", gender, clothes);
        this.type = type;
    }

    public CoatType getType() {
        return type;
    }


}
