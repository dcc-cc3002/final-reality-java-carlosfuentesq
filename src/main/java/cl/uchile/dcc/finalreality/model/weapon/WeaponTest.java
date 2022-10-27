package cl.uchile.dcc.finalreality.model.weapon;
import org.junit.*;
import static org.junit.Assert.*;

public class WeaponTest {
  private Weapon axe1;
  private Weapon axe2;
  private Weapon bow1;
  private Weapon bow2;
  private Weapon knife1;
  private Weapon knife2;
  private Weapon staff1;
  private Weapon staff2;
  private Weapon sword1;
  private Weapon sword2;

  @Before
  public void setUp() {
    axe1 = new Axe("Axe 1", 10, 5);
    axe2 = new Axe("Axe 2", 10, 5);
    bow1 = new Bow("Bow 1", 7, 3);
    bow2 = new Bow("Bow 2", 9, 4);
    knife1 = new Knife("Knife 1", 3, 1);
    knife2 = new Knife("Knife 1", 3, 1);
    staff1 = new Staff("Staff 1", 6, 5);
    staff2 = new Staff("Staff 1", 5, 5);
    sword1 = new Sword("Sword 1", 8, 6);
    sword2 = new Sword("Sword 2", 9, 5);
  }

  @Test
  public void testEquals() {
    assertEquals(knife1, knife2);
    assertNotEquals(bow1, bow2);
    assertNotEquals(axe1, axe2);
    assertNotEquals(staff1, staff2);
    assertNotEquals(sword1, sword2);
  }
}