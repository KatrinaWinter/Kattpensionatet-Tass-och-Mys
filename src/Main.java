//[x] 1. Skapa en katt som har namn, ras, chipnummerr (fyra sifror). Privat
//[x] 2. Register /lista på incheckade katter. Privat
//[x] 3. Blokera/spärra om två katter med samma nummer försöker registreras. Meddela
//[x] 4. Vill see namn ras och chipnummer vid upprop. Meddela om det är tomt.
// NYA PUNKTER FÖR PASS 2:
// [x] 7. Göra så att hotellet kan leta upp en katt på namn (eller svara tomt om den saknas)
// [x] 8. Bygga meny-loopen som snurrar med Scanner tills vi väljer att avsluta
// [x] 9. Koppla ihop val 1-4 med hotellet (och skydda sökningen i val 3 mot krasch med en grindvakt)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KattHotell hotell = new KattHotell();

        System.out.println("\n--- KattHotell ---");

        int val = 0;

        while (val != 6) {
            System.out.println("\n1. Checka in katt");
            System.out.println("2. Lista alla incheckade katter");
            System.out.println("3. Sök katt på namn");
            System.out.println("4. Visa antal katter");
            System.out.println("5. Checka ut katt");
            System.out.println("6. Avsluta programmet");
            System.out.print("\nVälj ett alternativ: ");

            val = scanner.nextInt();
            scanner.nextLine();

            if (val == 1) {
                System.out.print("Kattens namn: ");
                String namn = scanner.nextLine();

                System.out.print("Kattens ras: ");
                String ras = scanner.nextLine();

                System.out.print("Fyrsiffrigt chipnummer: ");
                int chipnr = scanner.nextInt();
                scanner.nextLine();

                Katt katt = new Katt(namn, ras, chipnr);
                hotell.laggTill(katt);
            } else if (val == 2) {
                hotell.upprop();

            } else if ( val == 3) {
                System.out.print("Ange kattens namn: ");
                String namn = scanner.nextLine();

                Katt hittad = hotell.hittaKatt(namn);

                if (hittad != null) {
                    System.out.println( hittad.getNamn() + ", " +
                                    hittad.getRas() + ", chipnummer: " +
                                    hittad.getChipnr());
                } else {
                    System.out.println("Katten hittades inte.");
                }
            } else if (val == 4) {
                System.out.println("Just nu bor det " + hotell.antalKatter()
                        + " katter på hotellet!");
            } else if (val == 5){
                    System.out.println("Ange chipnummer: ");
                int chipnr = scanner.nextInt();
                scanner.nextLine();

                hotell.checkaUt(chipnr);

            } else if (val == 6){
                System.out.println("Programmet avslutas.");
            } else {
                System.out.println(
                        "Ogiltigt val. Välj mellan 1 och 6."
                );
            }
        }

        scanner.close();
    }

}
