package gombasz;

import tekton.Hatszog;

/**
 * A {@code OsztoSpora} osztály a {@link Spora} osztályból származik, és az osztó spórák
 * szerepét reprezentálja a játékban. Az osztó spórák képesek az őket megevő rovarokat osztódásra kényszeríteni.
 */
public class OsztoSpora extends Spora {
    public OsztoSpora(Hatszog h) {
        super(h);
        System.out.println("OsztoSpora: OsztoSpora(Hatszog h)");
    }

    public void rovarEszi() {
        System.out.println("OsztoSpora: void rovarEszi()");
    }
}