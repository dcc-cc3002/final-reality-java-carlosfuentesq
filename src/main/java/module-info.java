module finalreality.main {
  requires javafx.controls;
  requires org.jetbrains.annotations;
  requires org.apache.commons.lang3;
  requires junit;
  requires java.desktop;
  exports cl.uchile.dcc.finalreality.model.weapon;
  exports cl.uchile.dcc.finalreality.model.magic;
  exports cl.uchile.dcc.finalreality.model.character;
  exports cl.uchile.dcc.finalreality.model.character.player;
  exports cl.uchile.dcc.finalreality.exceptions;
}