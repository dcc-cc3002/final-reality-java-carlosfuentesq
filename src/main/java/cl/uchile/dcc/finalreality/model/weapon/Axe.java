package cl.uchile.dcc.finalreality.model.weapon;

public class Axe extends Weapon {
    /**
     * Creates a new Axe.
     *
     * @param name
     *     the weapon's name
     * @param damage
     *     the weapon's damage
     * @param weight
     *     the weapon's weight
     * @param type
     */
    public Axe(String name, int damage, int weight, WeaponType type) {
        super(name, damage, weight, type);
    }
}
