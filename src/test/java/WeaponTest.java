import cl.uchile.dcc.finalreality.model.weapon.*;
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
    assertEquals(axe1,axe1);
    assertEquals(bow1,bow1);
    assertEquals(knife1,knife1);
    assertEquals(staff1,staff1);
    assertEquals(sword1,sword1);

    assertEquals(knife1, knife2);
    assertNotEquals(bow1, bow2);
    assertNotEquals(axe1, axe2);
    assertNotEquals(staff1, staff2);
    assertNotEquals(sword1, sword2);

    assertNotEquals(bow1, axe1);
    assertNotEquals(sword1, staff1);
    assertNotEquals(staff1, knife1);
    assertNotEquals(knife1, bow1);
    assertNotEquals(axe1, staff1);

  }

  @Test
  public void testGetters() {
    String expected1 = "Knife 1";
    int expected2 = 3;
    int expected3 = 1;
    assertEquals(expected1, knife1.getName());
    assertEquals(expected2, knife1.getDamage());
    assertEquals(expected3, knife1.getWeight());

    String expected4 = "Axe 1";
    int expected5 = 10;
    int expected6 = 5;
    assertEquals(expected4, axe1.getName());
    assertEquals(expected5, axe1.getDamage());
    assertEquals(expected6, axe1.getWeight());

    String expected7 = "Bow 1";
    int expected8 = 7;
    int expected9 = 3;
    assertEquals(expected7, bow1.getName());
    assertEquals(expected8, bow1.getDamage());
    assertEquals(expected9, bow1.getWeight());

    String expected10 = "Staff 1";
    int expected11 = 6;
    int expected12 = 5;
    assertEquals(expected10, staff1.getName());
    assertEquals(expected11, staff1.getDamage());
    assertEquals(expected12, staff1.getWeight());

    String expected13 = "Sword 1";
    int expected14 = 8;
    int expected15 = 6;
    assertEquals(expected13, sword1.getName());
    assertEquals(expected14, sword1.getDamage());
    assertEquals(expected15, sword1.getWeight());
  }

  @Test
  public void testToString() {
    String expected1 = "Axe{name='Axe 2', damage=10, weight=5}";
    String expected2 = "Bow{name='Bow 2', damage=9, weight=4}";
    String expected3 = "Knife{name='Knife 1', damage=3, weight=1}";
    String expected4 = "Staff{name='Staff 1', damage=5, weight=5}";
    String expected5 = "Sword{name='Sword 2', damage=9, weight=5}";

    assertEquals(expected1, axe2.toString());
    assertEquals(expected2, bow2.toString());
    assertEquals(expected3, knife2.toString());
    assertEquals(expected4, staff2.toString());
    assertEquals(expected5, sword2.toString());
  }
}