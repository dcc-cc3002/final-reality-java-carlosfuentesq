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
  private Enemy enemy4;
  private GameCharacter knight1;
  private BlockingQueue<GameCharacter> queue;

  @Before
  public void setUp() throws InvalidStatValueException {
    queue = new LinkedBlockingQueue<>();
    enemy1 = new Enemy("Enemy 1",7,10,20,15,queue);
    enemy2 = new Enemy("Enemy 2",10,15,25,10,queue);
    enemy3 = new Enemy("Enemy 1",7,10,20,15,queue);
    enemy4 = new Enemy("Enemy 4",12,15,25,10,queue);
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
    int expectedWeight = 20;
    assertEquals(expectedWeight, enemy4.getWeight());
  }

  @Test
  public void testWaitTurnAndToString() throws InterruptedException {
    enemy1.waitTurn();
    enemy2.waitTurn();
    enemy4.waitTurn();
    Thread.sleep(6000);
    String expected = "Enemy{name='Enemy 2', weight=15, maxHp=25, defense=10}";
    assertFalse(queue.isEmpty());
    assertEquals(expected, queue.poll().toString());
    expected = "Enemy{name='Enemy 1', weight=10, maxHp=20, defense=15}";
    assertFalse(queue.isEmpty());
    assertEquals(expected, queue.poll().toString());
    expected = "Enemy{name='Enemy 4', weight=20, maxHp=25, defense=10}";
    assertFalse(queue.isEmpty());
    assertEquals(expected, queue.poll().toString());
    assertTrue(queue.isEmpty());
  }

  @Test
  public void testEquals() {
    assertEquals(enemy1, enemy1);
    assertNotEquals(enemy1, enemy2);
    assertEquals(enemy1, enemy3);
    assertNotEquals(enemy1, knight1);
  }
}