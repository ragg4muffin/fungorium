package interfacek;

import tekton.Hatszog;
/**
 * Az {@code IMozgathato} interface olyan objektumokat definiál, amelyek képesek
 * mozogni a játéktér egy adott helyén.
 *
 * Azokat az osztályokat kell implementálniuk, amelyek rendelkeznek a mozgást
 * megvalósító {@code mozog} metódussal, amely a játéktéren történő
 * elmozdulásért felelős.
 */
public interface IMozgathato {
    /**
     * Elvégzi az objektum mozgását a játéktéren. A mozgás konkrét mechanizmusát
     * az implementáló osztály határozza meg.
     */
    void mozog();
}

