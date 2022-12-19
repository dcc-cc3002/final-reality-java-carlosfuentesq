package cl.uchile.dcc.finalreality.model.weapon;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KnifeTest {
  private Weapon knife1;
  private Weapon knife2;
  private Weapon bow1;

  @Before
  public void setUp() {
    knife1 = new Knife("Knife 1", 3, 1);
    knife2 = new Knife("Knife 2", 3, 1);
    bow1 = new Bow("Bow 1", 7, 3);
  }

  @Test
  public void testToString() {
    String expected = "Knife{name='Knife 2', damage=3, weight=1}";
    assertEquals(expected, knife2.toString());
  }

  @Test
  public void testEquals() {
    assertEquals(knife1,knife1);
    assertNotEquals(knife1, knife2);
    assertNotEquals(knife1, bow1);
  }
}