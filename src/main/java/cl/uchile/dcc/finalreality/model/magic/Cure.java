package cl.uchile.dcc.finalreality.model.magic;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import org.jetbrains.annotations.NotNull;

public class Cure extends AbstractWhiteMagic {
  protected Cure() {
    super(15);
  }

  @Override
  public void useOn(@NotNull GameCharacter target) throws InvalidStatValueException {
    int healing = (int) (0.3*target.getMaxHp());
    target.setCurrentHp(target.getCurrentHp() + healing);
  }
}
