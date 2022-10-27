package cl.uchile.dcc.finalreality.model.character.player;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
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
  private PlayerCharacter blackMage1;
  private PlayerCharacter blackMage2;
  private PlayerCharacter whiteMage1;
  private PlayerCharacter whiteMage2;
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
    assertEquals(engineer1, engineer2);
    assertEquals(knight1,knight1);
    assertNotEquals(knight1,knight2);
    assertNotEquals(thief1,thief2);
    assertNotEquals(blackMage1,blackMage2);
    assertNotEquals(whiteMage1,whiteMage2);
    assertNotEquals(whiteMage1,blackMage1);
    assertNotEquals(engineer1,thief2);
  }

  @Test
  public void testEquip() {
    knight1.equip(sword1);
    Weapon expected = new Sword("Sword 1", 10, 5);
    assertEquals(expected,knight1.getEquippedWeapon());
  }
}