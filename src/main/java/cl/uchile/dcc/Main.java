package cl.uchile.dcc;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.Enemy;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.character.player.BlackMage;
import cl.uchile.dcc.finalreality.model.character.player.Engineer;
import cl.uchile.dcc.finalreality.model.character.player.Knight;
import cl.uchile.dcc.finalreality.model.character.player.Thief;
import cl.uchile.dcc.finalreality.model.character.player.WhiteMage;
import cl.uchile.dcc.finalreality.model.weapon.Knife;
import cl.uchile.dcc.finalreality.model.weapon.Sword;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/** A class to test the classes of this project and its methods.
 *
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 * @author <a href="https://www.github.com/carlosfuentesq">CFQ</a>
 */

public class Main {

  /** The main class of the project. */
  public static void main(String[] args)
      throws InterruptedException, InvalidStatValueException {

    // region Tests of the turns implementation
    System.out.println("---------- Turns test ----------");

    BlockingQueue<GameCharacter> queue = new LinkedBlockingQueue<>();
    Random rng = new Random();
    for (int i = 0; i < 10; i++) {
      // Gives a random speed to each character to generate different waiting times
      var weapon = new Knife("", 0, rng.nextInt(50));
      var character = new Thief(Integer.toString(i), 10, 10, queue);
      character.equip(weapon);
      character.waitTurn();
    }
    // Waits for 6 seconds to ensure that all characters have finished waiting
    Thread.sleep(6000);
    while (!queue.isEmpty()) {
      // Pops and prints the names of the characters of the queue to illustrate the turns
      // order, this tests the character's toString method
      System.out.println(queue.poll().toString());
    }
    // endregion

    // region Tests of the player characters implementation
    System.out.println("---------- Player characters test ----------");

    final Engineer engineer1 = new Engineer("Engineer 1", 25, 10, queue);
    final Knight knight1 = new Knight("Knight 1", 30, 5, queue);
    final Thief thief1 = new Thief("Thief 1", 20, 10, queue);
    final BlackMage blackMage1 = new BlackMage("Black Mage 1", 10, 15,
        20, queue);
    final WhiteMage whiteMage1 = new WhiteMage("White Mage 1", 10, 15,
        20, queue);

    // Testing common character's attributes
    System.out.println("engineer1's name: " + engineer1.getName());
    System.out.println("engineer1's max HP: " + engineer1.getMaxHp());
    System.out.println("engineer1's current HP: " + engineer1.getCurrentHp());
    System.out.println("engineer1's defense: " + engineer1.getDefense());
    engineer1.setCurrentHp(10);
    System.out.println("engineer1's current HP after setting it to 10: "
        + engineer1.getCurrentHp() + "\n");

    // Testing weapon equipment. This also tests weapon's toString method
    Sword knightSword = new Sword("Knight 1's sword", 5, 10);
    knight1.equip(knightSword);
    System.out.println("knight1's equipped weapon: "
        + knight1.getEquippedWeapon().toString() + "\n");

    // Testing attributes of a mage character
    System.out.println("blackMage1's max MP: " + blackMage1.getMaxMp());
    System.out.println("blackMage1's current MP: " + blackMage1.getCurrentMp());
    blackMage1.setCurrentMp(15);
    System.out.println("blackMage1's current MP after setting it to 15: "
        + blackMage1.getCurrentMp() + "\n");

    // Testing equals method
    Thief thief2 = new Thief("Thief 2", 50, 30, queue);
    System.out.println("thief1.equals(thief2): " + thief1.equals(thief2));

    WhiteMage whiteMage = new WhiteMage("White Mage 1", 10, 15,
        20, queue);
    System.out.println("whiteMage1.equals(whiteMage): " + whiteMage1.equals(whiteMage) + "\n");
    // endregion

    // region Tests of the enemies implementation
    System.out.println("---------- Enemies test ----------");

    Enemy enemy = new Enemy("Enemy 1", 25, 60, 30, queue);
    Enemy enemy1 = new Enemy("Enemy 1", 25, 60, 30, queue);
    Enemy enemy2 = new Enemy("Enemy 2", 30, 50, 35, queue);

    System.out.println("enemy1's weight: " + enemy1.getWeight());
    System.out.println("enemy1.equals(enemy): " + enemy1.equals(enemy));
    System.out.println("enemy1.equals(enemy2): " + enemy1.equals(enemy2) + "\n");
    // endregion

    // region Tests of the weapon's implementation
    System.out.println("---------- Weapons test ----------");

    Sword sword1 = new Sword("Sword 1", 7, 5);
    Sword sword = new Sword("Sword 1", 7, 5);
    System.out.println("sword1's name: " + sword1.getName());
    System.out.println("sword1's damage: " + sword1.getDamage());
    System.out.println("sword1's weight: " + sword1.getWeight());
    System.out.println("sword1.equals(knightSword): " + sword1.equals(knightSword));
    System.out.println("sword1.equals(sword): " + sword1.equals(sword));
    // endregion
  }
}
