public enum JacketType {

    RAIN("esőkabát"),
    AUTUMN("őszi"),
    WINTER("téli");

    private String magyarnev;

    JacketType(String magyarnev) {
        this.magyarnev = magyarnev;
    }

    public String getMagyarnev() {
        return magyarnev;
    }
}
