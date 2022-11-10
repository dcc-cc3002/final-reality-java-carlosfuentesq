package cl.uchile.dcc.finalreality.model.character;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.player.Knight;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import static org.junit.Assert.*;

public class EnemyTest {
  private GameCharacter enemy1;
  private GameCharacter enemy2;
  private GameCharacter enemy3;
  private GameCharacter knight1;

  @Before
  public void setUp() throws InvalidStatValueException {
    BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
    enemy1 = new Enemy("Enemy 1",10,20,15,queue);
    enemy2 = new Enemy("Enemy 2",15,25,10,queue);
    enemy3 = new Enemy("Enemy 1",10,20,15,queue);
    knight1 = new Knight("Knight 1", 30, 5, queue);
  }

  @Test
  public void testGettersAndSetters() throws InvalidStatValueException {
    String expectedName = "Enemy 2";
    assertEquals(expectedName, enemy2.getName());
    int expectedHp = 25;
    assertEquals(expectedHp, enemy2.getCurrentHp());
    assertEquals(enemy2.getCurrentHp(), enemy2.getMaxHp());
    enemy2.setCurrentHp(15);
    expectedHp = 15;
    assertEquals(expectedHp, enemy2.getCurrentHp());
    int expectedDefense = 10;
    assertEquals(expectedDefense, enemy2.getDefense());
  }

  @Test
  public void waitTurn() {
  }

  @Test
  public void testEquals() {
    assertEquals(enemy1, enemy1);
    assertNotEquals(enemy1, enemy2);
    assertEquals(enemy1, enemy3);
    assertNotEquals(enemy1, knight1);
  }
}