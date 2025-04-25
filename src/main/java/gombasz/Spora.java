package gombasz;

import gamelogic.Targy;
import gamelogic.TargyTipus;
import interfacek.ILerakhato;
import rovarasz.Rovar;
import tekton.Hatszog;

/**
 * A {@code Spora} osztály a játékban szereplő spórákat reprezentálja. A spórák képesek
 * lerakódni a játéktér egy hatszögére, és tápanyagot biztosítani a rovarok számára.
 * A spórák hatása is lehet, ha egy rovar megeszi őket.
 */
public abstract class Spora extends Targy implements ILerakhato {
    /** A rovar, aki megeheti a spórát (ha elérhető)*/
    private Rovar rovar;
    /** A rovar számára rendelkezésre álló tápanyag mennyisége*/
    private int tapanyagTartalom;

    /**
     * Konstruktor, amely inicializálja a spórát a megadott {@code Hatszog} pozícióval.
     *
     * @param h A spóra pozíciója a játéktéren, amit a {@link Hatszog} objektum reprezentál.
     */
    public Spora(Hatszog h) {
        super(h);
        System.out.println("Spora: Spora(Hatszog hatszog, int sporaEffekt, int tapanyagTartalom)");
    }

    /**
     * A spóra lerakása a megadott {@code Hatszog} pozícióra.
     *
     * @param h A pozíció, ahol a spórát le kell rakni.
     */
    @Override
    public void lerak(Hatszog h) {
        super.setHatszog(h);                                 // Lerakjuk a spórát a megadott hatszögre
        System.out.println("Spora: void lerak(Hatszog h)");
    }
    /**
     * A metódus, amely meghatározza, hogy mi történik, ha egy rovar megeszi a spórát.
     */
    public abstract void rovarEszi();
    /**
     * Visszaadja a spórához tartozó rovart, aki megehette azt.
     */
    public void getRovar() {
        System.out.println("Spora: Rovar getRovar()");
    }
    /**
     * Beállítja a spórahoz tartozó rovart.
     *
     */
    public void setRovar() {
        System.out.println("Spora: void setRovar(Rovar rovar)");
    }
    /**
     * Visszaadja a spórához tartozó tápanyag tartalmát.
     *
     * @return A spóra tápanyag tartalma.
     */
    public void getTapanyagTartalom() {
        System.out.println("Spora: int getTapanyagTartalom()");
    }
    /**
     * Beállítja a spóra tápanyag tartalmát.
     *
     */
    public void setTapanyagTartalom() {
        System.out.println("Spora: void setTapanyagTartalom(int tapanyagTartalom)");
    }

    /**
     * Visszaadja a spóra típusát.
     *
     * @return A spóra típusát, amely mindig {@link TargyTipus#SPORA}.
     */
    @Override
    public TargyTipus getTipus() {
        System.out.println("Spora: TargyTipus getTipus()");
        return TargyTipus.SPORA;
    }
}
