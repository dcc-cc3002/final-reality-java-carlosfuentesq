package cl.uchile.dcc.finalreality.model.character.player;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.weapon.*;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import static org.junit.Assert.*;

public class ThiefTest {
  private PlayerCharacter thief1;
  private PlayerCharacter thief2;
  private PlayerCharacter thief3;
  private PlayerCharacter knight1;

  @Before
  public void setUp() throws InvalidStatValueException {
    BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
    thief1 = new Thief("Thief 1", 20, 10, queue);
    thief2 = new Thief("Thief 2", 20, 8, queue);
    thief3 = new Thief("Thief 1", 20, 10, queue);
    knight1 = new Knight("Knight 1", 30, 5, queue);
  }

  @Test
  public void testEquip() {
    Weapon expected = new Bow("Bow 1", 7, 3);
    thief1.equip(new Bow("Bow 1", 7, 3));
    assertEquals(expected, thief1.getEquippedWeapon());
    expected = new Knife("Knife 1", 3, 1);
    thief1.equip(new Knife("Knife 1", 3, 1));
    assertEquals(expected, thief1.getEquippedWeapon());
    expected = new Sword("Sword 1", 7, 8);
    thief1.equip(new Sword("Sword 1", 7, 8));
    assertEquals(expected, thief1.getEquippedWeapon());
    thief1.equip(new Axe("Axe 1", 10, 5));
    assertEquals(expected, thief1.getEquippedWeapon());
  }

  @Test
  public void testEquals() {
    assertEquals(thief1, thief1);
    assertNotEquals(thief1, thief2);
    assertEquals(thief1, thief3);
    assertNotEquals(thief1, knight1);
  }

  @Test
  public void testToString() {
    String expected = "Thief{maxHp=20, defense=8, name='Thief 2'}";
    assertEquals(expected, thief2.toString());
  }
}