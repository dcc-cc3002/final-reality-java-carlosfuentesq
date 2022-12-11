package cl.uchile.dcc.finalreality.model.character.player;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.exceptions.Require;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.magic.Magic;
import java.util.concurrent.BlockingQueue;
import org.jetbrains.annotations.NotNull;

/**
 * An abstract class that holds the common behavior of a mage character.
 *
 * <p>Mage characters are {@link PlayerCharacter}s with a current amount of <i>mana points</i>
 * ({@code currentMp}) and a maximum amount of <i>mana points</i> ({@code maxMp}).
 *
 * @author <a href="https://www.github.com/carlosfuentesq">CFQ</a>
 */
public abstract class AbstractMage extends AbstractPlayerCharacter implements Mage {

  protected int currentMp;
  protected final int maxMp;

  /**
   * Creates a new character.
   * This constructor is <b>protected</b>, because it'll only be used by subclasses.
   *
   * @param name       the character's name
   * @param maxHp      the character's max hp
   * @param defense    the character's defense
   * @param maxMp      the character's max mp
   * @param turnsQueue the queue with the characters waiting for their turn
   */
  protected AbstractMage(final @NotNull String name, final int maxHp, final int defense,
      int maxMp, final @NotNull BlockingQueue<GameCharacter> turnsQueue)
      throws InvalidStatValueException {
    super(name, maxHp, defense, turnsQueue);
    Require.statValueAtLeast(0, maxMp, "Max MP");
    this.maxMp = maxMp;
    this.currentMp = maxMp;
  }

  @Override
  public void useMagic(@NotNull Magic magic, @NotNull GameCharacter target)
      throws InvalidStatValueException {
    this.currentMp -= magic.getPrice();
    magic.use(this, target);
  }

  @Override
  public int getCurrentMp() {
    return currentMp;
  }

  @Override
  public void setCurrentMp(final int newMp) throws InvalidStatValueException {
    Require.statValueAtLeast(0, newMp, "Current MP");
    Require.statValueAtMost(maxMp, newMp, "Current MP");
    this.currentMp = newMp;
  }

  public int getMaxMp() {
    return maxMp;
  }
}
