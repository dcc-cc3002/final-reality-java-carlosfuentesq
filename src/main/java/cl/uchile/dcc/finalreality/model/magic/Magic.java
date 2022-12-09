package cl.uchile.dcc.finalreality.model.magic;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;

public interface Magic {
  int getPrice();

  void useOn(GameCharacter target) throws InvalidStatValueException;
}
