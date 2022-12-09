package cl.uchile.dcc.finalreality.model.magic;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;

public class Fire extends AbstractBlackMagic {
  public Fire() {
    super(15);
  }

  @Override
  public void useOn(GameCharacter target) throws InvalidStatValueException {
    // TODO: handle status effect
  }
}
