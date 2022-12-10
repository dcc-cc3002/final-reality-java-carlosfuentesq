package cl.uchile.dcc.finalreality.model.magic;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import org.jetbrains.annotations.NotNull;

public abstract class AbstractWhiteMagic extends AbstractMagic {
  protected AbstractWhiteMagic(int price) {
    super(price);
  }

}
