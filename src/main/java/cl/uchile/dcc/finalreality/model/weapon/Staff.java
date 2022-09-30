package cl.uchile.dcc.finalreality.model.weapon;

import org.jetbrains.annotations.NotNull;

public class Staff extends AbstractWeapon {
    /**
     * Creates a new Staff.
     *
     * @param name
     *     the weapon's name
     * @param damage
     *     the weapon's damage
     * @param weight
     *     the weapon's weight
     */
    public Staff(final @NotNull String name, final int damage, final int weight) {
        super(name, damage, weight);
    }
}
