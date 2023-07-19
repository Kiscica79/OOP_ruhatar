import java.util.ArrayList;
import java.util.List;

public class Cupboard {
    List<Clothes> clothes  = new ArrayList<>();


    public List<Clothes> getClothes() {
        return clothes;
    }

    public void addClothes(Clothes clothes) {
        this.clothes.add(clothes);
    }

    public void removeClothes(Clothes clothes) {
        this.clothes.remove(clothes);
    }
}
