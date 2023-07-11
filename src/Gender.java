public enum Gender {
    MEN("férfi"),
    WOMEN("női"),
    UNISEX("unisex"),
    CHILDREN("gyerek");

    String magyarNev;

    Gender(String magyarNev) {
        this.magyarNev = magyarNev;
    }

    public String getMagyarNev() {
        return magyarNev;
    }

}
