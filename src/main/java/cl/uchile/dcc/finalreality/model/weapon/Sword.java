package cl.uchile.dcc.finalreality.model.weapon;

public class Sword extends AbstractWeapon {
    /**
     * Creates a new Sword.
     *
     * @param name
     *     the weapon's name
     * @param damage
     *     the weapon's damage
     * @param weight
     *     the weapon's weight
     */
    public Sword(String name, int damage, int weight) {
        super(name, damage, weight);
    }
}
