public class Shirt extends Clothes {

    private boolean shortSleeve;


    public Shirt(Gender gender, Condition clothes, boolean shortSleeve) {
        super(gender, clothes);
        this.shortSleeve = shortSleeve;
    }

    public boolean isShortSleeve() {
        return shortSleeve;
    }

}
