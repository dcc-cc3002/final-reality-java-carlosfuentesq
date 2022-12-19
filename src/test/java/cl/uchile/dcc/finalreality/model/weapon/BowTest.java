package cl.uchile.dcc.finalreality.model.weapon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BowTest {
  private Weapon bow1;
  private Weapon bow2;
  private Weapon axe1;

  @Before
  public void setUp() {
    bow1 = new Bow("Bow 1", 7, 3);
    bow2 = new Bow("Bow 2", 9, 4);
    axe1 = new Axe("Axe 1", 10, 5);
  }

  @Test
  public void testToString() {
    String expected = "Bow{name='Bow 2', damage=9, weight=4}";
    assertEquals(expected, bow2.toString());
  }

  @Test
  public void testEquals() {
    assertEquals(bow1,bow1);
    assertNotEquals(bow1, bow2);
    assertNotEquals(bow1, axe1);
  }
}