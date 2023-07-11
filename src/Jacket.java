public class Jacket extends Clothes {

    private JacketType type;


    public Jacket(Gender gender, Condition clothes, JacketType type) {
        super(gender, clothes);
        this.type = type;
    }

    public JacketType getType() {
        return type;
    }
}
