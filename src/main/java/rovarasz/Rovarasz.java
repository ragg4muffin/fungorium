package rovarasz;

import gamelogic.Jatekos;
import tekton.Hatszog;

import java.util.ArrayList;
import java.util.List;

/**
 * A {@code Rovarasz} osztály egy játékos típus, amely a {@code Jatekos} osztályt örökli.
 * A {@code Rovarasz} képes vezérelni egy {@code Rovar} objektumot, és különböző akciókat hajt végre
 * a rovaron, mint például mozgás, vágás és evés.
 */
public class Rovarasz extends Jatekos {
    /** A rovarok, amelyeket a rovarász irányít*/
    private List<Rovar> rovarok = new ArrayList<>();
    /** Jelenleg használt rovar*/
    private Rovar rovar;

    /**
     * Konstruktor, amely inicializálja a rovarászt a megadott névvel.
     *
     * @param nev A rovarász neve.
     * @param rovar A rovar, amelyet a rovarász irányít.
     */
    public Rovarasz(String nev, Rovar rovar) {
        super(nev);
        rovarok.add(rovar);
        System.out.println("Rovarasz: Rovarasz(String nev, Rovar rovar)");
    }

    public Rovarasz(String nev, String pos, String id) {
        super(nev, pos, id);
        rovarok.add(rovar);
        System.out.println("Rovarasz: Rovarasz(String nev, String pos, String id)");
    }

    /**
     * Visszaadja a rovarásznak tulajdonolt rovar példányt.
     *
     * @return A rovar, amelyet a rovarász irányít.
     */
    public List<Rovar> getRovarok() {
        return rovarok;
    }
    /**
     * A rovarász lépése. (Jelenleg nem definiált lépés, de a szuperosztály lépési funkcióját hívja.)
     */
    @Override
    public void lep() {
        System.out.println("Rovarasz: void lep()");
    }



    /**
     * A rovarásznak lehetősége van vágni a rovar segítségével.
     */
    public void rovaraszVagas() {
        rovar.vagas();
   }
    /**
     * A rovarász mozgását kezdeményezi a rovar segítségével.
     */
    public void rovaraszMozog() {
        rovar.mozog();
    }
    /**
     * A rovarász evést kezdeményez a rovar segítségével.
     */
    public void rovaraszEves() {
        rovar.eves();
    }
}


