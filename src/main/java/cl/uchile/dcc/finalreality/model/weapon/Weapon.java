package cl.uchile.dcc.finalreality.model.weapon;

/**
 * This interface represents a weapon from the game.
 *
 * @author <a href="https://www.github.com/carlosfuentesq">CFQ</a>
 */
public interface Weapon {

  /**
   * Returns this weapon's name.
   */
  String getName();

  /**
   * Returns this weapon's damage.
   */
  int getDamage();

  /**
   * Returns this weapon's weight.
   */
  int getWeight();
}
