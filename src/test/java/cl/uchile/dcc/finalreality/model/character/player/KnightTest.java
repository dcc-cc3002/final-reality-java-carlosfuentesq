package cl.uchile.dcc.finalreality.model.character.player;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.weapon.*;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import static org.junit.Assert.*;

public class KnightTest {
  private PlayerCharacter knight1;
  private PlayerCharacter knight2;
  private PlayerCharacter knight3;
  private PlayerCharacter engineer1;

  @Before
  public void setUp() throws InvalidStatValueException {
    BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
    knight1 = new Knight("Knight 1", 30, 5, queue);
    knight2 = new Knight("Knight 2", 30, 5, queue);
    knight3 = new Knight("Knight 1", 30, 5, queue);
    engineer1 = new Engineer("Engineer 1", 25, 10, queue);
  }

  @Test
  public void testEquip() {
    Weapon expected = new Axe("Axe 1", 10, 5);
    knight1.equip(new Axe("Axe 1", 10, 5));
    assertEquals(expected, knight1.getEquippedWeapon());
    expected = new Knife("Knife 1", 3, 1);
    knight1.equip(new Knife("Knife 1", 3, 1));
    assertEquals(expected, knight1.getEquippedWeapon());
    expected = new Sword("Sword 1", 7, 8);
    knight1.equip(new Sword("Sword 1", 7, 8));
    assertEquals(expected, knight1.getEquippedWeapon());
    knight1.equip(new Bow("Bow 1", 7, 3));
    assertEquals(expected, knight1.getEquippedWeapon());
  }

  @Test
  public void testToString() {
    String expected = "Knight{maxHp=30, defense=5, name='Knight 2'}";
    assertEquals(expected, knight2.toString());
  }

  @Test
  public void testEquals() {
    assertEquals(knight1, knight1);
    assertNotEquals(knight1, knight2);
    assertEquals(knight1, knight3);
    assertNotEquals(knight1, engineer1);
  }
}