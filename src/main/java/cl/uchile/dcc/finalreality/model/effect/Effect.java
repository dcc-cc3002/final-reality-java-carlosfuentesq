package cl.uchile.dcc.finalreality.model.effect;

import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.Mage;

public interface Effect {
  void apply(Mage self, GameCharacter target);
}
