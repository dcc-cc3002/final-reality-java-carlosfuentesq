package cl.uchile.dcc.finalreality.model.weapon;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

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

  @Override
  public String toString() {
    return "Knife{name='%s', damage=%d, weight=%d}"
        .formatted(name, damage, weight);
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof final Knife that)) {
      return false;
    }
    return hashCode() == that.hashCode()
        && damage == that.damage
        && weight == that.weight
        && name.equals(that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Knife.class, name, damage, weight);
  }
}
