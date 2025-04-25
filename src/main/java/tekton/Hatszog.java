package tekton;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import gamelogic.Targy;
import gombasz.Gombatest;
import interfacek.IMozgathato;

/**
 * A hatszög egy mezőt reprezentál a játékterületen, amely tartalmazhat különböző objektumokat.
 */
public class Hatszog {

    /**
     * Tárolja a hatszög tektonját.
     */
    private Tekton tekton;

    /**
     * A hatszögön található gombatest, ha van.
     */
    private Gombatest gombatest;

    /**
     * A hatszögön található tárgyak listája.
     */
    private List<Targy> targyak = new ArrayList<>();

    /**
     * A hatszögön található mozgatható elemek listája.
     */
    private List<IMozgathato> mozgathatok = new ArrayList<>();

    /**
     * A hatszög szomszédos hatszögei.
     */
    private List<Hatszog> szomszedok = new ArrayList<>();

    /**
     * Konstruktor egy új hatszög létrehozására.
     */
    public Hatszog(){
        System.out.println("Hatszog: Hatszog(Tekton tekton)");
    }

    /**
     * Visszaadja a hatszögön található tárgyakat.
     */
    public void getTargyak() {
        System.out.println("Hatszog: List<Targy> getTargyak()");
    }

    /**
     * Ellenőrzi, hogy van-e gombatest a hatszögön.
     */
    public void vanGombatest() {
        System.out.println("Hatszog: boolean vanGombatest()");
    }

    /**
     * Ellenőrzi, hogy van-e spóra a hatszögön.
     */
    public void vanSpora() {
        System.out.println("Hatszog: boolean vanSpora()");
    }

    /**
     * Hozzáad egy szomszédos hatszöget.
     *
     * @param szomsz a hozzáadandó szomszédos hatszög
     */
    public void addSzomszed(Hatszog szomsz) {
        szomszedok.add(szomsz);
    }

    /**
     * Több szomszédos hatszöget ad a listához.
     *
     * @param szomsz a hozzáadandó szomszédos hatszög tömb
     */
    public void addSzomszedok(Hatszog[] szomsz) {
        szomszedok.addAll(Arrays.asList(szomsz));
    }

    /**
     * Beállítja a hatszöghoz tartozó tektont.
     *
     * @param t a beállítandó Tekton objektum
     */
    public void setTekton(Tekton t) {
        tekton = t;
        System.out.println("Hatszog: void szomszedok(Tekton t)");
    }

    /**
     * Visszaadja a hatszöghöz tartozó tektont.
     *
     * @return a hatszög tektonikai információja
     */
    public Tekton getTekton() {
        System.out.println("Hatszog: Tekton getTekton()");
        return tekton;
    }

    /**
     * Visszaadja a hatszög szomszédos hatszögeinek listáját.
     *
     * @return a szomszédos hatszögek listája
     */
    public List<Hatszog> getSzomszedok() {
        System.out.println("Hatszog: List<Hatszog> getSzomszedok()");
        return szomszedok;
    }
}
