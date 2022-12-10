package cl.uchile.dcc.finalreality.model.character.player;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.weapon.Knife;
import cl.uchile.dcc.finalreality.model.weapon.Staff;
import cl.uchile.dcc.finalreality.model.weapon.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import static org.junit.Assert.*;

public class WhiteMageTest {
  private PlayerCharacter whiteMage1;
  private PlayerCharacter whiteMage2;
  private PlayerCharacter whiteMage3;
  private PlayerCharacter blackMage1;

  @Before
  public void setUp() throws InvalidStatValueException {
    BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
    whiteMage1 = new WhiteMage("White Mage 1", 12, 20, 25, queue);
    whiteMage2 = new WhiteMage("White Mage 2", 12, 18, 25, queue);
    whiteMage3 = new WhiteMage("White Mage 1", 12, 20, 25, queue);
    blackMage1 = new BlackMage("Black Mage 1", 10, 17, 20, queue);
  }

  @Test
  public void testEquip() {
    Weapon expected = new Staff("Staff 1", 6, 5, magicDamage);
    whiteMage1.equip(new Staff("Staff 1", 6, 5, magicDamage));
    assertEquals(expected, whiteMage1.getEquippedWeapon());
    whiteMage1.equip(new Knife("Knife 1", 3, 1));
    assertEquals(expected, whiteMage1.getEquippedWeapon());
  }

  @Test
  public void testEquals() {
    assertEquals(whiteMage1, whiteMage1);
    assertNotEquals(whiteMage1, whiteMage2);
    assertEquals(whiteMage1, whiteMage3);
    assertNotEquals(whiteMage1, blackMage1);
  }

  @Test
  public void testToString() {
    String expected = "WhiteMage{currentMp=25, maxMp=25, maxHp=12, defense=18, name='White Mage 2'}";
    assertEquals(expected, whiteMage2.toString());
  }
}