package cl.uchile.dcc.finalreality.model.magic;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.Mage;
import cl.uchile.dcc.finalreality.model.effect.Burning;
import cl.uchile.dcc.finalreality.model.effect.Effect;
import java.util.Random;
import org.jetbrains.annotations.NotNull;

/**
 * A {@link Magic} that reduces the opponent's HP an amount equal to
 * {@code magicDamage}, where {@code magicDamage} is the attacker's current equipped weapon
 * magical damage.
 *
 * <p>It has a 20% chance to apply the burn effect to the target when used.
 *
 * @author <a href="https://www.github.com/carlosfuentesq">CFQ</a>
 */
public class Fire extends AbstractMagic {
  public Fire() {
    super(15);
  }

  @Override
  public void use(@NotNull Mage self, @NotNull GameCharacter target)
      throws InvalidStatValueException {
    target.setCurrentHp(target.getCurrentHp() - self.getEquippedWeapon().getMagicDamage());
    Random rnd = new Random();
    if (rnd.nextInt(10) < 2) {
      Effect effect = new Burning();
      effect.apply(self, target);
    }
  }
}
