package interfacek;

import tekton.Hatszog;
/**
 * Az {@code ILerakhato} interface olyan objektumokat definiál, amelyek képesek
 * lerakódni egy {@link Hatszog} típusú helyre a játéktéren.
 *
 * Azokat az osztályokat kell implementálniuk, amelyek az {@code lerak} metódust
 * megvalósítják, hogy a megfelelő helyen elhelyezhessék őket.
 */
public interface ILerakhato {
    /**
     * Lerakja az objektumot a megadott {@code Hatszog} pozícióra.
     *
     * @param h A {@link Hatszog} típusú objektum, amely a helyet reprezentálja,
     *          ahol az objektumot le kell rakni.
     */
    void lerak(Hatszog h);
}
