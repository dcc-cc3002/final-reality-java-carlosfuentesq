package cl.uchile.dcc.finalreality.model.weapon;

public class Knife extends AbstractWeapon {
    /**
     * Creates a new Knife.
     *
     * @param name
     *     the weapon's name
     * @param damage
     *     the weapon's damage
     * @param weight
     *     the weapon's weight
     */
    public Knife(String name, int damage, int weight) {
        super(name, damage, weight);
    }
}
