public enum CoatType {

    RAIN("esőkabát"),
    AUTUMN("őszi"),
    WINTER("téli");

    private String magyarnev;

    CoatType(String magyarnev) {
        this.magyarnev = magyarnev;
    }

    public String getMagyarnev() {
        return magyarnev;
    }
}
