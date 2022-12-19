package cl.uchile.dcc.finalreality.model.character.player;

import cl.uchile.dcc.finalreality.exceptions.InvalidStatValueException;
import cl.uchile.dcc.finalreality.model.character.GameCharacter;
import cl.uchile.dcc.finalreality.model.magic.Magic;
import org.jetbrains.annotations.NotNull;

/**
 * A {@link PlayerCharacter} that can use {@link Magic}.
 */
public interface Mage extends PlayerCharacter {
  /** Uses a {@link Magic} over a target {@link GameCharacter}.
   *
   * @param magic the {@link Magic} to be used
   * @param target the character to be attacked
   */
  void useMagic(@NotNull Magic magic, @NotNull GameCharacter target)
      throws InvalidStatValueException;

  /**
   * Returns the current MP of the character.
   */
  int getCurrentMp();

  /**
   * Sets the current MP of the character to {@code newMp}.
   */
  void setCurrentMp(final int newMp) throws InvalidStatValueException;

  /**
   * Returns the max MP of the character.
   */
  int getMaxMp();
}
