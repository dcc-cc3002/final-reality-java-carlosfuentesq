package cl.uchile.dcc.finalreality;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.Enemy;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.*;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class GameController {
  private final BlockingQueue<GameCharacter> turnsQueue = new LinkedBlockingQueue<>();
  private final List<PlayerCharacter> playerCharacters = new ArrayList<>();
  private final List<Enemy> enemyCharacters = new ArrayList<>();

  public GameController() {
    createKnight();
    createEngineer();
    createBlackMage();

    createEnemy();
    createEnemy();

    for (PlayerCharacter playerCharacter : playerCharacters)
      waitTurn(playerCharacter);
    for (Enemy enemy : enemyCharacters)
      waitTurn(enemy);
  }
  public void createBlackMage(String name, int maxHp, int defense, int maxMp)
      throws InvalidStatValueException {
    playerCharacters.add(new BlackMage(name, maxHp, defense, maxMp, turnsQueue));
  }

  public void createEngineer(String name, int maxHp, int defense)
      throws InvalidStatValueException {
    playerCharacters.add(new Engineer(name, maxHp, defense, turnsQueue));
  }

  public void createKnight(String name, int maxHp, int defense)
      throws InvalidStatValueException {
    playerCharacters.add(new Knight(name, maxHp, defense, turnsQueue));
  }

  public void createThief(String name, int maxHp, int defense)
      throws InvalidStatValueException {
    playerCharacters.add(new Thief(name, maxHp, defense, turnsQueue));
  }

  public void createWhiteMage(String name, int maxHp, int defense, int maxMp)
      throws InvalidStatValueException {
    playerCharacters.add(new WhiteMage(name, maxHp, defense, maxMp, turnsQueue));
  }

  public void createEnemy(String name, int weight, int maxHp, int defense)
      throws InvalidStatValueException {
    enemyCharacters.add(new Enemy(name, weight, maxHp, defense, turnsQueue));
  }

  public void attack(@NotNull GameCharacter attacker, GameCharacter target)
      throws InvalidStatValueException {
    attacker.attack(target);
  }

  public void useMagic(@NotNull GameCharacter attacker, GameCharacter target) {
    attacker.useMagicOn(target);
  }

  public void waitTurn(@NotNull GameCharacter character) {
    character.waitTurn();
  }

  public void onPlayerWin() {
    if (enemyCharacters.isEmpty()) System.out.println("Player wins!");
  }

  public void onEnemyWin() {
    if (playerCharacters.isEmpty()) System.out.println("Enemy wins!");
  }
}
