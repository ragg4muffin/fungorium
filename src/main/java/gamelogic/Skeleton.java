package gamelogic;

import tekton.*;
import gombasz.*;
import rovarasz.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Szkeleton osztály, amely a program futtatásához szükséges objektumokat példányosítja és elindítja a számításokat.
 */
public class Skeleton {

    ArrayList<Rovarasz> rovaraszok = new ArrayList<>();

    public Skeleton() {
        System.out.println("Skeleton started");
        // Switch-case a konzolos kiválasztáshoz
        Scanner scanner = new Scanner(System.in);
        System.out.println("Válassz egy aktort:");
        System.out.println("1. Gombasz");
        System.out.println("2. Rovarasz");
        System.out.println("3. Game Logic");
        int actorChoice = scanner.nextInt();

        switch (actorChoice) {
            case 1:
                System.out.println("Válassz egy use-case-t:");
                System.out.println("1. Gombafonal növesztése");
                System.out.println("2. Spóra kilövése");
                System.out.println("3. Gomba növesztése, ahol még nincs gomba");
                System.out.println("4. Gomba növesztése, ahol már van gomba");
                System.out.println("5. Gomba növesztése TektonGombatlan-on");
                System.out.println("6. TektonEgyFonalas ütközése második fonallal");
                int gombaszChoice = scanner.nextInt();

                switch (gombaszChoice) {
                    case 1:
                        Hatszog h0 = new Hatszog();
                        Hatszog h1 = new Hatszog();
                        Gombatest test1 = new Gombatest(h0);
                        System.out.println("Tekton ellenőrzések.");
                        test1.gombafonalNovesztes(h1);

                        break;

                    case 2:
                        Tekton t2 = new Tekton();
                        Hatszog h2 = new Hatszog();
                        Hatszog h22 = new Hatszog();
                        Gombatest test2 = new Gombatest(h2);
                        test2.setSporaszam(6);
                        if(test2.tudLoni()) {
                            test2.sporaLoves();
                            Spora spora = new GyorsitoSpora(h22);
                        }
                        break;

                    case 3:
                        Tekton t3 = new Tekton();
                        Hatszog h3 = new Hatszog();
                        Gombafonal fonal1 = new Gombafonal(h3);
                        if(t3.lehetGomba())
                            fonal1.gombatestNovesztes();
                        break;

                    case 4:
                        Tekton t4 = new Tekton();
                        Hatszog h4 = new Hatszog();
                        Gombafonal fonal2 = new Gombafonal(h4);
                        t4.setNohetGomba(false); //Mert van már a tektonon gombatest.

                        if(t4.lehetGomba()) {
                            fonal2.gombatestNovesztes();
                        }else{
                            System.out.println("Van már gomba!\n");
                        }
                        break;

                    case 5:
                        TektonGombatlan tg = new TektonGombatlan();
                        Hatszog h5 = new Hatszog();
                        Gombafonal fonal3 = new Gombafonal(h5);
                        if(tg.lehetGomba()) {
                            fonal3.gombatestNovesztes();
                        }else{
                            System.out.println("Gombatlan tekton.\n");
                        }
                        break;

                    case 6:
                        TektonEgyFonalas tef = new TektonEgyFonalas();
                        Hatszog h6 = new Hatszog();
                        Hatszog h7 = new Hatszog();
                        System.out.println("Itt az új fonal növesztése sikertelen lesz az ellenőrzések után(nincs még implementálva.)");


                        break;

                    default:
                        System.out.println("Érvénytelen választás.");
                        break;
                }
                break;

            case 2:
                System.out.println("Válassz egy use-case-t:");
                System.out.println("1. Fonal vágása");
                System.out.println("2. Rovar mozgás");
                System.out.println("3. Rovar spóraevése");
                int rovaraszChoice = scanner.nextInt();

                /// Példa rovarász létrehozása
                Rovarasz rovarasz = new Rovarasz("r1", new Rovar(new Hatszog()));

                switch (rovaraszChoice) {
                    case 1:
                    rovarasz.rovaraszVagas();
                        break;
                    case 2:
                    rovarasz.rovaraszMozog();
                        break;
                    case 3:
                    rovarasz.rovaraszEves();
                        break;
                    default:
                        System.out.println("Érvénytelen választás.");
                        break;
                }
                break;

            case 3:
                System.out.println("Válassz egy use-case-t:");
                System.out.println("1. Tekton kettétörése");
                System.out.println("2. Gombafonal felszívódása TektonFelszivodoFonalas-on");
                System.out.println("3. Gomba elhalása");
                int gameLogicChoice = scanner.nextInt();

                switch (gameLogicChoice) {
                    case 1:
                        ArrayList<Tekton> tektonok = TektonPrep();
                        tektonok.get(1).kettetores();
                        break;
                    case 2:
                        ArrayList<TektonFelszivodoFonalas> felszivTekton= TektonFelszivodoFonalasPrep();
                        Gombafonal f= new Gombafonal(felszivTekton.get(1).getHatszogek().get(1));
                        f.setHatralevoIdo(1);
                        felszivTekton.get(1).addGombafonal(f);
                        felszivTekton.get(1).FonalEllenorzes();
                        felszivTekton.get(1).FonalEllenorzes();
                        break;
                    case 3:
                        Gombatest gombatest = new Gombatest(new Hatszog());
                        gombatest.setHatralevo_loves(1);
                        gombatest.sporaLoves();
                        break;
                    default:
                        System.out.println("Érvénytelen választás.");
                        break;
                }
                break;

            default:
                System.out.println("Érvénytelen választás.");
                break;
        }

        scanner.close();
    }

