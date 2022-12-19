package cl.uchile.dcc.finalreality.model.weapon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwordTest {
  private Weapon sword1;
  private Weapon sword2;
  private Weapon staff1;

  @Before
  public void setUp() {
    sword1 = new Sword("Sword 1", 8, 6);
    sword2 = new Sword("Sword 2", 9, 5);
    staff1 = new Staff("Staff 1", 6, 5, magicDamage);
  }

  @Test
  public void testToString() {
    String expected = "Sword{name='Sword 2', damage=9, weight=5}";
    assertEquals(expected, sword2.toString());
  }

  @Test
  public void testEquals() {
    assertEquals(sword1,sword1);
    assertNotEquals(sword1, sword2);
    assertNotEquals(sword1, staff1);
  }
}