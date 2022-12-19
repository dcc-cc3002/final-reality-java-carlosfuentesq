package cl.uchile.dcc.finalreality.model.magic;

import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.Mage;
import cl.uchile.dcc.finalreality.model.effect.Effect;
import cl.uchile.dcc.finalreality.model.effect.Poisoning;
import org.jetbrains.annotations.NotNull;

/**
 * A {@link Magic} that applies the poison effect to an opponent.
 */
public class Poison extends AbstractMagic {
  protected Poison() {
    super(40);
  }

  @Override
  public void use(@NotNull Mage self, @NotNull GameCharacter target) {
    Effect effect = new Poisoning();
    effect.apply(self, target);
  }
}
