package tekton;

/**
 * A TektonGombatlan osztály a Tekton osztályból származik, és felülírja a lehetGomba metódust.
 * A TektonGombatlan típusú Tektonok nem rendelkeznek gombával, ezért a lehetGomba metódus false értéket ad vissza.
 */
public class TektonGombatlan extends Tekton {
    /**
     * Konstruktor, amely meghívja a szülő osztály konstruktorát és kiír egy üzenetet.
     */
    public TektonGombatlan() {
        super();
        System.out.println("TektonGombatlan: public TektonGombatlan()");
    }
    /**
     * Felülírja a lehetGomba metódust, és false értéket ad vissza, mivel a TektonGombatlan típusú Tekton nem tartalmaz gombát.
     *
     * @return false
     */
    @Override
    public boolean lehetGomba() {
        System.out.println("Tekton Gombatlan: boolean lehetGomba()");
        return false;
    }
}
