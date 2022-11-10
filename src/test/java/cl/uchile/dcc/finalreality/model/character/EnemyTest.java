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
  private GameCharacter knight1;

  @Before
  public void setUp() throws InvalidStatValueException {
    BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
    enemy1 = new Enemy("Enemy 1",10,20,15,queue);
    enemy2 = new Enemy("Enemy 2",10,20,15,queue);
    knight1 = new Knight("Knight 1", 30, 5, queue);
  }

  @Test
  public void getWeight() {
  }

  @Test
  public void waitTurn() {
  }

  @Test
  public void testEquals() {
  }
}