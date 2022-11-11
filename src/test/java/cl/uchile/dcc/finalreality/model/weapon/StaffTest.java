package cl.uchile.dcc.finalreality.model.weapon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StaffTest {
  private Weapon staff1;
  private Weapon staff2;
  private Weapon knife1;

  @Before
  public void setUp() {
    staff1 = new Staff("Staff 1", 6, 5);
    staff2 = new Staff("Staff 1", 5, 5);
    knife1 = new Knife("Knife 1", 3, 1);
  }

  @Test
  public void testToString() {
    String expected = "Staff{name='Staff 1', damage=5, weight=5}";
    assertEquals(expected, staff2.toString());
  }

  @Test
  public void testEquals() {
    assertEquals(staff1,staff1);
    assertNotEquals(staff1, staff2);
    assertNotEquals(staff1, knife1);
  }
}