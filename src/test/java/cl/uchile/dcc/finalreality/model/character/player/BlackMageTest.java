package cl.uchile.dcc.finalreality.model.character.player;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.weapon.Knife;
import cl.uchile.dcc.finalreality.model.weapon.Staff;
import cl.uchile.dcc.finalreality.model.weapon.Sword;
import cl.uchile.dcc.finalreality.model.weapon.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import static org.junit.Assert.*;

public class BlackMageTest {
  private PlayerCharacter blackMage1;
  private PlayerCharacter blackMage2;
  private BlackMage blackMage3;
  private PlayerCharacter whiteMage1;

  @Before
  public void setUp() throws InvalidStatValueException {
    BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
    blackMage1 = new BlackMage("Black Mage 1", 10, 17, 20, queue);
    blackMage2 = new BlackMage("Black Mage 2", 10, 17, 25, queue);
    blackMage3 = new BlackMage("Black Mage 1", 10, 17, 20, queue);
    whiteMage1 = new WhiteMage("White Mage 1", 12, 20, 25, queue);
  }

  @Test
  public void testEquip() {
    Weapon expected = new Knife("Knife 1", 3, 1);
    blackMage1.equip(new Knife("Knife 1", 3, 1));
    assertEquals(expected, blackMage1.getEquippedWeapon());
    expected = new Staff("Staff 1", 6, 5, magicDamage);
    blackMage1.equip(new Staff("Staff 1", 6, 5, magicDamage));
    assertEquals(expected, blackMage1.getEquippedWeapon());
    blackMage1.equip(new Sword("Sword 1", 7, 8));
    assertEquals(expected, blackMage1.getEquippedWeapon());
  }

  @Test
  public void testEquals() {
    assertEquals(blackMage1, blackMage1);
    assertNotEquals(blackMage1, whiteMage1);
    assertEquals(blackMage1, blackMage3);
    assertNotEquals(blackMage1, blackMage2);
  }

  @Test
  public void testToString() {
    String expected = "BlackMage{currentMp=25, maxMp=25, maxHp=10, defense=17, name='Black Mage 2'}";
    assertEquals(expected, blackMage2.toString());
  }

  @Test
  public void testGettersAndSetters() throws InvalidStatValueException {
    int expected = 20;
    assertEquals(expected, blackMage3.getCurrentMp());
    assertEquals(blackMage3.getCurrentMp(), blackMage3.getMaxMp());
    blackMage3.setCurrentMp(10);
    expected = 10;
    assertEquals(expected, blackMage3.getCurrentMp());
  }
}