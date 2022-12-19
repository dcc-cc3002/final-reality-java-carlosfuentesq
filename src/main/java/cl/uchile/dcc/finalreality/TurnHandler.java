package cl.uchile.dcc.finalreality;

import cl.uchile.dcc.finalreality.model.character.Enemy;
import cl.uchile.dcc.finalreality.model.character.player.Mage;
import cl.uchile.dcc.finalreality.model.effect.CompositeEffect;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import org.jetbrains.annotations.NotNull;

public class TurnHandler implements PropertyChangeListener {
  private final CompositeEffect compositeEffect;
  private final Mage attacker;

  public TurnHandler(Mage attacker, CompositeEffect compositeEffect) {
    this.compositeEffect = compositeEffect;
    this.attacker = attacker;
  }

  @Override
  public void propertyChange(@NotNull PropertyChangeEvent evt) {
    compositeEffect.apply(attacker, (Enemy) evt.getNewValue());
  }
}
