//[x] 1. Skapa en katt som har namn, ras, chipnummerr (fyra sifror). Privat
//[x] 2. Register /lista på incheckade katter. Privat
//[x] 3. Blokera/spärra om två katter med samma nummer försöker registreras. Meddela
//[x] 4. Vill see namn ras och chipnummer vid upprop. Meddela om det är tomt.
// NYA PUNKTER FÖR PASS 2:
// [x] 7. Göra så att hotellet kan leta upp en katt på namn (eller svara tomt om den saknas)
// [] 8. Bygga meny-loopen som snurrar med Scanner tills vi väljer att avsluta
// [] 9. Koppla ihop val 1-4 med hotellet (och skydda sökningen i val 3 mot krasch med en grindvakt)
/* 1. Checka in katt
2. Lista alla incheckade katter
3. Sök katt på namn
4. Avsluta programmet*/

public class Main {
    static void main(String[] args) {
        KattHotell hotell = new KattHotell();

        Katt katt1 = new Katt("Misse", "Birma", 1001);
        Katt katt2 = new Katt("Kitty", "Bond", 1003);
        Katt katt3 = new Katt("Maja", "Siames", 1001);


        hotell.laggTill(katt1);
        hotell.laggTill(katt2);
        hotell.laggTill(katt3);

        hotell.upprop();

        System.out.println("Antal katter på hotellet: " + hotell.antalKatter());

    }
}
