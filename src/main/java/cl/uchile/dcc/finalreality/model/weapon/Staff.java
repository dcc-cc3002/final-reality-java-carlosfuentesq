package cl.uchile.dcc.finalreality.model.weapon;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

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

  @Override
  public String toString() {
    return "Staff{name='%s', damage=%d, weight=%d}"
        .formatted(name, damage, weight);
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof final Staff that)) {
      return false;
    }
    return hashCode() == that.hashCode()
        && damage == that.damage
        && weight == that.weight
        && name.equals(that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Staff.class, name, damage, weight);
  }
}
