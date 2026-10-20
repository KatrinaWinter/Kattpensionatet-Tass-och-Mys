import java.util.ArrayList;
import java.util.List;

public class KattHotell {
    private List<Katt> katter = new ArrayList<>();

    public boolean laggTill(Katt katt) {
        for (Katt befintligKatt : katter) {
            if (befintligKatt.getChipnr() == katt.getChipnr()) {
                System.out.println("VARNING: Chipnumret finns redan!");
                return false;
            }
        }
        katter.add(katt);
        System.out.println("Välkommen " + katt.getNamn() + "!");
        return true;
    }
    public int antalKatter() {
        return katter.size();
    }
}
