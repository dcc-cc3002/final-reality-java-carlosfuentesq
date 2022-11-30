package cl.uchile.dcc.finalreality;

import cl.uchile.dcc.finalreality.model.character.Enemy;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.PlayerCharacter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class GameController {
  private BlockingQueue<GameCharacter> turnsQueue = new LinkedBlockingQueue<>();
  private List<PlayerCharacter> playerCharacters = new ArrayList<>();
  private List<Enemy> enemyCharacters = new ArrayList<>();

  public GameController() {
    createKnight();
    createEngineer();
    createBlackMage();

    createEnemy();
    createEnemy();

    for (PlayerCharacter playerCharacter : playerCharacters)
      playerCharacter.waitTurn();
    for (Enemy enemy : enemyCharacters)
      enemy.waitTurn();
  }
}
