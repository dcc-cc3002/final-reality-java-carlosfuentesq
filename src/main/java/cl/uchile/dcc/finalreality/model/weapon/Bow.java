package cl.uchile.dcc.finalreality.model.weapon;

public class Bow extends Weapon {
    /**
     * Creates a new Bow.
     *
     * @param name
     *     the weapon's name
     * @param damage
     *     the weapon's damage
     * @param weight
     *     the weapon's weight
     * @param type
     */
    public Bow(String name, int damage, int weight, WeaponType type) {
        super(name, damage, weight, type);
    }
}
