import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.*;
import cl.uchile.dcc.finalreality.model.weapon.Sword;
import cl.uchile.dcc.finalreality.model.weapon.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import static org.junit.Assert.*;

public class PlayerCharacterTest {
  private PlayerCharacter engineer1;
  private PlayerCharacter engineer2;
  private PlayerCharacter knight1;
  private PlayerCharacter knight2;
  private PlayerCharacter thief1;
  private PlayerCharacter thief2;
  private BlackMage blackMage1;
  private BlackMage blackMage2;
  private WhiteMage whiteMage1;
  private WhiteMage whiteMage2;
  private Weapon sword1;

  @Before
  public void setUp() throws InvalidStatValueException {
    BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
    engineer1 = new Engineer("Engineer 1", 25, 10, queue);
    engineer2 = new Engineer("Engineer 1", 25, 10, queue);
    knight1 = new Knight("Knight 1", 30, 5, queue);
    knight2 = new Knight("Knight 2", 30, 5, queue);
    thief1 = new Thief("Thief 1", 20, 10, queue);
    thief2 = new Thief("Thief 2", 20, 8, queue);
    blackMage1 = new BlackMage("Black Mage 1", 10, 15, 20, queue);
    blackMage2 = new BlackMage("Black Mage 1", 10, 15, 15, queue);
    whiteMage1 = new WhiteMage("White Mage 1", 10, 15, 20, queue);
    whiteMage2 = new WhiteMage("White Mage 2", 8, 18, 25, queue);
    sword1 = new Sword("Sword 1", 10, 5);
  }

  @Test
  public void testEquals() {
    assertEquals(knight1,knight1);
    assertEquals(thief1,thief1);
    assertEquals(engineer1,engineer1);
    assertEquals(blackMage1,blackMage1);
    assertEquals(whiteMage1,whiteMage1);
    assertEquals(engineer1, engineer2);
    assertNotEquals(knight1,knight2);
    assertNotEquals(thief1,thief2);
    assertNotEquals(blackMage1,blackMage2);
    assertNotEquals(whiteMage1,whiteMage2);
    assertNotEquals(engineer1,thief2);
    assertNotEquals(engineer1,blackMage1);
    assertNotEquals(blackMage1,knight1);
    assertNotEquals(knight1,thief1);
    assertNotEquals(thief1,whiteMage1);
    assertNotEquals(whiteMage1,knight1);
  }

  @Test
  public void testEquip() {
    knight1.equip(sword1);
    Weapon expected = new Sword("Sword 1", 10, 5);
    assertEquals(expected,knight1.getEquippedWeapon());
  }

  @Test
  public void testMage() throws InvalidStatValueException {
    int expected1 = 15;
    int expected2 = 25;
    int expected3 = 10;
    assertEquals(expected1, blackMage2.getCurrentMp());
    assertEquals(expected2, whiteMage2.getCurrentMp());
    assertEquals(blackMage2.getCurrentMp(), blackMage2.getMaxMp());
    blackMage2.setCurrentMp(10);
    assertEquals(expected3, blackMage2.getCurrentMp());
  }

  @Test
  public void testToString() {
    String expected1 = "BlackMage{currentMp=15, maxMp=15, maxHp=10, defense=15, name='Black Mage 1'}";
    String expected2 = "Engineer{maxHp=25, defense=10, name='Engineer 1'}";
    String expected3 = "Knight{maxHp=30, defense=5, name='Knight 2'}";
    String expected4 = "Thief{maxHp=20, defense=8, name='Thief 2'}";
    String expected5 = "WhiteMage{currentMp=25, maxMp=25, maxHp=8, defense=18, name='White Mage 2'}";

    assertEquals(expected1, blackMage2.toString());
    assertEquals(expected2, engineer2.toString());
    assertEquals(expected3, knight2.toString());
    assertEquals(expected4, thief2.toString());
    assertEquals(expected5, whiteMage2.toString());
  }
}