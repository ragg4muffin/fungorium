package rovarasz;

import gamelogic.Targy;
import gamelogic.TargyTipus;
import interfacek.IMozgathato;
import tekton.Hatszog;

/**
 * A {@code Rovar} osztály egy rovar reprezentációja, amely képes mozogni
 * a játéktéren, és különböző akciókat hajt végre, mint például a spóra evése
 * vagy a fonal vágása. A {@code Rovar} implementálja az {@code IMozgathato}
 * interface-t, így képes elvégezni a mozgást a játéktéren.
 */
public class Rovar extends Targy implements IMozgathato {
    /** A rovar sebessége*/
    private RovarSebesseg sebesseg = RovarSebesseg.NORMAL;
    /**A rovar képes-e fonalat vágni*/
    private boolean tudVagni = true;

    /**
     * Konstruktor, amely inicializálja a rovar helyét a megadott {@code Hatszog}-on.
     *
     * @param h A rovar kezdőhelye, amely egy {@code Hatszog} objektumot reprezentál.
     */
    public Rovar(Hatszog h) {
        super(h);
        System.out.println("Rovar: Rovar(Hatszog h)");
    }
    /**
     * Visszaadja a rovar típusát, amely mindig {@code TargyTipus.ROVAR}.
     *
     * @return A rovar típusát reprezentáló {@code TargyTipus.ROVAR}.
     */
    @Override
    public TargyTipus getTipus() {
        System.out.println("Rovar: TargyTipus getTipus()");
        return TargyTipus.ROVAR;
    }
    /**
     * A rovar evési metódusa, amely ellenőrzi, hogy a rovar talál-e spórát a
     * mezőn, és ha igen, megeszi azt, így a spóra hatása érvénybe lép.
     */
    public void eves() {
        System.out.println("Rovar.eves()");
        System.out.println("Hol állok?");
        Hatszog hatszogem = getHatszog();
        System.out.println("Mi van ezen a mezőn?");
        hatszogem.getTargyak();  // Kiírjuk, milyen tárgyak vannak itt
        boolean vanSpora = true; // "teszt-jelleggel" most feltesszük, hogy tényleg van spóra
        if (vanSpora) {
            // Megeszi a spórát:
            System.out.println("Találtam spórát! Megeszem...");
            // A spóra valamilyen hatása érvényesül:
            System.out.println("A spóra hatása érvénybe lép.");
            //Spora.getSporaEffekt();
            System.out.println("A spóra elfogyott, a hatszögről eltűnik.");
        } else {
            // Nincs spóra, semmi nem történik
            System.out.println("Nem találtam spórát, így nem eszem semmit.");
        }
    }
    /**
     * A rovar vágásának metódusa, amely ellenőrzi, hogy a rovar talál-e fonalat
     * a mezőn, és ha igen, akkor vágja azt.
     */
    public void vagas() {
            System.out.println("Rovar.vagas()");
            System.out.println("Hol állok?");
            Hatszog hatszogem = getHatszog();
            System.out.println("Mi van itt?");
            hatszogem.getTargyak();
            System.out.println("Ha van fonal akkor vágás, ha nincs akkor nem tudok.");
    }

    /**
     * A rovar mozgását végző metódus. A rovar lépési lehetőségeit vizsgálja,
     * majd elvégzi a tényleges mozgást.
     */
    @Override
    public void mozog() {
        System.out.println("Rovar.mozog()");
        lepesiLehetosegek();
        lep();
    }

    /**
     * A rovar lépési lehetőségeit vizsgálja meg, azaz hogy mely szomszédos
     * hatszögökre tud lépni.
     */
    public void lepesiLehetosegek() {
        System.out.println("Rovar: Hatszog lepesiLehetosegek()");
        System.out.println("Hol állok?");
        Hatszog hatszogem = getHatszog();
        System.out.println("Kik a szomszédaim?");
        hatszogem.getSzomszedok();
        System.out.println("Rovarász választ hogy hova szeretne lépni.");
    }
    /**
     * Elvégzi a rovar tényleges lépését, azaz módosítja a rovar helyét a
     * játéktéren.
     */
    public void lep() {
        System.out.println("Rovar: void lep()");
        setHatszog(new Hatszog());
    }
}
