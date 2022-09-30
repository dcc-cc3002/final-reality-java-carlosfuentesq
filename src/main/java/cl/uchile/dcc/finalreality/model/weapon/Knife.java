package cl.uchile.dcc.finalreality.model.weapon;

import org.jetbrains.annotations.NotNull;

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
    public Knife(final @NotNull String name, final int damage, final int weight) {
        super(name, damage, weight);
    }
}
