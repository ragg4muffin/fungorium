package tekton;

/**
 * A TektonKeresztfonalas osztály a Tekton osztályból származik, és annak alapfunkcionalitásait örökli.
 * A TektonKeresztfonalas egy speciális típusú Tekton, amely esetleg más funkciókkal rendelkezhet a későbbiekben.
 */
public class TektonKeresztfonalas extends Tekton {
    /**
     * Konstruktor, amely meghívja az ősosztály konstruktorát.
     * A konstruktor kiírja a megfelelő üzenetet a konzolra.
     */
    public TektonKeresztfonalas() {
        super();
        System.out.println("TektonKeresztfonalas: public TektonKeresztfonalas()");
    }
}
