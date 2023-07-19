public class Socks extends Clothes {

    private SocksType type;

    public Socks(Gender gender, Condition clothes, SocksType type) {
        super("zokni", gender, clothes);
        this.type = type;
    }

    public SocksType getType() {
        return type;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + type + " Sock";
    }
}
