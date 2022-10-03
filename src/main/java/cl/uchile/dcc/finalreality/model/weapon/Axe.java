package cl.uchile.dcc.finalreality.model.weapon;

import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/** A {@link Weapon} that can be equipped by {@code Knight}s
 *  and {@code Engineer}s.
 */
public class Axe extends AbstractWeapon {
  /**
   * Creates a new Axe.
   *
   * @param name
   *     the weapon's name
   * @param damage
   *     the weapon's damage
   * @param weight
   *     the weapon's weight
   */

  public Axe(final @NotNull String name, final int damage, final int weight) {
    super(name, damage, weight);
  }

  @Override
  public String toString() {
    return "Axe{name='%s', damage=%d, weight=%d}"
        .formatted(name, damage, weight);
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof final Axe that)) {
      return false;
    }
    return hashCode() == that.hashCode()
        && damage == that.damage
        && weight == that.weight
        && name.equals(that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Axe.class, name, damage, weight);
  }
}
