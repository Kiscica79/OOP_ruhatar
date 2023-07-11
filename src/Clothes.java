public abstract class Clothes {

    Gender gender;
    Condition clothes;

    public Clothes(Gender gender, Condition clothes) {
        this.gender = gender;
        this.clothes = clothes;
    }

    public Gender getGender() {
        return gender;
    }

    public Condition getClothes() {
        return clothes;
    }
}
