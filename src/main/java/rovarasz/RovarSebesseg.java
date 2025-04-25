package rovarasz;

/**
 * Az enum típus, amely a rovar sebességi kategóriáit reprezentálja.
 * Az enum különböző sebességi szinteket tartalmaz, például ROKKANT, LASSU, NORMAL és GYORS,
 * mindegyikhez egy numerikus értéket rendel.
 */
enum RovarSebesseg {
    ROKKANT(0),
    LASSU(1),
    NORMAL(2),
    GYORS(3);

    private final int value;

    /**
     * Konstruktor, amely a sebesség értékét állítja be.
     *
     * @param value A sebesség numerikus értéke.
     */
    RovarSebesseg(int value) {
        this.value = value;
    }

    /**
     * Visszaadja a sebesség értékét.
     *
     * @return A sebesség numerikus értéke.
     */
    public int getValue() {
        System.out.println("RovarSebesseg: int getValue()");
        return value;
    }
}
