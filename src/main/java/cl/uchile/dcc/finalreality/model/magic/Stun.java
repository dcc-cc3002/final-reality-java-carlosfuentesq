package cl.uchile.dcc.finalreality.model.magic;

import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.Mage;
import cl.uchile.dcc.finalreality.model.effect.Effect;
import cl.uchile.dcc.finalreality.model.effect.Paralysis;
import org.jetbrains.annotations.NotNull;

/**
 * A {@link Magic} that applies the paralysis effect to an opponent when used.
 */
public class Stun extends AbstractMagic {
  protected Stun() {
    super(25);
  }

  @Override
  public void use(@NotNull Mage self, @NotNull GameCharacter target) {
    Effect effect = new Paralysis();
    effect.apply(self, target);
  }
}
