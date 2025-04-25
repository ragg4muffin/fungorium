package gamelogic;

import tekton.Hatszog;

/**
 * Absztrakt {@code Targy} osztály, amely egy játékbeli tárgy alapját képezi.
 * Minden tárgynak van egy {@link Hatszog} típusú attribútuma, amely a hozzá tartozó hatszögöt reprezentálja.
 */
public abstract class Targy {
    /**A tárgyhoz tartozó hatszög*/
    private Hatszog hatszog;

    /**
     * Konstruktor, amely inicializálja a tárgyat egy {@link Hatszog} objektummal.
     *
     * @param h A tárgyhoz tartozó hatszög.
     */
    protected Targy(Hatszog h) {
        this.hatszog = h;
        System.out.println("Targy: Targy(Hatszog h)");
    }

    /**
     * Visszaadja a tárgyhoz tartozó {@link Hatszog} objektumot.
     *
     * @return A tárgyhoz tartozó hatszög.
     */
    public Hatszog getHatszog() {
        System.out.println("Targy: void getHatszog");
        return hatszog;
    }

    /**
     * Beállítja a tárgyhoz tartozó {@link Hatszog} objektumot.
     * Az aktuális implementáció csak egy üzenetet ír ki.
     */
    public void setHatszog(Hatszog h) {
        System.out.println("Targy: void setHatszog");
    }
    /**
     * Absztrakt metódus, amely visszaadja a tárgy típusát.
     * Az alosztályoknak kell implementálniuk a típus meghatározását.
     *
     * @return A tárgy típusa {@link TargyTipus}.
     */
    public abstract TargyTipus getTipus();
}
