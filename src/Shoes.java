public class Shoes extends Clothes {

    private int size;

    public Shoes(Gender gender, Condition clothes, int size) {
        super(gender, clothes);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

}
