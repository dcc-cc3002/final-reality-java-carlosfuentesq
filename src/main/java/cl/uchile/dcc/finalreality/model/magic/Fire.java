package cl.uchile.dcc.finalreality.model.magic;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.PlayerCharacter;
import org.jetbrains.annotations.NotNull;

public class Fire extends AbstractBlackMagic {
  public Fire() {
    super(15);
  }

  @Override
  public void use(@NotNull PlayerCharacter self, @NotNull GameCharacter target)
      throws InvalidStatValueException {
    target.setCurrentHp(target.getCurrentHp() - self.getEquippedWeapon().getMagicDamage());
    // TODO: handle status effect
  }
}
