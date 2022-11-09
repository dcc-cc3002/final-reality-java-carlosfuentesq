package cl.uchile.dcc.finalreality.model.character.player;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import static org.junit.Assert.*;

public class KnightTest {
  private PlayerCharacter knight1;
  private PlayerCharacter knight2;
  private PlayerCharacter engineer1;

  @Before
  public void setUp() throws InvalidStatValueException {
    BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
    knight1 = new Knight("Knight 1", 30, 5, queue);
    knight2 = new Knight("Knight 2", 30, 5, queue);
    engineer1 = new Engineer("Engineer 1", 25, 10, queue);
  }

  @Test
  public void equipAxe() {
  }

  @Test
  public void equipKnife() {
  }

  @Test
  public void equipSword() {
  }

  @Test
  public void testToString() {
    String expected = "Knight{maxHp=30, defense=5, name='Knight 2'}";
    assertEquals(expected, knight2.toString());
  }

  @Test
  public void testEquals() {
    assertEquals(knight1, knight1);
    assertNotEquals(knight1, knight2);
    assertNotEquals(knight1, engineer1);
  }
}