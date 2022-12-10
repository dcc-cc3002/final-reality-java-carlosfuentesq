package cl.uchile.dcc.finalreality.model.weapon;

import cl.uchile.dcc.finalreality.model.character.player.PlayerCharacter;

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

  int getMagicDamage();

  void equipTo(PlayerCharacter playerCharacter);
}
