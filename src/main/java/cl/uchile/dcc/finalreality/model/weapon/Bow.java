package cl.uchile.dcc.finalreality.model.weapon;

public class Bow extends AbstractWeapon {
    /**
     * Creates a new Bow.
     *
     * @param name
     *     the weapon's name
     * @param damage
     *     the weapon's damage
     * @param weight
     *     the weapon's weight
     */
    public Bow(String name, int damage, int weight) {
        super(name, damage, weight);
    }
}
