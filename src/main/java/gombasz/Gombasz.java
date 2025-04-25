package gombasz;

import java.util.List;
import java.util.ArrayList;

import gamelogic.*;
/**
 * A {@code Gombasz} osztály a {@link Jatekos} osztályból származik, és a gombász játékos szerepét
 * reprezentálja a játékban. A gombász képes végrehajtani a saját lépéseit, és kezelni a hozzá tartozó
 * gombatesteket.
 */
public class Gombasz extends Jatekos {
    /**A gombászhoz tartozó gombatestek listája*/
    private List<Gombatest> gombatestek;
    /**
     * Konstruktor, amely inicializálja a gombászt egy névvel.
     *
     * @param nev A gombász neve.
     */
    public Gombasz(String nev) {
        super(nev);
        System.out.println("Gombasz: Gombasz(String nev)");
    }

    public Gombasz(String nev, String pos, String id) {
        super(nev, pos, id);
        System.out.println("Gombasz: Gombasz(String nev, String pos, String id)");
    }

    /**
     * A gombász lépéseit végrehajtó metódus. Meghívja a {@link #lepesekGomba()} metódust,
     * amely tartalmazza a gombász lépéseit.
     */
    @Override
    public void lep() {
        lepesekGomba();
        System.out.println("Gombasz: void lep()");
    }
    /**
     * A gombász lépéseit tartalmazó metódus, amely meghatározza, hogy a gombász hogyan hajtja végre
     * a lépéseit a játékban.
     */
    public void lepesekGomba() {
        System.out.println("Gombasz: void lepesekGomba()");
    }
}

