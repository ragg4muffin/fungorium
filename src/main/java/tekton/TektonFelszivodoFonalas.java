package tekton;

import gombasz.Gombafonal;

import java.util.ArrayList;
/**
 * A {@code TektonFelszivodoFonalas} osztály a {@code Tekton} osztály egy speciális típusát képviseli,
 * amely képes gombafonalakat tárolni és kezelni. A gombafonalak életciklusát figyeli, és biztosítja azok
 * életben tartását vagy elhalását az idő múlásával.
 */
public class TektonFelszivodoFonalas extends Tekton {
    /** A {@code Gombafonal} objektumok tárolására szolgáló lista */
    private ArrayList<Gombafonal> gombafonalak = new ArrayList<>();
    /**
     * Létrehozza a {@code TektonFelszivodoFonalas} objektumot, amely örökli a {@code Tekton} alapfunkcióit.
     */
    public TektonFelszivodoFonalas() {
        super();
        System.out.println("TektonFelszivodoFonalas: TektonFelszivodoFonalas()");
    }
    /**
     * Hozzáad egy új {@code Gombafonal} objektumot a {@code gombafonalak} listához.
     *
     * @param gombafonal A hozzáadni kívánt {@code Gombafonal} objektum
     */
    public void addGombafonal (Gombafonal gombafonal) {
        gombafonalak.add(gombafonal);
    }
    /**
     * Ellenőrzi a gombafonalak állapotát. Ha a gombafonal hátralévő ideje elérte a nullát,
     * akkor elhal, különben csökkenti a hátralévő idejét.
     */
    public void FonalEllenorzes(){
        System.out.println("FonalEllenorzes: void FonalEllenorzes()");
        for(Gombafonal g : gombafonalak){
            if(g.getHatralevoIdo()==0){
                g.elhal();
            }else{
                g.setHatralevoIdo(g.getHatralevoIdo()-1);
            }
        }
    }

}