    private ArrayList<Tekton> TektonPrep(){
        Tekton t1 = new Tekton();
        Tekton t2 = new Tekton();
        Hatszog h1 = new Hatszog();
        Hatszog h2 = new Hatszog();
        Hatszog h3 = new Hatszog();
        Hatszog h4 = new Hatszog();
        Hatszog h5 = new Hatszog();
        Hatszog h6 = new Hatszog();
        h1.setTekton(t1);
        h2.setTekton(t1);
        h3.setTekton(t2);
        h4.setTekton(t2);
        h5.setTekton(t2);
        h6.setTekton(t2);

        h1.addSzomszedok(new Hatszog[]{h2, h4});
        h2.addSzomszedok(new Hatszog[]{h1, h3, h4, h5});
        h3.addSzomszedok(new Hatszog[]{h2, h5, h6});
        h4.addSzomszedok(new Hatszog[]{h1, h2, h5});
        h5.addSzomszedok(new Hatszog[]{h2, h3, h4, h6});
        h6.addSzomszedok(new Hatszog[]{h3, h6});
        t1.addHatszog(new Hatszog[]{h1, h2});
        t2.addHatszog(new Hatszog[]{h3, h4, h5, h6});

        ArrayList<Tekton> Tektonok = new ArrayList<>();
        Tektonok.add(t1);
        Tektonok.add(t2);
        return Tektonok;
    }

    private ArrayList<TektonFelszivodoFonalas> TektonFelszivodoFonalasPrep(){
        TektonFelszivodoFonalas t1 = new TektonFelszivodoFonalas();
        TektonFelszivodoFonalas t2 = new TektonFelszivodoFonalas();
        Hatszog h1 = new Hatszog();
        Hatszog h2 = new Hatszog();
        Hatszog h3 = new Hatszog();
        Hatszog h4 = new Hatszog();
        Hatszog h5 = new Hatszog();
        Hatszog h6 = new Hatszog();
        h1.setTekton(t1);
        h2.setTekton(t1);
        h3.setTekton(t2);
        h4.setTekton(t2);
        h5.setTekton(t2);
        h6.setTekton(t2);

        h1.addSzomszedok(new Hatszog[]{h2, h4});
        h2.addSzomszedok(new Hatszog[]{h1, h3, h4, h5});
        h3.addSzomszedok(new Hatszog[]{h2, h5, h6});
        h4.addSzomszedok(new Hatszog[]{h1, h2, h5});
        h5.addSzomszedok(new Hatszog[]{h2, h3, h4, h6});
        h6.addSzomszedok(new Hatszog[]{h3, h6});
        t1.addHatszog(new Hatszog[]{h1, h2});
        t2.addHatszog(new Hatszog[]{h3, h4, h5, h6});

        ArrayList<TektonFelszivodoFonalas> Tektonok = new ArrayList<>();
        Tektonok.add(t1);
        Tektonok.add(t2);
        return Tektonok;
    }


}




