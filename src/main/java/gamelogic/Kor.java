package gamelogic;

import gombasz.Gombasz;
import rovarasz.Rovarasz;

import java.util.Collections;
import java.util.List;

/**
 * A {@code Kor} osztály a játék egy körét reprezentálja. A kör tartalmazza a gombászok és rovarászok
 * sorrendjét, valamint a kör lezárásának és új sorrend generálásának logikáját.
 */
public class Kor {
    // Attribútumok
    /**A kör sorszáma*/
    private int sorszam;
    /**A gombászok sorrendje ebben a körben*/
    private List<Gombasz> gombaszSorrend;
    /** A rovarászok sorrendje ebben a körben*/
    private List<Rovarasz> rovaraszSorrend;

    /**
     * Konstruktor, amely inicializálja a kör attribútumait és generál egy új sorrendet a gombászok és rovarászok számára.
     */
    public Kor() {
        generateSorrend();
        System.out.println("Kor: Kor(int sorszam, List<Gombasz> gombaszok, List<Rovarasz> rovaraszok)");
    }

    /**
     * Hozzáad egy gombászt a körhöz.
     *
     * @param gombasz A hozzáadni kívánt gombász
     */
    public void addGombasz(Gombasz gombasz) {
        System.out.println("Kor: void addGombasz(Gombasz gombasz)");
    }

    /**
     * Hozzáad egy rovarászt a körhöz.
     *
     * @param rovarasz A hozzáadni kívánt rovarász
     */
    public void addRovarasz(Rovarasz rovarasz) {
        System.out.println("Kor: void addRovarasz(Rovarasz rovarasz)");
    }

    /**
     * Véletlenszerű sorrendet generál a gombászok és rovarászok számára a körben.
     * Az aktuális implementáció csak egy üzenetet ír ki.
     */
    public void generateSorrend() {
        System.out.println("Kor: generalSorrend()");
    }

    /**
     * Lezárja a kör végrehajtását. Az aktuális implementáció csak egy üzenetet ír ki.
     */
    public void lezarKor() {
        System.out.println("Kor: void lezarKor()");
    }

    /**
     * Visszaadja a kör sorszámát.
     *
     * @return A kör sorszáma
     */
    public int getSorszam() {
        System.out.println("Kor:  int getSorszam()");
        return -1;
    }

    /**
     * Visszaadja a gombászok sorrendjét a körben.
     *
     * @return A gombászok sorrendje
     */
    public List<Gombasz> getGombaszSorrend() {
        System.out.println("Kor:  List<Gombasz> getGombaszSorrend()");
        return null;
    }

    /**
     * Visszaadja a rovarászok sorrendjét a körben.
     *
     * @return A rovarászok sorrendje
     */
    public List<Rovarasz> getRovaraszSorrend() {
        System.out.println("Kor:  List<Rovarasz> getRovaraszSorrend()");
        return rovaraszSorrend;

    }

    /**
     * Elindítja a kör egyes lépéseit. Az aktuális implementáció csak egy üzenetet ír ki.
     */
    public void start(){
        System.out.println("Kor:  List<Rovarasz> getRovaraszSorrend()");
    }

    public void modifySpora(String pos, int int1, String effect) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifySpora'");
    }

    public void gombaszFonal(String value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gombaszFonal'");
    }

    public void gombaszSpora(String value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gombaszSpora'");
    }

    public void rovaraszMove(int int1, String value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rovaraszMove'");
    }

    public void rovaraszEat(int int1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rovaraszEat'");
    }

    public void modifyTekton(String id, String type) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifyTekton'");
    }

    public void nextRound() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nextRound'");
    }
}
