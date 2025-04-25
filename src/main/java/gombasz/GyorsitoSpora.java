package gombasz;

import tekton.Hatszog;

/**
 * A {@code GyorsitoSpora} osztály a {@link Spora} osztályból származik, és a gyorsító spórák
 * szerepét reprezentálja a játékban. A gyorsító spórák képesek gyorsítani a rovarok mozgását.
 */
public class GyorsitoSpora extends Spora{
    public GyorsitoSpora(Hatszog h) {
        super(h);
        System.out.println("GyorsitoSpora: GyorsitoSpora(Hatszog h)");
    }

    public void rovarEszi() {
        System.out.println("GyorsitoSpora: void rovarEszi()");
    }
}
