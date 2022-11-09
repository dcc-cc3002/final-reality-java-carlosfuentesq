package cl.uchile.dcc.finalreality.model.character.player;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import static org.junit.Assert.*;

public class BlackMageTest {
  private PlayerCharacter blackMage1;
  private PlayerCharacter blackMage2;
  private PlayerCharacter whiteMage1;

  @Before
  public void setUp() throws InvalidStatValueException {
    BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
    blackMage1 = new BlackMage("Black Mage 1", 10, 17, 20, queue);
    blackMage2 = new BlackMage("Black Mage 2", 10, 17, 25, queue);
    whiteMage1 = new WhiteMage("White Mage 1", 12, 20, 25, queue);
  }

  @Test
  public void equipKnife() {
  }

  @Test
  public void equipStaff() {
  }

  @Test
  public void testEquals() {
    assertEquals(blackMage1, blackMage1);
    assertNotEquals(blackMage1, whiteMage1);
    assertNotEquals(blackMage1, blackMage2);
  }

  @Test
  public void testToString() {
    String expected = "BlackMage{currentMp=20, maxMp=20, maxHp=10, defense=17, name='Black Mage 2'}";
    assertEquals(expected, blackMage2.toString());
  }
}