package tekton;
/**
 * A {@code TektonEgyFonalas} osztály a {@code Tekton} osztály egy speciális típusa, amely egyetlen összefüggő
 * fonallal rendelkező tektonikus mezőt reprezentál. Ez az osztály örökli a {@code Tekton} alapfunkcióit
 * és biztosítja, hogy csak egyetlen fonal jelenjen meg a tektonikus mezőn.
 */
public class TektonEgyFonalas extends Tekton {
    /**
     * Létrehozza a {@code TektonEgyFonalas} objektumot, amely örökli a {@code Tekton} alapfunkcióit.
     * A konstruktor inicializálja a szükséges elemeket és hívja a szülőosztály konstruktorát.
     */
    public TektonEgyFonalas() {
        super();
        System.out.println("TektonEgyFonalas: public TektonEgyFonalas()");
    }
}
