package cl.uchile.dcc.finalreality.model.magic;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.PlayerCharacter;
import org.jetbrains.annotations.NotNull;

/**
 * A {@link Magic} that applies the poison effect to an opponent.
 */
public class Poison extends AbstractMagic {
  protected Poison() {
    super(40);
  }

  @Override
  public void use(@NotNull PlayerCharacter self, @NotNull GameCharacter target)
      throws InvalidStatValueException {
    // TODO: handle status effect
  }
}
