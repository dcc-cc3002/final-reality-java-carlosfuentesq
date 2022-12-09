package cl.uchile.dcc.finalreality.model.magic;

public abstract class AbstractMagic implements Magic {
  private final int price;

  protected AbstractMagic(int price) {
    this.price = price;
  }

  public int getPrice() {
    return price;
  }
}
