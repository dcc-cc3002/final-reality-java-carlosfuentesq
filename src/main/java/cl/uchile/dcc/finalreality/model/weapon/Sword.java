package cl.uchile.dcc.finalreality.model.weapon;

import cl.uchile.dcc.finalreality.model.character.player.PlayerCharacter;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/** A {@link Weapon} that can be equipped by {@code Knight}s
 *  and {@code Thief}s.
 */
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
  public Sword(final @NotNull String name, final int damage, final int weight) {
    super(name, damage, weight);
  }

  @Override
  public void equipTo(PlayerCharacter playerCharacter) {
    playerCharacter.equipSword(this);
  }

  @Override
  public String toString() {
    return "Sword{name='%s', damage=%d, weight=%d}"
        .formatted(name, damage, weight);
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof final Sword that)) {
      return false;
    }
    return hashCode() == that.hashCode()
        && damage == that.damage
        && weight == that.weight
        && name.equals(that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Sword.class, name, damage, weight);
  }
}
