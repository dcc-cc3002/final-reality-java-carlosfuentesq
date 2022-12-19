package cl.uchile.dcc.finalreality.model.magic;

import cl.uchile.dcc.finalreality.model.character.player.BlackMage;
import cl.uchile.dcc.finalreality.model.character.player.WhiteMage;

/**
 * An abstract class that holds the common behavior and attributes of a magic.
 *
 * <p>Magic can be used by {@link WhiteMage} and {@link BlackMage}
 *
 * @author <a href="https://www.github.com/carlosfuentesq">CFQ</a>
 */
public abstract class AbstractMagic implements Magic {
  private final int price;

  protected AbstractMagic(int price) {
    this.price = price;
  }

  public int getPrice() {
    return price;
  }
}
