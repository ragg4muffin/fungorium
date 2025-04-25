package gombasz;

import tekton.Hatszog;

/**
 * A {@code LassitoSpora} osztály a {@link Spora} osztályból származik, és a lassító spórák
 * szerepét reprezentálja a játékban. A lassitó spórák képesek lassítani a rovarok mozgását.
 */
public class LassitoSpora extends Spora{
    public LassitoSpora(Hatszog h) {
        super(h);
        System.out.println("LassitoSpora: LassitoSpora(Hatszog h)");
    }

    public void rovarEszi() {
        System.out.println("LassitoSpora: void rovarEszi()");
    }
}
