package cl.uchile.dcc.finalreality.model.magic;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.PlayerCharacter;
import org.jetbrains.annotations.NotNull;

public class Cure extends AbstractWhiteMagic {
  public Cure() {
    super(15);
  }

  @Override
  public void use(@NotNull PlayerCharacter self, @NotNull GameCharacter target)
      throws InvalidStatValueException {
    int healing = (int) (0.3*target.getMaxHp());
    target.setCurrentHp(target.getCurrentHp() + healing);
  }
}
