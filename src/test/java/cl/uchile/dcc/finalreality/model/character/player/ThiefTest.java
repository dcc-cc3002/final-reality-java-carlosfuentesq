package cl.uchile.dcc.finalreality.model.character.player;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import static org.junit.Assert.*;

public class ThiefTest {
  private PlayerCharacter thief1;
  private PlayerCharacter thief2;
  private PlayerCharacter knight1;

  @Before
  public void setUp() throws InvalidStatValueException {
    BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
    thief1 = new Thief("Thief 1", 20, 10, queue);
    thief2 = new Thief("Thief 2", 20, 8, queue);
    knight1 = new Knight("Knight 1", 30, 5, queue);
  }

  @Test
  public void equipSword() {
  }

  @Test
  public void equipKnife() {
  }

  @Test
  public void equipBow() {
  }

  @Test
  public void testEquals() {
    assertEquals(thief1, thief1);
    assertNotEquals(thief1, thief2);
    assertNotEquals(thief1, knight1);
  }

  @Test
  public void testToString() {
    String expected = "Thief{maxHp=20, defense=8, name='Thief 2'}";
    assertEquals(expected, thief2.toString());
  }
}