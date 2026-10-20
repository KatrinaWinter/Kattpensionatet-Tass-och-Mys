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

    public void upprop() {
        if (katter.isEmpty()) {
            System.out.println("Hotelet är tomt.");
            return;
        }
        for (Katt katt : katter) {
            System.out.println(katt.getNamn() + ", " +
                    katt.getRas() + ", chipnummer: " +
                    katt.getChipnr());
        }
    }

}
