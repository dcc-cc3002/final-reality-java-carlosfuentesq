package cl.uchile.dcc.finalreality.model.magic;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.Mage;
import cl.uchile.dcc.finalreality.model.character.player.PlayerCharacter;
import org.jetbrains.annotations.NotNull;

/**
 * This interface represents a magic from the game. Can only be used by mages.
 *
 * @author <a href="https://www.github.com/carlosfuentesq">CFQ</a>
 */
public interface Magic {
  int getPrice();

  void use(@NotNull Mage self, @NotNull GameCharacter target)
      throws InvalidStatValueException;
}
