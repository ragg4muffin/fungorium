package gombasz;

import gamelogic.Targy;
import gamelogic.TargyTipus;
import interfacek.ILerakhato;
import tekton.Hatszog;
import tekton.Tekton;
import rovarasz.Rovar;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A {@code Gombafonal} osztály a {@link Targy} osztályból származik, és az {@link ILerakhato}
 * interfész implementálásával lehetővé teszi a gombafonal lerakását a játéktéren.
 * Ez az osztály kezeli a gombafonal különböző állapotait és a kapcsolódó gombatesteket.
 */
public class Gombafonal extends Targy implements ILerakhato {
    /** A kapcsolódó gombatestek*/
    private List<Gombatest> gombatestek;
    /** Az állapot, hogy ép-e a fonal (el van e vágva)*/
    private boolean ep;
    /** A hátralévő idő, amíg a fonal életben marad*/
    private int hatralevoIdo;

    /**
     * Konstruktor, amely inicializálja a gombafonalat egy {@link Hatszog} objektummal.
     *
     * @param h A gombafonalhoz tartozó hatszög.
     */
    public Gombafonal(Hatszog h) {
        super(h);
        System.out.println("Gombafonal: Gombafonal(Hatszog hatszog)");
    }

    /**
     * A gombafonal növesztésének metódusa, amely egy új gombatestet hoz létre a megadott célhelyen.
     *
     */
    public void gombatestNovesztes() {
        System.out.println("Gombafonal: void gombatestNovesztes(Hatszog cel)");
    }
    /**
     * A gombafonal elhalásának metódusa, amely véglegesen eltávolítja a fonalat a játékból.
     */
    public void elhal() {
        System.out.println("Gombafonal: void elhal()");
    }
    /**
     * A fonal lerakásának metódusa, amely a gombafonalat egy {@link Hatszog} helyre helyezi a játéktéren.
     *
     * @param tekton A hely, ahol a fonal elhelyezésre kerül.
     */
    @Override
    public void lerak(Hatszog tekton) {
        System.out.println("Gombafonal: void lerak(Hatszog h)");
    }

    /**
     * Visszaadja a gombafonalhoz kapcsolódó gombatestek listáját.
     */
    public void getGombatestek() {
        System.out.println("Gombafonal: List<Gombatest> getGombatestek()");
    }
    /**
     * Beállítja a gombafonalhoz kapcsolódó gombatestek listáját.
     *
     */
    public void setGombatestek() {
        System.out.println("Gombafonal:void setGombatestek(List<Gombatest> gombatestek)");
    }

    /**
     * Ellenőrzi, hogy a gombafonal ép-e.
     *
     * @return {@code true} ha a fonal ép, egyébként {@code false}.
     */
    public void isEp() {
        System.out.println("Gombafonal: boolean isEp()");
    }

    /**
     * Beállítja a gombafonal állapotát, hogy ép vagy sem.
     *
     * @param ep A gombafonal ép állapota.
     */
    public void setEp(boolean ep) {
        System.out.println("Gombafonal: void setEp()");
    }

    /**
     * Visszaadja a gombafonal hátralévő idejét.
     * A metódus a felhasználótól kérdezi meg a hátralévő időt.
     *
     * @return A hátralévő idő.
     */
    public int getHatralevoIdo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gombafonal: int getHatralevoIdo()");
        System.out.print("Hátralévő idő: ");
        int hatralevoIdo = sc.nextInt();
        sc.close();
        return hatralevoIdo;
    }

    /**
     * Beállítja a gombafonal hátralévő idejét.
     *
     * @param hatralevoIdo A beállított hátralévő idő.
     */
    public void setHatralevoIdo(int hatralevoIdo) {
        hatralevoIdo = hatralevoIdo;
        System.out.println("Gombafonal: void setHatralevoIdo(int hatralevoIdo)");
    }

    /**
     * Visszaadja a gombafonal típusát, amely {@link TargyTipus#GOMBAFONAL}.
     *
     * @return A gombafonal típusát {@link TargyTipus#GOMBAFONAL}.
     */
    @Override
    public TargyTipus getTipus() {
        System.out.println("Gombafonal: void setHatralevoIdo(int hatralevoIdo)");
        return TargyTipus.GOMBAFONAL;

    }

    public void rovarEves(Rovar rovar) {}

}
