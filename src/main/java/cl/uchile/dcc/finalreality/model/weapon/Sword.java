package cl.uchile.dcc.finalreality.model.weapon;

public class Sword extends Weapon{
    /**
     * Creates a new Sword.
     *
     * @param name
     *     the weapon's name
     * @param damage
     *     the weapon's damage
     * @param weight
     *     the weapon's weight
     * @param type
     */
    public Sword(String name, int damage, int weight, WeaponType type) {
        super(name, damage, weight, type);
    }
}
