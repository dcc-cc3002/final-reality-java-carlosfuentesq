package cl.uchile.dcc.finalreality.model.character.player;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.weapon.*;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import static org.junit.Assert.*;

public class EngineerTest {
  private PlayerCharacter engineer1;
  private PlayerCharacter engineer2;
  private PlayerCharacter thief1;

  @Before
  public void setUp() throws InvalidStatValueException {
    BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
    engineer1 = new Engineer("Engineer 1", 25, 10, queue);
    engineer2 = new Engineer("Engineer 1", 25, 10, queue);
    thief1 = new Thief("Thief 1", 20, 10, queue);
  }

  @Test
  public void testEquip() {
    Weapon expected = new Axe("Axe 1", 10, 5);
    engineer1.equip(new Axe("Axe 1", 10, 5));
    assertEquals(expected, engineer1.getEquippedWeapon());
    expected = new Bow("Bow 1", 7, 3);
    engineer1.equip(new Bow("Bow 1", 7, 3));
    assertEquals(expected, engineer1.getEquippedWeapon());
    engineer1.equip(new Staff("Staff 1", 6, 5));
    assertEquals(expected, engineer1.getEquippedWeapon());
  }

  @Test
  public void testToString() {
    String expected = "Engineer{maxHp=25, defense=10, name='Engineer 1'}";
    assertEquals(expected, engineer2.toString());
  }

  @Test
  public void testEquals() {
    assertEquals(engineer1, engineer1);
    assertEquals(engineer1, engineer2);
    assertNotEquals(engineer1, thief1);
  }
}