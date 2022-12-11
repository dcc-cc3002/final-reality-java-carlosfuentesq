package cl.uchile.dcc.finalreality.model.magic;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.PlayerCharacter;
import org.jetbrains.annotations.NotNull;

/**
  * A {@link Magic} that restores to an ally 30% of its maximum HP.
  *
  * @author <a href="https://www.github.com/carlosfuentesq">CFQ</a>
  */
public class Cure extends AbstractMagic {
  public Cure() {
    super(15);
  }

  @Override
  public void use(@NotNull PlayerCharacter self, @NotNull GameCharacter target)
      throws InvalidStatValueException {
    int healing = (int) (0.3 * target.getMaxHp());
    target.setCurrentHp(target.getCurrentHp() + healing);
  }
}
