public class Shoes extends Clothes {

    private int size;

    public Shoes(Gender gender, Condition clothes, int size) {
        super("cipő", gender, clothes);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return super.toString() + ", Size " + size;
    }

}
