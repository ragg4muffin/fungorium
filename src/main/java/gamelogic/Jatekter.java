package gamelogic;

import tekton.Hatszog;
import tekton.Tekton;

import java.util.List;
import java.util.ArrayList;

/**
 * A {@code Jatekter} osztály reprezentálja a játékteret, amely tárolja a játék során létező tektonokat és
 * hatszögeket. Az osztály biztosítja az alapvető műveleteket a játéktér betöltéséhez és a tektonok/hatszögek
 * lekérdezéséhez.
 */
public class Jatekter {
    // Attribútumok
    private List<Tekton> tektonok; /** A játék során létező tektonok listája */
    private List<Hatszog> hatszogek; /** A játéktérben tárolt hatszögek listája */

    /**
     * Konstruktor, amely inicializálja a játéktér attribútumait. A konstruktor nem fogad paramétereket,
     * és a tektonok és hatszögek listái üresek a kezdéskor.
     */
    public Jatekter() {
        System.out.println("Jatekter: Jatekter(List<Tekton> tektonok, List<Hatszog> hatszogek)");
    }
    /**
     * Betölti a játéktér adatokat egy megadott fájlból. A metódus jelenleg csak egy üzenetet ír ki,
     * és nem valósítja meg a tényleges fájlbetöltést.
     *
     */
    public void betoltes(String fajl) {
        System.out.println("Jatekter: void betoltes(String fajl)");
    }

    /**
     * Visszaadja a játéktér összes tektonját.
     *
     * @return A tektonok listája
     */
    public List<Tekton> getTektonok() {
        System.out.println("Jatekter: List<Tekton> getTektonok()");
        return null;
    }

    /**
     * Visszaadja a játéktér összes hatszögét.
     *
     * @return A hatszögek listája
     */
    public List<Hatszog> getHatszogek() {
        System.out.println("Jatekter: List<Hatszog> getHatszogek()");
        return null;
    }
}
