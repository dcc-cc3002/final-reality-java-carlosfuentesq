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




  private Weapon sword1;

  @Before
  public void setUp() throws InvalidStatValueException {




    sword1 = new Sword("Sword 1", 10, 5);
  }

  @Test
  public void testEquals() {
  }

  @Test
  public void testEquip() {
    /*
    knight1.equip(sword1);
    Weapon expected = new Sword("Sword 1", 10, 5);
    assertEquals(expected, knight1.getEquippedWeapon());
     */
  }

  @Test
  public void testMage() throws InvalidStatValueException {
    /*
    int expected1 = 20;
    int expected2 = 25;
    int expected3 = 10;
    assertEquals(expected1, blackMage2.getCurrentMp());
    assertEquals(expected2, whiteMage2.getCurrentMp());
    assertEquals(blackMage2.getCurrentMp(), blackMage2.getMaxMp());
    blackMage2.setCurrentMp(10);
    assertEquals(expected3, blackMage2.getCurrentMp());
    */
  }

  @Test
  public void testToString() {
  }
}