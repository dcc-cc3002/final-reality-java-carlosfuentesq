package cl.uchile.dcc.finalreality.model.magic;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.PlayerCharacter;
import org.jetbrains.annotations.NotNull;

/**
 * A {@link Magic} that reduces the opponent's HP an amount equal to
 * {@code magicDamage}, where {@code magicDamage} is the attacker's current equipped weapon
 * magical damage.
 *
 * <p>It has a 30% chance to apply the paralysis effect to the target when used.
 *
 * @author <a href="https://www.github.com/carlosfuentesq">CFQ</a>
 */
public class Thunder extends AbstractMagic {
  public Thunder() {
    super(15);
  }

  @Override
  public void use(@NotNull PlayerCharacter self, @NotNull GameCharacter target)
      throws InvalidStatValueException {
    target.setCurrentHp(target.getCurrentHp() - self.getEquippedWeapon().getMagicDamage());
    // TODO: handle status effect
  }
}
