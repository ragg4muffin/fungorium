package gombasz;

import tekton.Hatszog;

/**
 * A {@code VagasgatloSpora} osztály a {@link Spora} osztályból származik, és a
 * vágásgátló spórák
 * szerepét reprezentálja a játékban. A vágásgátló spórák képesek megakadályozni a
 * rovarok vágását.
 */
public class VagasgatloSpora extends Spora {
    public VagasgatloSpora(Hatszog h) {
        super(h);
        System.out.println("VagasgatloSpora: VagasgatloSpora(Hatszog h)");
    }

    public void rovarEszi() {
        System.out.println("VagasgatloSpora: void rovarEszi()");
    }
}