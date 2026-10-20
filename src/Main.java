//[x] 1. Skapa en katt som har namn, ras, chipnummerr (fyra sifror). Privat
//[x] 2. Register /lista på incheckade katter. Privat
//[x] 3. Blokera/spärra om två katter med samma nummer försöker registreras. Meddela
//[x] 4. Vill see namn ras och chipnummer vid upprop. Meddela om det är tomt.

public class Main {
    static void main(String[] args) {
        KattHotell hotell = new KattHotell();

        hotell.upprop();

        System.out.println("Antal katter på hotellet: " + hotell.antalKatter());

    }
}
