public class Katt {
    private String namn;
    private String ras;
    private int chipnr;

    public Katt(String namn, String ras, int chipnr) {
        this.namn = namn;
        this.ras = ras;
        this.chipnr = chipnr;
    }

    public String getNamn() {
        return namn;
    }
    public String getRas() {
        return ras;
    }
    public int getChipnr() {
        return chipnr;
    }
}
