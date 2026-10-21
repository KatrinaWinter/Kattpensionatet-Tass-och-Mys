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
    public Katt hittaKatt(String namn) {
        for (Katt katt : katter) {
            if (katt.getNamn().equalsIgnoreCase(namn)) {
                return katt;
            }
        }
        return null;
    }

    public boolean checkaUt(int chipnr) {
        for (Katt katt : katter) {
            if (katt.getChipnr() == chipnr) {
                katter.remove(katt);
                System.out.println(katt.getNamn() + " har checkat ut.");
                return true;
            }
        }
        System.out.println("Ingen katt hittades med chipnummer " + chipnr);
        return false;
    }

}
