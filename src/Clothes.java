public abstract class Clothes {

    String type;
    Gender gender;
    Condition condition;

    public Clothes(String type, Gender gender, Condition condition) {
        this.type = type;
        this.gender = gender;
        this.condition = condition;
    }

    public Gender getGender() {
        return gender;
    }

    public Condition getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "type='" + type + '\'' +
                ", gender=" + gender +
                ", condition=" + condition +
                '}';
    }
}
