package cl.uchile.dcc.finalreality.model.magic;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.PlayerCharacter;
import org.jetbrains.annotations.NotNull;

public class Poison extends AbstractWhiteMagic {
  protected Poison() {
    super(40);
  }

  @Override
  public void use(@NotNull PlayerCharacter self, @NotNull GameCharacter target)
      throws InvalidStatValueException {
    // TODO: handle status effect
  }
}
