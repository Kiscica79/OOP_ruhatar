public enum Condition {
    WORST(1),
    SATISFYING(2),
    AVERAGE(3),
    GOOD(4),
    EXCELLENT(5);


    private final Integer code;
    Condition(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Condition{" +
                "code='" + code + '\'' +
                '}';
    }
}
