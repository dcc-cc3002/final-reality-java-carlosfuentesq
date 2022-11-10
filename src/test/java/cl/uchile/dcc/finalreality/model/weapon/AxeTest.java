package cl.uchile.dcc.finalreality.model.weapon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AxeTest {
  private Weapon axe1;
  private Weapon axe2;
  private Weapon staff1;

  @Before
  public void setUp() {
    axe1 = new Axe("Axe 1", 10, 5);
    axe2 = new Axe("Axe 2", 10, 5);
    staff1 = new Staff("Staff 1", 6, 5);
  }

  @Test
  public void testGetters() {
    String expectedName = "Axe 1";
    int expectedDamage = 10;
    int expectedWeight = 5;
    assertEquals(expectedName, axe1.getName());
    assertEquals(expectedDamage, axe1.getDamage());
    assertEquals(expectedWeight, axe1.getWeight());
  }

  @Test
  public void testToString() {
    String expected = "Axe{name='Axe 2', damage=10, weight=5}";
    assertEquals(expected, axe2.toString());
  }

  @Test
  public void testEquals() {
    assertEquals(axe1,axe1);
    assertNotEquals(axe1, axe2);
    assertNotEquals(axe1, staff1);
  }
}