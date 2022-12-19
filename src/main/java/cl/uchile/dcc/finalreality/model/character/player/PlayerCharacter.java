package cl.uchile.dcc.finalreality.model.character.player;

/*
 * "Final Reality" (c) by R8V and CFQ
 * "Final Reality" is licensed under a
 * Creative Commons Attribution 4.0 International License.
 * You should have received a copy of the license along with this
 * work. If not, see <http://creativecommons.org/licenses/by/4.0/>.
 */

import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.weapon.Axe;
import cl.uchile.dcc.finalreality.model.weapon.Bow;
import cl.uchile.dcc.finalreality.model.weapon.Knife;
import cl.uchile.dcc.finalreality.model.weapon.Staff;
import cl.uchile.dcc.finalreality.model.weapon.Sword;
import cl.uchile.dcc.finalreality.model.weapon.Weapon;

/**
 * A {@link GameCharacter} that can equip a weapon.
 */
public interface PlayerCharacter extends GameCharacter {
  /**
   * Equips a {@link Weapon} to the character.
   */
  void equip(Weapon weapon);

  void equipAxe(Axe axe);

  void equipBow(Bow bow);

  void equipKnife(Knife knife);

  void equipStaff(Staff staff);

  void equipSword(Sword sword);

  /**
   * Return this character's equipped {@link Weapon}.
   */
  Weapon getEquippedWeapon();
}
