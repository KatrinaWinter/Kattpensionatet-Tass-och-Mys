import java.util.ArrayList;
import java.util.List;

public class KattHottel {
    private List<Katt> katter = new ArrayList<>();

    public void taEmot(String namn, String ras, int chipnr) {
        Katt katt = new Katt(namn, ras, chipnr);
        katter.add(katt);
        System.out.println("Välkommen " + namn + "!");
    }
}
