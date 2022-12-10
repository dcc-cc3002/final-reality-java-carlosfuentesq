package cl.uchile.dcc.finalreality.model.weapon;

/**
 * A class that holds all the information of a weapon.
 *
 * @author <a href="https://www.github.com/r8vnhill">R8V</a>
 * @author <a href="https://www.github.com/carlosfuentesq">CFQ</a>
 */
public abstract class AbstractWeapon implements Weapon {

  protected final String name;
  protected final int damage;
  protected final int weight;

  /**
   * Creates a weapon with a name, a base damage, speed, and it's type.
   *
   * @param name
   *      the weapon's name
   * @param damage
   *      the weapon's damage
   * @param weight
   *      the weapon's weight
   */
  public AbstractWeapon(final String name, final int damage, final int weight) {
    this.name = name;
    this.damage = damage;
    this.weight = weight;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getDamage() {
    return damage;
  }

  @Override
  public int getMagicDamage() {
    return 0;
  }

  @Override
  public int getWeight() {
    return weight;
  }
}
