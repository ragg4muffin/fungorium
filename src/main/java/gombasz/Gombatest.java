package gombasz;

import gamelogic.Targy;
import gamelogic.TargyTipus;
import interfacek.ILerakhato;
import tekton.Hatszog;
import tekton.Tekton;

/**
 * A {@code Gombatest} osztály a játékban szereplő gombatesteket reprezentálja. A gombatestek
 * képesek gombafonalakat növeszteni, spórákat lőni, és meghatározhatják saját pusztulásukat.
 * A gombatestek az {@link Targy} osztályból származnak, és az {@link ILerakhato} interfész
 * implementálásával képesek lerakódni a játéktérre.
 */
public class Gombatest extends Targy implements ILerakhato {
    /**A gombatesthez tartozó gombász (tulajdonos)*/
    private Gombasz tulajdonos;
    /**A kapcsolódó gombafonal*/
    private Gombafonal gombafonal = null;
    /**A gombatest pozíciója a térképen*/
    private Hatszog hatszog = null;
    /**A gombatest szintje*/
    private int szint = 0;
    /** A gombatest által generált spórák száma*/
    private int sporaszam =0;
    /**A gombatest állapota (elpusztult-e)*/
    private boolean elpusztult = false;
    /**A gombatest által végrehajtható lövések száma*/
    private int hatralevo_loves;
    /**
     * Konstruktor, amely inicializálja a gombatestet a megadott {@code Hatszog} pozícióval.
     * A gombafonal kezdetben null értékű, és a gombatest három hátralévő lövéssel indul.
     *
     * @param h A gombatest pozíciója a játéktéren (Hatszog).
     */
    public Gombatest(Hatszog h) {
        super(h);
        hatralevo_loves = 3;
        System.out.println("Gombatest: Gombatest(Hatszog h)");
    }
    /**
     * Visszaadja a gombatesthez tartozó spórák számát.
     *
     * @return A gombatest spórák száma.
     */
    public int getSporaszam(){return sporaszam;}
    /**
     * Beállítja a gombatesthez tartozó spórák számát.
     *
     * @param s A beállítandó spórák száma.
     */
    public void setSporaszam(int s){sporaszam = s;}


    /**
     * Visszaadja a gombatest típusát.
     *
     * @return A gombatest típusa {@link TargyTipus#GOMBATEST}.
     */
    @Override
    public TargyTipus getTipus() {
        System.out.println("Gombatest: TargyTipus getTipus()");
        return  TargyTipus.GOMBATEST;
    }
    /**
     * Növeszt egy új gombafonalat a megadott {@code Hatszog} helyen.
     *
     * @param h A gombafonal növesztésének célja, amely a játéktéren lévő {@code Hatszog}.
     */
    public void gombafonalNovesztes(Hatszog h) {
        Gombafonal g = new Gombafonal(h);
        System.out.println("Gombatest: void gombafonalNovsztes(Hatszog cel)");
    }
    /**
     * Lerakja a gombatestet a játékterére.
     */
    public void lerak(){
        System.out.println("Gombatest: void lerak(Hatszog cel)");
    }
    /**
     * Ellenőrzi, hogy a gombatest képes-e lövést végrehajtani.
     * A gombatest akkor tud lőni, ha a spórák száma eléri a 4-et.
     *
     * @return {@code true}, ha a gombatest tud lőni, egyébként {@code false}.
     */
    public boolean tudLoni(){
        System.out.println("Gombatest: boolean tudLoni()");
        return sporaszam >= 4;
    }
    /**
     * Végrehajt egy spóralövést, csökkentve a hátralévő lövések számát.
     * Ha a hátralévő lövések száma 0-ra csökken, a gombatest elpusztul.
     *
     */
    public void sporaLoves() {
        System.out.println("Gombatest: void sporaLoves(Tekton cel)");
        hatralevo_loves--;
        if(hatralevo_loves == 0){
            elpusztul();
        }
    }
    /**
     * A gombatest elpusztulásának logikáját tartalmazza. Ha a gombatest elpusztul,
     * az {@code elpusztult} változó értéke {@code true} lesz.
     */
    public void elpusztul() {
        System.out.println("Gombatest: void elpusztul()");
        elpusztult = true;
    }
    /**
     * Beállítja a hátralévő lövések számát.
     *
     * @param lov A hátralévő lövések száma.
     */
    public void setHatralevo_loves(int lov) {hatralevo_loves = lov;}

    /**
     * Lerakja a gombatestet a megadott {@code Hatszog} pozícióra.
     *
     * @param h A gombatest lerakási célja (Hatszog).
     */
    @Override
    public void lerak(Hatszog h) {
        System.out.println("Gombatest: void lerak(Hatszog h)");
    }
}