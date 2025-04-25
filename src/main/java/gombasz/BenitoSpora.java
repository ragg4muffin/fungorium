package gombasz;

import tekton.Hatszog;

/**
 * A {@code BenitoSpora} osztály a {@link Spora} osztályból származik, és a
 * bénító spórák
 * szerepét reprezentálja a játékban. A bénító spórák képesek bénítani a
 * rovarokat.
 */
public class BenitoSpora extends Spora {
    public BenitoSpora(Hatszog h) {
        super(h);
        System.out.println("BenitoSpora: BenitoSpora(Hatszog h)");
    }

    public void rovarEszi() {
        System.out.println("BenitoSpora: void rovarEszi()");
    }
}