package gamelogic;

import tekton.Hatszog;

/**
 * Az absztrakt {@code Jatekos} osztály reprezentál egy játékost, aki rendelkezik egy névvel és pontszámmal.
 * Az osztály biztosítja a játékos névvel kapcsolatos információkat és a pontszám kezelését.
 * Az osztály további alosztályok számára biztosítja a {@code lep()} absztrakt metódust, amit az alosztályoknak
 * kell megvalósítaniuk a játékos lépéseinek logikájához.
 */
public abstract class Jatekos {
    /**Játékos neve */
    private String nev;
    /**Játékos pntszáma */
    private int pontszam;
    /**Játékos azonosítója*/
    private String id;
    /**Játékos pozíciója*/
    private String pos;

    /**
     * Konstruktor, amely inicializálja a játékos nevét és beállítja a kezdő pontszámot 0-ra.
     *
     * @param nev A játékos neve
     */
    public Jatekos(String nev) {
        this.nev = nev;
        this.pontszam = 0; // Kezdeti pontszám
        System.out.println("Jatekos: Jatekos(String nev)");
    }

    public Jatekos(String nev, String pos, String id) {
        this.nev = nev;
        this.pos = pos;
        this.id = id;
        this.pontszam = 0; // Kezdeti pontszám
        System.out.println("Jatekos: Jatekos(String nev)");
    }

    /**
     * Visszaadja a játékos nevét.
     *
     * @return A játékos neve
     */
    public String getNev() {
        return nev;
    }
    /**
     * Visszaadja a játékos aktuális pontszámát.
     *
     * @return A játékos pontszáma
     */
    public int getPontszam() {
        return pontszam;
    }

    /**
     * Beállítja a játékos pontszámát.
     *
     * @param pont A játékos új pontszáma
     */
    public void setPontszam(int pont) {
        this.pontszam = pont;
        System.out.println("Jatekos: void setPontszam(int pont)");
    }
    /**
     * Növeli a játékos pontszámát a megadott értékkel.
     *
     * @param pont A hozzáadandó pontszám
     */
    public void addPontszam(int pont) {
        this.pontszam += pont;
        System.out.println("Jatekos: void addPontszam(int pont)");
    }

    /**
     * Az absztrakt {@code lep()} metódus, amelyet az alosztályoknak kell megvalósítaniuk,
     * hogy biztosítsák a játékos lépéseit a játék során.
     */
    public abstract void lep();
}
