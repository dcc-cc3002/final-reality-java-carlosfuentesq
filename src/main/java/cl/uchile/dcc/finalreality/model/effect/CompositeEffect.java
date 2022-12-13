package cl.uchile.dcc.finalreality.model.effect;

import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.Mage;

public class CompositeEffect implements Effect {
  private final Effect[] effects;

  public CompositeEffect(Effect[] effects) {
    this.effects = effects;
  }

  @Override
  public void apply(Mage self, GameCharacter target) {
    for (Effect effect : effects) {
      effect.apply(self, target);
    }
  }
}
