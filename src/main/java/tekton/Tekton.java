package tekton;

import gamelogic.Targy;
import gamelogic.TargyTipus;

import java.util.*;

/**
 * A Tekton osztály a játékteretfelpítő terepet reprezentálja, amely több hatszögből áll.
 * Lehetőséget biztosít a kettétörésre és a szomszédok kezelésére.
 */
public class Tekton {
    /** A szomszédos Tekton példányok listája. */
    private List<Tekton> szomszedok = new ArrayList<>();

    /** Az adott Tektonhoz tartozó hatszögek listája. */
    private List<Hatszog> hatszogek = new ArrayList<>();

    /** Meghatározza, hogy nőhet-e gomba a Tektonon. */
    private boolean nohetGomba = true;

    /**
     * Alapértelmezett konstruktor, amely inicializálja a Tekton objektumot.
     */
    public Tekton() {
        System.out.println("Tekton: Tekton(List<Tekton> szomszedok, List<Hatszog> hatszogek)");
    }

    /**
     * Beállítja, hogy nőhet-e gomba a Tektonon.
     * @param nG igaz, ha nőhet gomba, hamis, ha nem.
     */
    public void setNohetGomba(boolean nG) {
        nohetGomba = nG;
    }

    /**
     * A Tekton kettétörését végzi el két részre, ha elegendő hatszög van hozzá.
     * Az egyik részt az eredeti Tekton tartalmazza, a másik egy új Tekton objektum lesz.
     * @return az újonnan létrehozott Tekton objektum, vagy null, ha nem osztható ketté.
     */
    public Tekton kettetores() {
        System.out.println("Tekton: int sporaszam()");
        if (hatszogek.size() < 2) {
            System.out.println("Tekton cannot be split further.");
            return null;
        }

        // Hatszögek két csoportra bontása
        Set<Hatszog> group1 = new HashSet<>();
        Set<Hatszog> group2 = new HashSet<>();

        Queue<Hatszog> queue = new LinkedList<>();
        Set<Hatszog> visited = new HashSet<>();

        // BFS-alapú bejárás
        queue.add(hatszogek.get(0));
        visited.add(hatszogek.get(0));

        while (!queue.isEmpty()) {
            Hatszog current = queue.poll();
            group1.add(current);

            for (Hatszog neighbor : current.getSzomszedok()) {
                if (hatszogek.contains(neighbor) && !visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }

            if (group1.size() >= hatszogek.size() / 2) break;
        }

        // Második csoport feltöltése
        for (Hatszog h : hatszogek) {
            if (!group1.contains(h)) {
                group2.add(h);
            }
        }

        // Az eredeti Tekton módosítása
        hatszogek.clear();
        hatszogek.addAll(group1);

        // Új Tekton létrehozása
        Tekton newTekton = new Tekton();
        newTekton.hatszogek.addAll(group2);

        for (Hatszog h : group2) {
            h.setTekton(newTekton);
        }

        // Szomszédok frissítése
        this.szomszedok.clear();
        newTekton.szomszedok.clear();

        for (Hatszog h : hatszogek) {
            for (Hatszog neighbor : h.getSzomszedok()) {
                if (neighbor.getTekton() != this && !this.szomszedok.contains(neighbor.getTekton())) {
                    this.szomszedok.add(neighbor.getTekton());
                }
            }
        }

        for (Hatszog h : newTekton.hatszogek) {
            for (Hatszog neighbor : h.getSzomszedok()) {
                if (neighbor.getTekton() != newTekton && !newTekton.szomszedok.contains(neighbor.getTekton())) {
                    newTekton.szomszedok.add(neighbor.getTekton());
                }
            }
        }

        this.szomszedok.add(newTekton);
        newTekton.szomszedok.add(this);

        System.out.println("Tekton split successfully.");
        return newTekton;
    }

    /**
     * Hatszögeket ad a Tektonhoz.
     * @param hatszog a hozzáadandó Hatszog tömb.
     */
    public void addHatszog(Hatszog[] hatszog) {
        hatszogek.addAll(Arrays.asList(hatszog));
    }

    /**
     * Kiírja a spóraszámot a konzolra.
     */
    public void sporaszam() {
        System.out.println("Tekton: int sporaszam()");
    }

    /**
     * Meghatározza, hogy a Tektonon lehet-e gomba.
     * @return igaz, ha lehet gomba, különben hamis.
     */
    public boolean lehetGomba() {
        System.out.println("Tekton: boolean lehetGomba()");
        return nohetGomba;
    }

    /**
     * Visszaadja az adott Tektonhoz tartozó hatszögeket.
     * @return a hatszögek listája.
     */
    public List<Hatszog> getHatszogek() {
        return hatszogek;
    }

    /**
     * Ellenőrzi, hogy az adott Tekton megoszt-e határt egy megadott hatszögcsoporttal.
     * @param t a vizsgált Tekton.
     * @param group a hatszögcsoport.
     * @return igaz, ha a Tekton határos a csoporttal, különben hamis.
     */
    private boolean sharesBorderWithGroup(Tekton t, Set<Hatszog> group) {
        for (Hatszog h : group) {
            for (Hatszog neighbor : h.getSzomszedok()) {
                if (neighbor.getTekton() == t) {
                    return true;
                }
            }
        }
        return false;
    }
}
